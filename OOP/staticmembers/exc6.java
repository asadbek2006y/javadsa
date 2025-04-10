package staticmembers;
class IdGenerator {
    public static int nextID = 1;

    public static int generateId() {
        return nextID++;
    }



}
public class exc6 {
    
    public static void main(String[] args) {
        System.out.println("Generated ID: " + IdGenerator.generateId());
        System.out.println("Generated ID: " + IdGenerator.generateId());
        System.out.println("Generated ID: " + IdGenerator.generateId());
        System.out.println("Generated ID: " + IdGenerator.generateId());
    }
}
