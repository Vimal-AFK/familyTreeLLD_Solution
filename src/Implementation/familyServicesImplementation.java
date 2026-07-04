package Implementation;

import Enums.Gender;
import Models.FamilyBook;
import Models.Member;
import Services.FamilyServices;

import java.util.ArrayList;
import java.util.List;

public class familyServicesImplementation implements FamilyServices {

    private final FamilyBook familyBook;

    public familyServicesImplementation() {
        familyBook = new FamilyBook();
    }

    @Override
    public void addNewMember(String name, Gender gender, String fatherName, String motherName) {

        if (familyBook.isAvail(name)) {
            System.out.println("MEMBER ALREADY EXISTS");
            return;
        }

        Member father;
        Member mother;

        if (familyBook.isAvail(fatherName)) {
            father = familyBook.getMember(fatherName);
        } else {
            father = new Member(fatherName, Gender.MALE, null, null);
            familyBook.addMember(fatherName, father);
        }

        if (familyBook.isAvail(motherName)) {
            mother = familyBook.getMember(motherName);
        } else {
            mother = new Member(motherName, Gender.FEMALE, null, null);
            familyBook.addMember(motherName, mother);
        }

        Member newMember = new Member(name, gender, father, mother);

        familyBook.addMember(name, newMember);

        father.addChild(newMember);
        mother.addChild(newMember);
    }

    @Override
    public List<String> matchFinder(String name) {

        List<String> matches = new ArrayList<>();
        System.out.println("GoT into for "+name);

        if (!familyBook.isAvail(name)) {
            System.out.println("MEMBER NOT FOUND");
            return matches;
        }

        Member member = familyBook.getMember(name);

        if (member.getFather() == null ||
                member.getMother() == null ||
                member.getFather().getFather() == null ||
                member.getMother().getFather() == null) {
            return matches;
        }

        Gender requiredGender =
                member.getGender() == Gender.MALE
                        ? Gender.FEMALE
                        : Gender.MALE;

        Member paternalGrandFather = member.getFather().getFather();

        for (Member aunt : paternalGrandFather.getChildern()) {

            if (aunt == member.getFather())
                continue;

            if (aunt.getGender() == Gender.FEMALE) {

                for (Member child : aunt.getChildern()) {

                    if (child.getGender() == requiredGender) {
                        matches.add(child.getName());
                    }
                }
            }
        }

        Member maternalGrandFather = member.getMother().getFather();

        for (Member uncle : maternalGrandFather.getChildern()) {

            if (uncle == member.getMother())
                continue;

            if (uncle.getGender() == Gender.MALE) {

                for (Member child : uncle.getChildern()) {

                    if (child.getGender() == requiredGender) {
                        matches.add(child.getName());
                    }
                }
            }
        }
        if ( matches.size() == 0 ) System.out.println("NO MATCHES FOUND");
        return matches;
    }
}