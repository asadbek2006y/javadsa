package constructor;

class Point {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

}

public class exc8 {
    public static void main(String[] args) {
        // Create a Point object using the int constructor
        Point point1 = new Point(4, 5);
        // Print the values of point1
        point1.printPoint();

        // Create a Point object using the double constructor
        Point point2 = new Point(4.5, 5.5);
        // Print the values of point2
        point2.printPoint();
    }
}
