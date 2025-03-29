
import java.util.Scanner;

public class exc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 5 numbers: ");
        int nums = scan.nextInt();

        int sum = 0;

        while(nums != 0){
            sum += nums %10;
            nums /=10;
        }
        int avg = sum /2;
        System.out.println("The sum of the number: " + sum);
        System.out.println("The avarage of the number: " + avg);
    }
}
