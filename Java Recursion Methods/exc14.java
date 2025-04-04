import java.util.Scanner;

public class exc14 {
        public static int sumOfDigits(int n) {

        if( n ==0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the any number: ");
        int n = scan.nextInt();

        int sum = sumOfDigits(n);

        System.out.println(sum);
    }
}
