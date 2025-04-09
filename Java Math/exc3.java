import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number I will say it is double or not : ");
        double d_num = scan.nextDouble();

        if(d_num % 1 == 0) {
            System.out.print("It is not double");
        } else {
            System.out.print( "It is double");
        }
    }
}
