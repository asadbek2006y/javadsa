package nestedclass;

class MathUtil {
    // static nested class
    static class Calculator {
        // static metod
        public static int add(int a, int b) {
            return a + b;
        }
    }
}

public class exc6 {
    public static void main(String[] args) {
        int natija = MathUtil.Calculator.add(5, 6);
        System.out.println("Yig'indisi: " + natija);
    }
}
