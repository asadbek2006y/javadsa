
import java.util.Scanner;

public class exc20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int i, j, n, k = 1;

        n = scan.nextInt();

        for(i = 1; i<= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println(" ");
        }
    }
}
