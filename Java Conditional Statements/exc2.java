
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first num: ");
        int a = scan.nextInt();
        System.out.println("Input the second num: ");
        int b = scan.nextInt();
        System.out.println("Input the third num: ");
        int c = scan.nextInt();

        double result = Math.pow(b,2) - 4.0 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
