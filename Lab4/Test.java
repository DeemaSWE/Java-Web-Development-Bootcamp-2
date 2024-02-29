package Lab4;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        System.out.println("Circle");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        System.out.println();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle");
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Circumference: " + rectangle.calculateCircumference());
        System.out.println();

        Triangle triangle = new Triangle(3.0, 5.0);
        System.out.println("Triangle");
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Circumference: " + triangle.calculateCircumference());
    }
}
