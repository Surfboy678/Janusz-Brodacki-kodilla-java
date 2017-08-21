package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static double PI;
    private double radius;

    private Circle(double radius){
        this.radius = radius;
    }


    public String getShapeName() {
        return "circle";
    }

    public double getFieled() {
        return PI * Math.pow(this.radius, 2);
    }
}
