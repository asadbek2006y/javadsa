import java.util.Scanner;

public class exc27 {
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in); // Scanner obyektini yaratish (foydalanuvchidan kiritish uchun)
        System.out.print("Input the number:  "); // Foydalanuvchiga n sonini kiritishni so'raydi
        int n = scan.nextInt(); // Kiritilgan sonni n ga saqlaymiz
        scan.close(); // Scanner obyektini yopamiz, chunki endi kerak emas

        int count, count2; // Ikki ta sanagich o'zgaruvchi
        count = 1;  // Harf bosiladigan soni (har safar oshadi)
        count2 = 1; // Bo'sh joylarni aniqlash uchun sanagich
        char c = 'A'; // Harfning boshlang'ich qiymati

        // Asosiy tsikl: (n * 2) marta aylanadi (yuqoriga va pastga ketish)
        for(int i = 0; i < (n * 2); i++) {

            // Bo'sh joylar chiqarish (qatorlarni pastga tushirib ketish)
            for(int spc = n - count2; spc > 0; spc--) {
                System.out.print(" "); // Bo'sh joy chiqarish
            }

            // count2 ni oshirib yoki kamaytirib bo'sh joylarni boshqarish
            if(i < n) {
                count2++; // 1 dan n gacha oshadi (olmos shaklining yuqori qismi)
            } else {
                count2--; // n dan 1 gacha kamayadi (olmos shaklining pastki qismi)
            }

            // Harflarni chiqarish
            for(int j = 0; j < count; j++) {
                System.out.print(c); // Harfni chiqarish

                // O'ng tomonga o'tayotganimizda harfni oshiramiz, so'ng kamaytiramiz
                if(j < count / 2) {
                    c++; // Harfni keyingisiga o'tkazish (A → B → C ...)
                } else {
                    c--; // Harfni avvalgisiga qaytarish (C → B → A ...)
                }
            }

            // count o'zgaruvchisini boshqarish (harflar soni)
            if(i < n) {
                count = count + 2; // 1, 3, 5, 7, ... (yuqoriga chiqishda)
            } else {
                count = count - 2; // ..., 7, 5, 3, 1 (pastga tushishda)
            }
            
            c = 'A'; // Harfni yana A dan boshlash
            System.out.println(); // Yangi qatorga o'tish
        }
    }
}
