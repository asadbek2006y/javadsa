package Abstraction;

abstract class Insturment { 
    abstract void play();
    abstract void tune();
}

class Violin extends Insturment {

    @Override
    public void play() {
        System.out.println("Plays with the special stick");
    }

    @Override
    public void tune() 
    {
        System.out.println("asdas asda sdas dasdas asdas");
    }
}

class Glockenspiel extends Insturment {

    @Override
    public void play() {
        System.out.println("Glockenspiel is playing ");
    }

    @Override
    public void tune() {
         System.out.println("Glockenspiel is Tuning right now ");
    }
}
public class exc9 {
    public static void main(String[] args) {
        Violin vio = new Violin();
        Glockenspiel gl = new Glockenspiel();

        vio.play();
        gl.play();

        vio.tune();
        gl.tune();
    }
}
