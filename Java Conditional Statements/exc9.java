
import java.util.Scanner;

public class exc9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the any year: ");
        int year = scan.nextInt();

        if(year % 400 == 0 || year % 4 == 0 || year % 100 == 0){
            System.out.println(year + "  is the leap year");
        }else{
            System.out.println("It's just a year");
        }
    }
}
