
import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        
        Scanner scan = new  Scanner(System.in);
        System.out.println("Input number from 100 to 0 ");
        int num = scan.nextInt();

        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(" the sum of digits : " + sum);

    }
}
