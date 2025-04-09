import java.util.Scanner;

public class exc7 {

    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10, 9,   5,  4,   1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L", "XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the nuber: ");
        int  num = scan.nextInt();

        scan.close();
        
        if (num < 1 || num > 3999) {
            System.out.println("Number out of range (1-3999)");
        } else {
            System.out.println("Roman numeral: " + intToRoman(num));
        }
    }
}