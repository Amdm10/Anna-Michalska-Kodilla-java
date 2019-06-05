package com.kodilla.stream.com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1,"Ala123", 'F', 1970,8,12,3));
        theForumUserList.add(new ForumUser(2,"Kasia", 'F', 1988,5,2,1));
        theForumUserList.add(new ForumUser(3,"Xyz", 'M', 2000,4,22,30));
        theForumUserList.add(new ForumUser(4,"Olo99", 'M', 1990,1,4,2));
        theForumUserList.add(new ForumUser(5,"Abcd2", 'F', 1985,11,6,0));
        theForumUserList.add(new ForumUser(6,"Karooool", 'M', 1989,10,29,0));
        theForumUserList.add(new ForumUser(7,"IguniaW", 'F', 2001,8,30,5));
        theForumUserList.add(new ForumUser(8,"Hulk", 'M', 2000,9,4,7));
        theForumUserList.add(new ForumUser(9,"kriskam", 'M', 1990,2,6,1));
        theForumUserList.add(new ForumUser(10,"niunio", 'M', 1995,2,7,6));
        theForumUserList.add(new ForumUser(11,"Maslana", 'M', 1993,3,1,0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
