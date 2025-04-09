import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        double n = scan.nextDouble(); // foydalanuvchi 3.7 kiritadi, masalan

        long rounded = Math.round(n); // 4
        System.out.println("Rounded value: " + rounded);
    }
}
