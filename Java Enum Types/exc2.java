

public class exc2 {
    
    public enum Days_Of_Weekend{
        SUNDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        
        Days_Of_Weekend day1 = Days_Of_Weekend.SUNDAY;
        Days_Of_Weekend day2 = Days_Of_Weekend.SATURDAY;

        System.out.println("First day of the weekend: " + day2);
        System.out.println("Second day of the weekend: " + day1);
    }
}
