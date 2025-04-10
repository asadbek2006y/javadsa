package constructor;

import java.util.Scanner;

class Rectangle {
    int width, lenght;

    public Rectangle(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public void getInfo() {
        System.out.println("Width of rectangle: " + width + "\n" + "Length of Rectangle: " + lenght);
    }
}

public class exc5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input the width of rectangle: ");
        int w = scan.nextInt();
        System.out.print("input the length of rectangle: ");
        int h = scan.nextInt();

        Rectangle rec = new Rectangle(w, h);
        rec.getInfo();
    }

}
