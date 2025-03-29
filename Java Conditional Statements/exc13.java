
import java.util.Scanner;

public class exc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the num: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num + 1; i++){
            System.out.println(i + " and cube of " + i + " is " + Math.pow(i, 3));
        }


    }
}
