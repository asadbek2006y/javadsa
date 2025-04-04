import java.util.Scanner;

public class exc8 {
    public static int elemntCount(String word) {
        if(word.isEmpty()) {
            return 0;
        }

        return 1 + elemntCount(word.substring(1)); // Harflarni sanash
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type any word: ");
        String word = scan.next();

        System.out.println(elemntCount(word));

    }
}
