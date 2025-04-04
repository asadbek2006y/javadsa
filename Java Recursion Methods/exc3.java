import java.util.Scanner;

public class exc3 {
    
    public static int nthFibonnaci(int n){
        if(n == 0 || n == 1) {
            return 1;
        }

        return nthFibonnaci(n - 1) + nthFibonnaci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the any number : ");
        int n = scan.nextInt();

        int result = nthFibonnaci(n);
        System.out.println(result);
    }
}
