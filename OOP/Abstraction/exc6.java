package Abstraction;

abstract class Shape3D {
    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    // Private variable to store radius
    private double radius;
  
    // Constructor to initialize radius
    public Sphere(double radius) {
      // Setting the radius value
      this.radius = radius;
    }
  
    // Overriding the calculateVolume method
    @Override
    public double calculateVolume() {
      // Calculating the volume of the sphere using the formula (4/3) * π * radius^3
      return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
  
    // Overriding the calculateSurfaceArea method
    @Override
    public double calculateSurfaceArea() {
      // Calculating the surface area of the sphere using the formula 4 * π * radius^2
      return 4 * Math.PI * Math.pow(radius, 2);
    }
  }

class Cube extends Shape3D {
    // Private variable to store side length
    private double sideLength;
  
    // Constructor to initialize side length
    public Cube(double sideLength) {
      // Setting the side length value
      this.sideLength = sideLength;
    }
  
    // Overriding the calculateVolume method
    @Override
    public double calculateVolume() {
      // Calculating the volume of the cube using the formula sideLength^3
      return Math.pow(sideLength, 3);
    }
  
    // Overriding the calculateSurfaceArea method
    @Override
    public double calculateSurfaceArea() {
      // Calculating the surface area of the cube using the formula 6 * sideLength^2
      return 6 * Math.pow(sideLength, 2);
    }
  } 
public class exc6 {
    public static void main(String[] args ) {
        Sphere sph = new Sphere(7);
        System.out.println("The value of the Sphere is : " + sph.calculateVolume());
        System.out.println("The surface of the sphere" + sph.calculateSurfaceArea());
    
        Cube cube = new Cube(6);
        System.out.println("the value of the cube: " + cube.calculateVolume());
        System.out.println("the surface of the cude: " + cube.calculateSurfaceArea());
    }
}
