package com.kata;

public class Square extends Rectangle {

    private int height;
    private int width;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.height = width;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
