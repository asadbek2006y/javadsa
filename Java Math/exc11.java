import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number 1 : ");
        int n1 = scan.nextInt();
        System.out.print("Input the number 2: ");
        int n2 = scan.nextInt();
        System.out.print("The result is: "+calculate(n1, n2));

    }

    public static boolean calculate (int n1, int n2) {
        if( n1 == 15 || n2 == 15) {
            return true;
        }

        return ((n1 + n2)  == 15 || Math.abs(n1 - n2) == 15);
    }
}