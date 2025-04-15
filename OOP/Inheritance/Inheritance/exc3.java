package Inheritance;

import java.util.Scanner;

class Shape {
    void getArea() {
        System.out.print("There is no Shape");
    }
}

class Rectangle extends Shape {
    Integer a,b;

    public Rectangle(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void getArea(){
        System.out.println("Area of the rectangle : " + (a * b));
    }
}
public class exc3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the value of a: ");
        int a = scan.nextInt();
        System.out.print("Input the value of b: ");
        int b = scan.nextInt();

        Rectangle rect = new Rectangle(a, b);

        rect.getArea();
    }
    
}
