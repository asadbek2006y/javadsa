public class exc13 {
    public static int findLongestBinaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                counting = true; // endi gap sanaymiz
                currentGap = 0;  // reset qilamiz
            } else if (counting) {
                currentGap++;
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        int N = 529;
        System.out.println("Longest binary gap: " + findLongestBinaryGap(N));
    }
}
