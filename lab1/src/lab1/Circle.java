package lab1;

/**
 * Circle class extending Shape.
 * Has a radius attribute, along with the number of sides (0 for circle).
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructor to initialize a Circle.
     * @param radius the radius of the circle.
     */
    public Circle(double radius) {
        super(0);  // Circle has no sides, so sides = 0
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the area of the circle.
     * @return the area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * toString method to display details of the Circle.
     */
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + getArea() + 
               ", sides=" + getSides() + "]";
    }
}
