// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(3, 3);
        Point point2 = new Point(10, 10);
        Point point3 = new Point(7, 0);

        Circle circle1 = new Circle(point1, point2, "Green");
        Triangle triangle1 = new Triangle(point1, point2, point3, "Pink");
        Rectangle rectangle1 = new Rectangle(point1, point2, point3, "Red");

        Shape[] arrayOfShapes = new Shape[3];
        arrayOfShapes[0] = circle1;
        arrayOfShapes[1] = triangle1;
        arrayOfShapes[2] = rectangle1;

        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].calculatePerimeter();
            arrayOfShapes[i].calculateArea();
            arrayOfShapes[i].paint();
        }

        System.out.println(circle1.toString());
        System.out.println(triangle1.toString());
        System.out.println(rectangle1.toString());

        System.out.println("I've done it and I'm happy");
    }
}