package staticmembers;

class ComplexInitializer {

    public static int x,y,z;
    static {
        x = 8;
        y = 5;
        z = 2;
    }
}
public class exc9 {
    
    public static void main(String[] args) {
        System.out.print("Vlaues -->> " + ComplexInitializer.x + " " );
        System.out.print(ComplexInitializer.y + " ");
        System.out.print(ComplexInitializer.z + " ");
    }
}
