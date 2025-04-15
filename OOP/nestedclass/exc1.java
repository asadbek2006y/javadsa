package nestedclass;

class Computer {



    class Processor {

        void displayDetails() {
            System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
        }
    }

    void showProcessorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }

}

public class exc1 {
    
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.showProcessorDetails();
    }
}
