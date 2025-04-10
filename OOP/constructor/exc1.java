package constructor;

import java.util.Scanner;

class Cat{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void giveInfo() {
        System.out.print("Name of Dog : " + name  + "\nAge of the Dog: " + age);
    }

}
public class exc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the name of the cat: ");
        String name= scan.next();
        System.out.print("Input the age of the cat: ");
        int age = scan.nextInt();

        Cat cat = new Cat(name, age);

        cat.giveInfo();

    }
}