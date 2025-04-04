import java.util.Scanner;

public class exc1{

    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ïnput the number: ");
        int n = scan.nextInt();

        int result  = factorial(n);

        System.out.print(result);
    }
}