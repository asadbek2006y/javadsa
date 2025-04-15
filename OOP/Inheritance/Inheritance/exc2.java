package Inheritance;

class Vehicle{
    void drive() {
        System.out.print("Vehicle is running");
    }
}

class Car extends Vehicle{
    @Override
    void drive(){
        System.out.print("Repairing a car");
    }
}
public class exc2 {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
    
}
