package lab1;

/**
 * Ellipse class extending Rectangle.
 * Has semi-major and semi-minor axes instead of width and height.
 */
public class Ellipse extends Rectangle {
    private double semiMajor;
    private double semiMinor;

    /**
     * Constructor to initialize an Ellipse.
     * @param semiMajor the semi-major axis of the ellipse.
     * @param semiMinor the semi-minor axis of the ellipse.
     */
    public Ellipse(double semiMajor, double semiMinor) {
        super(semiMajor * 2, semiMinor * 2);  // Treat width/height as axes
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    // Getter and Setter for semi-major and semi-minor axes
    public double getSemiMajor() {
        return semiMajor;
    }

    public void setSemiMajor(double semiMajor) {
        this.semiMajor = semiMajor;
    }

    public double getSemiMinor() {
        return semiMinor;
    }

    public void setSemiMinor(double semiMinor) {
        this.semiMinor = semiMinor;
    }

    /**
     * Gets the area of the ellipse.
     * @return the area of the ellipse.
     */
    @Override
    public double getArea() {
        return Math.PI * semiMajor * semiMinor;
    }

    /**
     * toString method to display details of the Ellipse.
     */
    @Override
    public String toString() {
        return "Ellipse [semiMajor=" + semiMajor + ", semiMinor=" + semiMinor + 
               ", area=" + getArea() + ", sides=" + getSides() + "]";
    }
}
