package dmit2015.model;

/**
 * This class models a Circle shape.
 *
 * @author Stephen Toliver
 * @version 2023-01-20
 */
public class Circle {

    /**
     * The radius of this circle.
     */
    private double radius;

    /**
     * Returns the radius of this circle
     * @return the radius of this circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Change the radius of this circle
     * @param radius the new radius of this circle
     * @throws Exception
     */
//  CHECKED exception example
    public void setRadius(double radius) throws Exception {
        if (radius <= 0)
        {
            throw new Exception("Radius must be a positive non-zero number.");
        }
        this.radius = radius;
    }

    //  RuntimeException example
//    public void setRadius(double radius) {
//        if (radius <= 0)
//        {
//            throw new RuntimeException("Radius must be a positive non-zero number.");
//        }
//        this.radius = radius;
//    }

    /**
     * Creates a circle with radius of 1
     */
    public Circle() {
        this.radius = 1;
    }

    /**
     * Creates a circle with a specific radius
     * @param radius the new circle's radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Compute and return the area of this circle
     * @return the diameter of this circle
     */
    public double area()
    {
        return Math.PI * radius * radius;
    }

    /**
     * Computes and returns the diameter of this circle
     * @return the diameter of this circle
     */
    public double diameter()
    {
        return 2 * radius;
    }

    /**
     * Computes and returns the circumference of this circle
     * @return the circumference of this circle
     */
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("The radius of the circle1 is" + circle1.getRadius());
        System.out.printf("The radius of the circle1 is %s\n", circle1.getRadius());
        System.out.printf("The area of the circle1 is %.5f\n", circle1.area());
        System.out.printf("The radius of the circle1 is %.2f\n", circle1.circumference());

        try
        {
            circle1.setRadius(5);
            System.out.println("An exception should have been thrown");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.printf("The radius of the circle1 is %s\n", circle1.getRadius());
        System.out.printf("The area of the circle1 is %.5f\n", circle1.area());
        System.out.printf("The radius of the circle1 is %.2f\n", circle1.circumference());

        try
        {
            circle1.setRadius(-25);
            System.out.println("An exception should have been thrown");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
