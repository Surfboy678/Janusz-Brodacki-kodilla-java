package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isExecute;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
            this.isExecute = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecute;
    }
}
