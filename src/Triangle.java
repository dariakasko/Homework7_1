public class Triangle extends Shape{
    Point point1;//x1;y1
    Point point2;//x2;y2
    Point point3;//x3;y3

    private double side1, side2, side3;
    private double trianglePerimeter;

    public Triangle() {
    }
    public Triangle(Point p1, Point p2, Point p3, String color) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        this.color = color;
        side1 = caclSideByCoordinates(point1, point2);
        side2 = caclSideByCoordinates(point2, point3);
        side3 = caclSideByCoordinates(point1, point3);
    }
    private double caclSideByCoordinates(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point2.getCoordinateX() - point1.getCoordinateX()), 2)
                + Math.pow((point2.getCoordinateY() - point1.getCoordinateY()), 2));
    }
    @Override
    public double calculateArea() {
        return Math.sqrt(trianglePerimeter * (trianglePerimeter - side1) // Формула Герона
                * (trianglePerimeter - side2) * (trianglePerimeter - side3));
    }

    @Override
    public double calculatePerimeter() {
        trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }

    /*@Override
    public String paint() {
        return color;
    }
     */

    @Override
    public String toString(){
        return "This is Triangle: \n" + "Area: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\nColor: " + color + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;
        if ((side1 != triangle.side1) && (side2 != triangle.side2) && (side3 != triangle.side3)) {return false; }
        else return true;
    }
    @Override
    public int hashCode(){
        return (int) (31 * side1 + 31 * side2 + 31 * side3);
    }
}

