import Enums.Gender;
import Implementation.familyServicesImplementation;
import Services.FamilyServices;

public class Main {
    public static void main(String[] args) {
        FamilyServices fs = new familyServicesImplementation();

        fs.addNewMember("Tom", Gender.MALE, "A", "B");
        fs.addNewMember("Mary", Gender.FEMALE, "A", "B");

        fs.addNewMember("Brad", Gender.MALE, "Tom", "Mary");
        fs.addNewMember("Emma", Gender.FEMALE, "Tom", "Mary");

        fs.addNewMember("David", Gender.MALE, "X", "Y");
        fs.addNewMember("Jenny", Gender.FEMALE, "X", "Y");

        fs.addNewMember("John", Gender.MALE, "Brad", "Lisa");
        fs.addNewMember("Alex", Gender.MALE, "John", "Jenny");

        fs.addNewMember("Steve", Gender.MALE, "David", "Emma");
        fs.addNewMember("Emily", Gender.FEMALE, "Steve", "Emma");
        fs.addNewMember("Rachel", Gender.FEMALE, "Steve", "Emma");


        System.out.println(fs.matchFinder("Alex"));
    }
}