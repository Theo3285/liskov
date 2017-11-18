package com.kata;

public class Rectangle extends Shape{

    int height;
    int width;

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public int area() {
        return height * width;
    }
}
