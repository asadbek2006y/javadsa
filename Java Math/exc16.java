import java.util.Scanner;

public class exc16 {

    // Multiply two numbers without using * or /
    public static int multiply(int a, int b) {
        int result = 0;

        boolean negative = false;
        if (a < 0) {
            a = -a;
            negative = !negative;
        }
        if (b < 0) {
            b = -b;
            negative = !negative;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return negative ? -result : result;
    }

    // Power function using multiply()
    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result = multiply(result, base);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("Input the first int (base): ");
        int n1 = scan.nextInt();

        System.out.print("Input the second int (exponent): ");
        int n2 = scan.nextInt();

        scan.close();

        if (n2 >= 0) {
            System.out.println("Output: " + power(n1, n2));
        } else {
            System.out.println("Exponent must be >= 0");
        }
    }
}
