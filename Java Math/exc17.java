import java.util.*;

public class exc17 {   
    // Streamdagi sonlarning o'rtachasini chiqaruvchi metod
    static void streamAvg(float arr[]) {
        int n = arr.length; 
        float avg = 0; 

        for (int i = 0; i < n; i++)  {
            // Yangi o'rtachani hisoblash
            avg = (avg * i + arr[i]) / (i + 1);
            System.out.printf("%d ta sondan o'rtacha: %.2f\n", i + 1, avg); 
        }
    }

    // Agar istasangiz, bu yordamchi funksiyani ishlatishingiz mumkin
    static float getAvg(float prev_avg, float x, int n) {
        return (prev_avg * n + x) / (n + 1);
    }

    public static void main(String[] args) {
        float arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
        streamAvg(arr); 
    }
}
