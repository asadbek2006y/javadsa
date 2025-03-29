import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("input the number one: ");
        int a = scan.nextInt();

        System.out.println("input the number two: ");
        int b = scan.nextInt();    

        System.out.println("input the number Three: ");
        int c = scan.nextInt();

        if(a > b ){
            if(a > c){
                System.out.println("greatest number is : " + a);
            }
        }else if (b > a ) {
            if(b > c){
                System.out.println("greatest number is : " + b);
            }
        }else if( c > a ){
            if( c > b){
                System.out.println("greatest number is : " + c);
            }
        }
        else{

            System.out.println("Topilmadi :(");

        }
    }
}
