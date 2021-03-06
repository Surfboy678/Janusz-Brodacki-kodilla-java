package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        shapes.remove(shape);
        return true;

    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String shapeShow = null;
        for (Shape shape : shapes){
            shapeShow = shape.getShapeName();
        }
        return shapeShow;

    }
    public int getFiguresQuantity(){
        return shapes.size();
    }
}
