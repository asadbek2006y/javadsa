package constructor;

import java.util.Scanner;

class Dog {
    String name;
    String color;
    int age;

    public Dog() {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void getInfo() {
        System.out.print("Dog's name is " + name + "\n" + "Dog's age is " + age + "\n" + "Dog's color is " + color);
    }
}
public class exc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input the name of th edog: ");
        String name = scan.next();
        System.out.print("input the color of th edog: ");
        String color = scan.next();
        System.out.print("input the age of th edog: ");
        int age= scan.nextInt();

        Dog dog = new Dog();
        dog.age = age;
        dog.color = color;
        dog.name = name;

        dog.getInfo();



    }
    
}
