import java.util.Scanner;

public class exc14 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Input the any number : ");
        int n = scan.nextInt();

        int result = (int) Math.sqrt(n);

        System.out.println(n + " square root is " + result);
    }
}
