import java.util.Scanner;

public class exc1 {
    
    public static boolean isUgly(int num) {
        if (num <= 0) return false;

        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;

        return num == 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the anyh number: ");
        int number = scan.nextInt();
        if (isUgly(number)) {
            System.out.println(number + " is an Ugly Number 😖");
        } else {
            System.out.println(number + " is NOT an Ugly Number 😎");
        }
    }
}