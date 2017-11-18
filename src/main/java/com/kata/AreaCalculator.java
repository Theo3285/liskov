package com.kata;

public class AreaCalculator {

    public static int calculateArea(Rectangle aRectangle) {
        return aRectangle.getHeight() * aRectangle.getWidth();
    }

    public static int calculateArea(Square aSquare) {
        return aSquare.getHeight() * aSquare.getHeight();
    }
}
