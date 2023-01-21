package dmit2015.model;

/**
 * This class models a Rectangle shape.
 *
 * @author Stephen Toliver
 * @version 2023-01-20
 */
public class Rectangle {

    /**
     * The length of this Rectangle
     */
    private double length;

    /**
     * The width of this Rectangle
     */
    private double width;

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double newLength, double newWidth) {
        setLength(newLength);
        setWidth(newWidth);
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public double diagonal() {
        return Math.sqrt((length * length) + (width * width));
    }

    public static void main(String[] args)
    {

    }
}
