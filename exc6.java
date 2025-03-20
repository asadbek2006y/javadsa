
import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scan.nextInt();
        System.out.println("Input second number: ");
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}
