
import java.util.Scanner;

public class exc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input triangle layer: ");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.println(j);
            }
            System.out.println("");

        }
    }
}
