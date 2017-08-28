package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String args[]){
        Forum theForum = new Forum();
        System.out.println(" ");
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()

        .filter(forumUser -> forumUser.getSex() == 'M')
        .filter(forumUser -> forumUser.getBirthDate().getYear() > 20)
        .filter(forumUser -> forumUser.getNumberOfPublishedPost() > 0)
                .collect(Collectors.toMap(ForumUser:: getPeselId, user -> user));

        System.out.println("# elements: "  +theResultMapOfForumUsers.size() );
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);





    }
}
