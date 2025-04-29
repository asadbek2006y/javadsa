package Abstraction;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("The engine of car is runing: ");
    }

    @Override 
    public void stopEngine() {
        System.out.println("The engine of the car is stopped: ");
    }
}

public class exc7 {

    public static void main(String[] args) {
        
        Car car = new Car();
        
        car.startEngine();
        car.stopEngine();
    }
    
}
