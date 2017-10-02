package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Shopping","Milk",2.20);
            case PAINTING:
                return new PaintingTask("Painting","White","Room");
            case DRIVING:
                return new DrivingTask("Driving","Street Avenue","Taxi");
                default:
                    return null;
        }
    }
}
