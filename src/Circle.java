import java.nio.channels.Pipe;

public class Circle extends Shape {
    Point point1, point2;
    Colours colour;
    public Circle(Point point1, Point point2, Colours colour) {
        this.point1 = point1;
        this.point2 = point2;
        this.colour = colour;
    }
    private double calculateRadius() {
        double radius = Math.pow( (point1.getCoordinateX() - point2.getCoordinateX()) , 2)
                + Math.pow( (point1.getCoordinateY() - point2.getCoordinateY()) , 2);
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(calculateRadius(), 2);
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * calculateRadius() ;
    }

    @Override
    public String toString(){
        return "This is Circle: \n" + "Area: " + String.format("%.2f",calculateArea()) + "cm^2"
                + "\nPerimeter: " + String.format("%.2f",calculatePerimeter()) + "cm^2"
                + "\n" + colour.toString() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return calculateArea() == circle.calculateArea();
    }
    @Override
    public int hashCode(){
        return (int)calculateArea();
    }
}
