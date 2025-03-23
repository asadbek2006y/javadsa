
import java.util.Scanner;

public class exc1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Farenheit degree: ");
        double f = scan.nextDouble();

        System.out.println("F to C : " + ((f - 32) * 5/9));
    }
}