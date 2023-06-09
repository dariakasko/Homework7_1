public class Rectangle extends Shape {
    Point p1, p2, p3;
    private double side1, side2;

    public Rectangle(Point p1, Point p2, Point p3, String color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;
    }

    @Override
    public double calculateArea(){
        return side1 * side2;
    }
    @Override
    public double calculatePerimeter() {
        side1 = Math.sqrt(Math.pow((p2.getCoordinateX() - p1.getCoordinateX()),2)
                        + Math.pow((p2.getCoordinateY() - p2.getCoordinateY()), 2));
        side2 = Math.sqrt(Math.pow((p3.getCoordinateX() - p2.getCoordinateX()),2)
                + Math.pow((p3.getCoordinateY() - p2.getCoordinateY()), 2));
        return 2 * side1 + 2 * side2;
    }
    @Override
    public String paint() {
        return color;
    }

    @Override
    public String toString(){
        return "This is Rectangle: \n" + "Area: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\nColor: " + color + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        if ((side1 != rectangle.side1) && (side2 != rectangle.side2)) {return false; }
        else return true;
    }
    @Override
    public int hashCode(){
        return (int) (31 * side1 + 31 * side2);
    }
}
