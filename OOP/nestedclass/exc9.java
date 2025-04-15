package nestedclass;
import java.util.Scanner;


class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Inner class Address
    class Address {
        private String city;
        private String state;

        // Constructor
        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public void displayAddress() {
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
    }
}

public class exc9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter the city: ");
        String city = scan.nextLine();

        System.out.print("Enter the state: ");
        String state = scan.nextLine();

        // Create outer class object
        Person person = new Person(name);

        // Create inner class object using outer class object
        Person.Address address = person.new Address(city, state);

        // Call method to display address
        address.displayAddress();
    }
}
