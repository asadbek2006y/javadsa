import java.util.Scanner;

public class exc7 {
    public static int gcdCalc(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }

        int reminder  = num1 % num2;
        return gcdCalc(num2, reminder);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int n1 = scan.nextInt();
        System.out.print("Input second number: ");
        int n2 = scan.nextInt();

        int result = gcdCalc(n1, n2);
        System.out.println(result);


    }
}
