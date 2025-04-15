package nestedclass;

class Car{
    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running");
            }
        }
        
        Engine engine = new Engine();
        engine.run();
    }
}
public class exc3 {

    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
    }
    
}
