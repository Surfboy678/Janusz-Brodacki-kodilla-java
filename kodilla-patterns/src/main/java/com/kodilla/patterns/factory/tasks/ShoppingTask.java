package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
            this.isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
