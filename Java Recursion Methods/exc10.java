public class exc10 {
    
    public static int lengthOfString(String word) {
        if(word.isEmpty()) {
            return 0;
        }
        return 1 + lengthOfString(word.substring(1));
    }
    public static void main(String[] args) {
        String word = "Hello, word";
        int result = lengthOfString(word);

        System.out.print(result);

    }
}
