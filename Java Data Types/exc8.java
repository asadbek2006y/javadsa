
import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number: ");
        int num = scan.nextInt();

        System.out.println("Square of the num: " + Math.pow(num,2));
        System.out.println("Cube of the num: " + Math.cbrt(num));
        System.out.println("Fourth power of the num: " + Math.pow(num,4));

    }
}
