package com.kata;

/*
 * It should be possible to set the height and the width of a rectangle independently.
 * This extension violates that rule.
 */
public class Square extends Shape {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int area() {
        return sideLength * sideLength;
    }
}
