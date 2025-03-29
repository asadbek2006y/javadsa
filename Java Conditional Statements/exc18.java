import java.util.Scanner;

public class exc18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input row for a triangle: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            // Bo'sh joy chiqarish
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Raqam chiqarish
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            // Yangi qatorga o'tish
            System.out.println();
        }
        scan.close();
    }
}
