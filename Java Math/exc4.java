import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input some number: ");
        float num = scan.nextFloat();   

        float result = Math.round(num * 100) / 100f;

        System.out.println(result);


    }
}
