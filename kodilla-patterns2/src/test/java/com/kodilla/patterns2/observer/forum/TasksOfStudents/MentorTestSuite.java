package com.kodilla.patterns2.observer.forum.TasksOfStudents;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksOfStudents task1 = new TasksOfStudents("Observer  1");
        TasksOfStudents task2 = new TasksOfStudents("Observer  2");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor monicaSmith = new Mentor("Monica Smith");
        task1.registerObserver(johnSmith);
        task1.registerObserver(monicaSmith);
        task2.registerObserver(johnSmith);
        //When
        task1.addTask("task 1");
        task1.addTask("task 2");
        task1.addTask("task 3");
        task2.addTask("task 1");
        task2.addTask("task 2");
        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(3, monicaSmith.getUpdateCount());
    }

}