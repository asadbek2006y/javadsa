
import java.util.Scanner;

public class exc24{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the row number: ");
        int n = scan.nextInt();


        for (int i = n ; i > 0; i--) {

            for (int j = n - i; j >  0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}