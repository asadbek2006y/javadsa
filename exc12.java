
import java.util.Scanner;

public class exc12 {
    public static void main(String[] args) {

        double num = 0;
        double x = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the numbers you want : ");
        int n = scan.nextInt();

        while (x <= n ) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            num += scan.nextInt();
            x +=1;
        }

        double avgn = (num/n);
        System.out.println("avarage : " + avgn);
    }
    
}
