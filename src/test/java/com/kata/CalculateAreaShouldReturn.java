package com.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;

/*
 * look for instanceOf code smell
 * Whenever you have an if statement that implements particular behavior according to object type
 * there is an LSP violation smell. Another one would be a partial implementation of the class with a method throwing
 * an exception for instance.
 * Fix : Implement full abstraction and ask shapes to calculate their area.
 */
public class CalculateAreaShouldReturn {

    @Test
    public void sixFor2x3Rectangle() {
        Shape aRectangle = new Rectangle(2, 3);
        assertEquals(6, aRectangle.area());
    }

    @Test
    public void nineFor3x3Square() {
        Shape aSquare = new Square(3);
        assertEquals(9, aSquare.area());
    }

    @Test
    public void twentyFor4x5RectangleFromSquareAnd3x3Square() {
        List<Shape> shapes = Arrays.asList(
            new Rectangle(4,5),
            new Square(3)
        );

        List<Integer> areas = new ArrayList<Integer>();
        for (Shape shape : shapes) {
            areas.add(shape.area());
        }
        assertThat(20, is(areas.get(0)));
        assertThat(9, is(areas.get(1)));
    }
}
