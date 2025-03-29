
import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:  ");
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0; i <= n;i++){
            sum +=i;
        }

        System.out.println(sum);

    }
}
