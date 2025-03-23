
import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input gmt zone: ");
        long gmt = scan.nextLong();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + gmt) % 24);
        
        System.out.println("current hour: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
