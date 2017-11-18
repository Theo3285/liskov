package com.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;

/*
 * Fixed the violation but introce an OCP violation. Add a new shape requires a new statement
 * look for instanceOf code smell
 * Whenever you have an if statement that implements particular behavior according to object type
 * there is an LSP violation smell. Another would be a partial implementation of the class with a method throwing
 * an exception for instance.
 */
public class CalculateAreaShouldReturn {

    @Test
    public void sixFor2x3Rectangle() {
        Rectangle aRectangle = new Rectangle(2, 3);
        assertEquals(6, aRectangle.area());
    }

    @Test
    public void nineFor3x3Square() {
        Square aSquare = new Square(3);
        assertEquals(9, aSquare.area());
    }

    @Test
    public void twentyFor4x5RectangleFromSquare() {
        List<Shape> shapes = Arrays.asList(
            new Rectangle(4,5),
            new Square(3)
        );

        List<Integer> areas = new ArrayList<Integer>();
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                areas.add(((Rectangle) shape).area());
            }
            if (shape instanceof Square) {
                areas.add(((Square) shape).area());
            }
        }
        assertThat(20, is(areas.get(0)));
        assertThat(9, is(areas.get(1)));
    }
}
