
import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scan.nextInt();

        num = Math.abs(num);

        int divisor = 1;

        while (num / divisor >= 10) {
            divisor *=10;
        }

        System.out.println("Raqamlar: ");
        while(divisor > 0){
            System.out.println(num / divisor + "");
            num %= divisor;
            divisor /=10;
        }
        System.out.println(divisor);

    }
}
