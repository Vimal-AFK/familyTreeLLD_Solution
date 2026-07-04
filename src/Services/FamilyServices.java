package Services;

import Enums.Gender;
import Models.Member;

import java.util.List;

public interface FamilyServices {
    public void addNewMember(String name, Gender gender, String fatherName, String motherName);
    public List<String> matchFinder( String name );
}
