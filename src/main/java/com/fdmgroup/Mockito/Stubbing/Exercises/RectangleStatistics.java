package com.fdmgroup.Mockito.Stubbing.Exercises;

public class RectangleStatistics {
    public int calculateArea(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getLength();
    }

    public int calculateCircumference(Rectangle rectangle){
        return 2*(rectangle.getLength() + rectangle.getWidth());
    }
}
