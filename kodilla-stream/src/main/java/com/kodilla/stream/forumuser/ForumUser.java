package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {
    private final int peselId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPublishedPost;

    public ForumUser(int peselId, String userName,  char sex, LocalDate birthDate, int numberOfPublishedPost) {
        this.peselId = peselId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPublishedPost = numberOfPublishedPost;
    }

    public int getPeselId() {
        return peselId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;

    }

    public int getNumberOfPublishedPost() {
        return numberOfPublishedPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "peselId=" + peselId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPublishedPost=" + numberOfPublishedPost +
                '}';
    }
}



