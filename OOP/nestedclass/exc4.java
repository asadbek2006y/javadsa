package nestedclass;

// Define the Greeting interface
interface Greeting {
    void sayHello();
}

public class exc4 {

    public static void main(String[] args) {
        // Creating an anonymous class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                // Overriding the sayHello method to print "Hello, World!"
                System.out.println("Hello, World!");
            }
        };

        // Calling the sayHello method of the anonymous class
        greeting.sayHello();
    }
}
