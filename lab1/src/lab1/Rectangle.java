package lab1;
/**
 * Rectangle class extending Shape.
 * Has width and height attributes, along with the number of sides.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructor to initialize a Rectangle.
     * @param width the width of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(double width, double height) {
        super(4);  // Rectangle has 4 sides.
        this.width = width;
        this.height = height;
    }

    // Getter and Setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the area of the rectangle.
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * toString method to display details of the Rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + 
               ", area=" + getArea() + ", sides=" + getSides() + "]";
    }
}

