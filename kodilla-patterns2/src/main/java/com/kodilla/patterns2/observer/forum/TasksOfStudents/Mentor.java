package com.kodilla.patterns2.observer.forum.TasksOfStudents;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void upDate(TasksOfStudents tasksOfStudents) {
        System.out.println("Topic: " + tasksOfStudents.getName());
        System.out.println("Task number " + tasksOfStudents.getTasks().size() + " in queue");
        updateCount++;
    }
}

