import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        double MpY = 60 * 24 * 365;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input mins: ");
        double mins = scan.nextDouble();
        
        long year = (long)(mins/MpY);
        int days = (int)((mins/ 60 /24)% 365);
        System.out.println("YEAR  " + year + "  DAYS  " + days);
    }
}
