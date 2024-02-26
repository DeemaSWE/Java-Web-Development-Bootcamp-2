package Day12_Exercise;

public class Main {

    public static void main(String[] args){

        Shape shape = new Shape("red", true);
        System.out.println("Shape:\n" + shape.toString());

        Circle circle = new Circle("blue", false, 2.5);
        System.out.println("\nCircle:\n" + circle.toString());
        System.out.printf("Area: %.2f\n", circle.getArea());
        System.out.printf("Perimeter: %.2f\n", circle.getPerimeter());

        Rectangle rectangle = new Rectangle("yellow", true, 4.0, 6.0);
        System.out.println("\nRectangle:\n" + rectangle.toString());
        System.out.printf("Area: %.2f\n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.getPerimeter());

        Square square = new Square("orange", true, 5.0);
        System.out.println("\nSquare:\n" + square.toString());
        System.out.printf("Area: %.2f\n", square.getArea());
        System.out.printf("Perimeter: %.2f\n", square.getPerimeter());
    }
}
