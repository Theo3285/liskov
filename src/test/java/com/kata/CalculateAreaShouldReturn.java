package com.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculateAreaShouldReturn {

    @Test
    public void sixFor2x3Rectangle() {
        Rectangle aRectangle = new Rectangle();
        aRectangle.setHeight(2);
        aRectangle.setWidth(3);
        assertEquals(6, AreaCalculator.calculateArea(aRectangle));
    }

    @Test
    public void nineFor3x3Square() {
        Rectangle aSquare = new Square();
        aSquare.setHeight(3);
        assertEquals(9, AreaCalculator.calculateArea(aSquare));
    }

    @Test
    public void twentyFor4x5RectangleFromSquare() {
        Rectangle aRectangle = new Square();
        aRectangle.setHeight(4);
        aRectangle.setWidth(5);
        assertEquals(20, AreaCalculator.calculateArea(aRectangle));
    }
}
