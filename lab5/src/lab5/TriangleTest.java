package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @DisplayName("Test that verifies Isosceles triangle.")
    @Test
    public void testIsIsosceles() {
        Triangle triangle = new Triangle(3, 3, 4);
        assertTrue(triangle.isIsosceles(), "Expected the triangle to be isosceles");

        triangle.setSides(4, 4, 4);
        assertFalse(triangle.isIsosceles(), "An equilateral triangle should not be isosceles");

        triangle.setSides(3, 4, 5);
        assertFalse(triangle.isIsosceles(), "A scalene triangle should not be isosceles");
    }

    @DisplayName("Test that verifies Equilateral triangle.")
    @Test
    public void testIsEquilateral() {
        Triangle triangle = new Triangle(5);
        assertTrue(triangle.isEquilateral(), "Expected the triangle to be equilateral");

        triangle.setSides(5, 5, 4);
        assertFalse(triangle.isEquilateral(), "Expected the triangle to not be equilateral");
    }

    @DisplayName("Test that verifies Scalene triangle.")
    @Test
    public void testIsScalene() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isScalene(), "Expected the triangle to be scalene");

        triangle.setSides(3, 3, 5);
        assertFalse(triangle.isScalene(), "Expected the triangle to not be scalene");
    }

    @DisplayName("Test that verifies to set sides.")
    @Test
    public void testSetSides() {
        Triangle triangle = new Triangle();
        triangle.setSides(-3, -4, -5);
        assertEquals(12, triangle.getPerimeter(), "Sides should be positive after setting negative values");
    }

    @DisplayName("Test that verifies to find perimeter.")
    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter(), "Expected perimeter to be 12");
    }

    @DisplayName("Test that verifies a negative value.")
    @Test
    public void testNegativeValues() {
        Triangle triangle = new Triangle(-3, -4, -5);
        assertEquals(12, triangle.getPerimeter(), "Negative sides should be converted to positive");
    }

    @DisplayName("Test that verifies to find bug in get perimeter.")
    @RepeatedTest(5)
    public void testBugInGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertNotEquals(11, triangle.getPerimeter(), "The method should correctly calculate the perimeter as 12");
    }
}
