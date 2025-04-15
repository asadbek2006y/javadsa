package Inheritance;

class Animal {

    void makeSound(){
        System.out.print("Animal makes sound ");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.print("Vov vov ");
    }
}
public class exc1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
    
}
