package exc8;

public class Circle extends Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        // Return the perimeter of the circle calculated as 2 * π * radius
        return 2 * Math.PI * r;
    }
    @Override
    public double getArea() {
        // Return the perimeter of the circle calculated as 2 * π * radius
        return Math.PI * (r*r);
    }
}
