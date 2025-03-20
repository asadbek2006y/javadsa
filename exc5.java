import java.util.Scanner;

public class exc5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: first number >>");
        int num1 = in.nextInt();

        System.out.println("Input: Second number >> ");
        int num2 = in.nextInt();
        System.out.println("Result: " + (num1 * num2));
    }
}
