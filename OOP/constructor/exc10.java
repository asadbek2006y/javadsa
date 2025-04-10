package constructor;

class Singleton {
    private static Singleton instance;

    // Private constructor — boshqa classlar bu classdan obyekt yarata olmaydi
    private Singleton() {
        System.out.println("Singleton obyekti yaratildi!");
    }

    // Public static method — yagona instance'ni olish uchun
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Bu Singleton klassining obyekti.");
    }


}
public class exc10 {
    public static void main(String[] args) {
        // Faqat bir marta obyekt yaratiladi
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        // Ikkinchi chaqiriqda yangi obyekt yaratilmaydi
        if (s1 == s2) {
            System.out.println("s1 va s2 bir xil obyektni ko‘rsatmoqda.");
        }
    }
}