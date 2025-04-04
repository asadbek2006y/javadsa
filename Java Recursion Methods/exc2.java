import java.util.Scanner;

public class exc2 {

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        return n + sum(n - 1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the any number: ");
        int n= scan.nextInt();

        int result = sum(n);

        System.out.print(result);

    }
}