
import java.util.Scanner;

public class exc17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input num for triangle: ");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
