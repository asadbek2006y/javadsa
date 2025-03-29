
import java.util.Scanner;

public class exc5 {
    public enum Days_Of_Week{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY, 
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input another number");

        int day = scan.nextInt();

        switch (day) {
            case 1:
            System.out.println(Days_Of_Week.MONDAY);
                break;
            case 2:
                System.out.println(Days_Of_Week.THURSDAY);
                break;
            case 3: 
                System.out.println(Days_Of_Week.WEDNESDAY);
                break;
            case 4:
                System.out.println(Days_Of_Week.THURSDAY);
                break;
            case 5:
                System.out.println(Days_Of_Week.FRIDAY);
            case 6:
                System.out.println(Days_Of_Week.SATURDAY);
            case 7:
                System.out.println(Days_Of_Week.SUNDAY);
            default:
            System.out.println("Hafta kuni notogri kiritildi");
        }
    }
}
