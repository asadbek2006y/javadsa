import java.util.Scanner;

public class exc19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n, k = 1;

        System.out.print("Input the number: ");
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++ + " ");  // Print the number followed by a space
            }
            System.out.println();  // Move to the next line after each row is printed
        }
    }
}
