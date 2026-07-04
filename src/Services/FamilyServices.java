package Services;

import Enums.Gender;

import java.util.List;

public interface FamilyServices {
    void addNewMember(String name, Gender gender, String fatherName, String motherName);
    List<String> matchFinder( String name );
}
