import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your number: ");
        float n = scan.nextFloat();

        int integerPart = (int) n;
        float fractionalPart = n - integerPart;

        System.out.println("Integer part: " + integerPart);
        System.out.println("Fractional part: " + fractionalPart);
    }
}
