package lab1;
/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * Shows good use of Javadoc comments, annotations, visibility scope, modifiers, and class hierarchies.
 * Class marked as 'abstract' since it is not designed to be instantiated directly.
 * 
 * @author bivek
 */
public abstract class Shape {
    /**
     * The number of sides within the shape.
     * Uses ‘private’ visibility modifier. Could use ‘protected’ so it can be accessed by sub-classes.
     */
    private int sides;

    /**
     * Constructor.
     * @param sides the number of sides within the shape.
     */
    public Shape(int sides) {
        this.sides = sides;
    }

    /**
     * Gets the number of sides within the shape.
     * @return the number of sides within the shape.
     */
    public int getSides() {
        return sides;
    }

    /**
     * Sets the number of sides within the shape.
     * @param sides the number of sides within the shape.
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Gets the size of the shape's area.
     * Abstract method to be implemented by subclasses.
     * @return the size of the shape's area.
     */
    public abstract double getArea();

    /**
     * Abstract toString method for subclasses to override.
     */
    public abstract String toString();
}
