package	staticmembers;
class Initializer {
    static int initialValue;

    // static block — dastlab bir marta ishga tushadi
    static {
        initialValue = 1000;
        System.out.println("Static block ishga tushdi");
    }

    public Initializer() {
        System.out.println("Initializer konstruktori ishga tushdi");
    }


}
public class exc3 {
    public static void main(String[] args) {
        Initializer init = new Initializer();
        // Obyekt yaratishdan oldin
        System.out.println("Obyektgacha: initialValue = " + init.initialValue);

        // Obyekt yaratish
        Initializer obj = new Initializer();

        // Obyektdan keyin
        System.out.println("Obyekt keyin: initialValue = " + init.initialValue);
    }
}