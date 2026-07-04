package Models;

import java.util.HashMap;
import java.util.List;

public  class FamilyBook {
    private  HashMap<String, Member> book;

    public FamilyBook(){
        book = new HashMap<>();
    }

    public Member getMember(String name) {
        if ( book.containsKey(name) ) {
            return book.get(name);
        } else {
            return null;
        }
    }

    public boolean isAvail(String name) {
        if ( book.containsKey(name) ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addMember(String name, Member member) {
        if ( book.containsKey(name) ) {
            System.out.println("MEMBER WITH THAT NAME ALREADY IN BOOK");
            return false;
        } else {
            book.put(name,member);
            return true;
        }
    }




}
