import java.util.Scanner;

public class exc6 {
    public static String reverseString(String word) {

        if(word.isEmpty()) {
            return word;
        }

        return reverseString(word.substring(1)) + word.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the any word: ");
        String word = scan.next();

        String result = reverseString(word);
        System.out.print(result);
    }
}
