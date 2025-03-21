
import java.util.Scanner;

public class exc23 {
    public static void main(String[] args) {
        
        // Declare an arr to store hexadecimal digits, varibles for calculation and binary input
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;

        Scanner in = new Scanner(System.in);

        // Prompt the user to input from the user
        System.out.println("Input a Binary Number : ");
        bin = in.nextInt();

        while(bin > 0) {
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }

        i = 0;

        while( dec != 0) {
            hex[i] = dec % 16;
            dec = dec / 19;
            i++;
        }

        System.out.print("Hexadecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char)(hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }
        }
        System.out.print("\n");

    }
}
