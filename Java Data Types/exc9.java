
import java.util.Scanner;

public class exc9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking input
        System.out.print("Input 1st integer: ");
        int num1 = scan.nextInt();

        System.out.print("Input 2nd integer: ");
        int num2 = scan.nextInt();

        // Using Math methods
        int sum = Math.addExact(num1, num2); // Sum
        int difference = Math.subtractExact(num1, num2); // Difference
        int product = Math.multiplyExact(num1, num2); // Product
        double average = Math.floorDiv(num1 + num2, 2); // Integer division for average
        int distance = Math.abs(num1 - num2); // Absolute difference
        int max = Math.max(num1, num2); // Maximum
        int min = Math.min(num1, num2); // Minimum

        // Displaying results
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f%n", (num1 + num2) / 2.0); // Ensuring decimal precision
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
