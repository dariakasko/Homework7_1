public class Point {
    private int coordinateX;
    private int coordinateY;

    public Point() {
    }
    public Point(int x, int y) {
        coordinateX = x;
        coordinateY = y;
    }

    public void setCoordinateX(int x) {
        coordinateX = x;
    }
    public int getCoordinateX() {
        return this.coordinateX;
    }
    public void setCoordinateY(int y) {
        coordinateY = y;
    }
    public int getCoordinateY() {
        return this.coordinateY;
    }

}
