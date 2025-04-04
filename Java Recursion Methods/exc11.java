import java.util.ArrayList;
import java.util.List;

public class exc11 {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = getPermutations(str);
        
        // Natijalarni chiroyli chiqaramiz
        System.out.println("Permutations of '" + str + "': " + permutations);
    }

    // Rekursiv permutatsiya funksiyasi
    public static List<String> getPermutations(String s) {
        List<String> result = new ArrayList<>();
        
        // Bazaviy holat: Agar string uzunligi 1 bo'lsa, faqat o'sha stringni qaytaramiz
        if (s.length() == 1) {
            result.add(s);
            return result;
        }

        // Har bir belgini ajratib, qolgan qismini rekursiv chaqiramiz
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); // Joriy belgi
            String remainingChars = s.substring(0, i) + s.substring(i + 1); // Qolgan qismi

            // Qolgan qismining barcha permutationlarini topamiz
            for (String perm : getPermutations(remainingChars)) {
                result.add(currentChar + perm);
            }
        }

        return result;
    }
}
