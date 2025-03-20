
import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scan.nextInt();

        for(int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    }
}
