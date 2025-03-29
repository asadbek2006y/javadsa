
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scan.nextInt();

        if(num > 0){
            if(num < 10){
                System.out.println(num + " small positive num");
            }else if(num < 100) {
                System.out.println(num + "  mid postitve num");
            }else if( num < 1000) {
                System.out.println(num + " big positive num");
            }else{
                System.out.println(num + " large positive number");
            }
        }else if(num < 0){
            if (Math.abs(num) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(num) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }else
        {
            System.out.println("Zero");
        }
    }
}
