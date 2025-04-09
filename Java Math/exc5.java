import java.util.HashSet;

public class exc5 {
    public static void main(String[] args) {
        int[] arr = { -1, 1, 2, -2, 3, -3, 3, -1, 5 };
        HashSet<Integer> absSet = new HashSet<>();

        for (int num : arr) {
            absSet.add(Math.abs(num)); // faqat absolyut qiymatlarni qo‘shamiz
        }

        System.out.println("Count of absolute distinct values: " + absSet.size());
    }
}
