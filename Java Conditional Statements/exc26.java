import java.util.Scanner;

public class exc26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        scan.close();

        // Yuqori qismi
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1; // Har bir qatorda 1 dan boshlanadi
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // Pastga tushuvchi qismi (1 qator pastdan boshlanadi, takrorlamaslik uchun)
        for (int i = n - 2; i >= 0; i--) { 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1; // Har bir qatorda 1 dan boshlanadi
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
