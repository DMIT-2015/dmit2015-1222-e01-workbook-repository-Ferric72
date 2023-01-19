package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
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

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double diameter()
    {
        return 2 * radius;
    }

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
