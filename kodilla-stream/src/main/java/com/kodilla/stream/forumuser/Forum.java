package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1234, "John", 'M', LocalDate.of(1990, 10, 24), 25));
        usersList.add(new ForumUser(1235, "Eve", 'F', LocalDate.of(1992, 01, 30), 38));
        usersList.add(new ForumUser(1234, "Melany", 'F', LocalDate.of(1983, 05, 13), 100));
        usersList.add(new ForumUser(1236, "Edd", 'M', LocalDate.of(1890, 01, 04), 49));
        usersList.add(new ForumUser(1237, "Margaret", 'F', LocalDate.of(1982, 05, 18), 124));
        usersList.add(new ForumUser(1238, "Richard", 'M', LocalDate.of(1986, 04, 30), 222));
        usersList.add(new ForumUser(1239, "Ann", 'F', LocalDate.of(1997, 12, 07), 189));
        usersList.add(new ForumUser(1240, "Tom", 'M', LocalDate.of(1980, 12, 31), 423));
        usersList.add(new ForumUser(1241, "Marry", 'F', LocalDate.of(1982, 11, 03), 515));
        usersList.add(new ForumUser(1242, "Joana", 'F', LocalDate.of(1972, 11, 14), 79));


    }

    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);

    }
}
