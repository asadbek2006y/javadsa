package Abstraction;

abstract class Person {
    abstract void eat();
    abstract void excersize();
}

class Athlete extends Person {
    
    @Override
    public void eat() {
        System.out.println("The athlete eats : colorified ");
    }
    @Override
    public void excersize() {
        System.out.println("Athlete does 5 push up every morning \n runs 5 km every morning \n ");
    }
}

class LazyPerson extends Person {

    @Override
    public void eat() {
        System.out.println("The laze person:  doesnt calculate the calories \n eats fast food \n Hamburger");
    }

    @Override
    public void excersize() {
        System.out.println("Eat eat eat ");
    }
}
public class exc8 {
    public static void main(String[] args) {
        Athlete at = new Athlete();

        at.eat();
        at.excersize();

        LazyPerson lazy = new LazyPerson();

        lazy.eat();
        lazy.excersize();
    }
}
