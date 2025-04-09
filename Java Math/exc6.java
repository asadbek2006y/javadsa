import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number :  ");

        int  num = scan.nextInt();
        int reversed = 0;
        int digit = 0;

        while( num != 0) {
            digit  = num % 10;
            reversed  = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.print(reversed);
    }
}