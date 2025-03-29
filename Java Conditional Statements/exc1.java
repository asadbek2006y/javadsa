import java.util.Scanner;

public class exc1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scan.nextInt();

        if(num > 0) {
            System.out.println(num + " is the positive");
        }else{
            System.out.println(num + " is the negative");
        }
    }
}