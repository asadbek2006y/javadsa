import java.util.Scanner;

public class exc22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long binaryNumber, decimalNumber = 0, j = 1, remainder;

        System.out.println("Input binary number : ");
        binaryNumber = sc.nextLong();

        while (binaryNumber !=0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }

        System.out.println("Decimal number : " + decimalNumber);
    }
}
