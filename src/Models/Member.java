package Models;

import Enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private Gender gender;
    private Member father;
    private Member mother;
    private List<Member> childern;

    public Member( String name, Gender gender, Member father, Member mother ) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.childern = new ArrayList<Member>();
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Member getFather() {
        return this.father;
    }

    public Member getMother(){
        return this.mother;
    }

    public List<Member> getChildern() {
        return this.childern;
    }

    public boolean addChild(Member child) {
        return this.childern.add(child);
    }

}
