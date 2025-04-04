import java.util.Scanner;

public class exc5 {
    
    public static int pow(int n) {
        if( n == 0) {
            return 1;
        }

        return n * pow(n - 1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the num: ");
        int n = scan.nextInt();

        int result = pow(n);
        System.out.println(result);
    }
}
