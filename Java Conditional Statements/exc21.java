import java.util.Scanner;

public class exc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        
        // ✅ Yuqori qismi (Piramida)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("+");
            }
            System.out.println();
        }

        // ✅ Pastki qismi (Teskari piramida)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
