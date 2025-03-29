
import java.util.Scanner;



public class exc15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(2* i -1);
        }

    }
}
