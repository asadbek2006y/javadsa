import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the  any number: ");
        int num = scan.nextInt();

        System.out.print(num + " absolute value is : " + Math.abs(num));
    }
}