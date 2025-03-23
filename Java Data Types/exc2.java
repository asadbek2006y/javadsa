
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input distance in Inch : ");
        double inch = scan.nextDouble();

        double m = 0.0254;

        System.out.println("Inch to Metr equals to : " + (inch * m));
    }
}
