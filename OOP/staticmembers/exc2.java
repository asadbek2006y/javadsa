package staticmembers;

import java.util.Scanner;

class MathUtility {
    private static int n,m;

    public MathUtility(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public static int plus(int n, int m) {
        return n + m;
    }
    public static int minus(int n, int m) {
        return n - m;
    }
}

public class exc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Input the second number: ");
        int  num2 = scan.nextInt();

        int result = MathUtility.minus(num1, num2);
        int result2 = MathUtility.plus(num1, num2);

        System.out.println(result);
        System.out.println(result2);
    }
    
}
