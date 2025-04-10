package constructor;

import java.util.Scanner;

class Car {
    String carModel;
    int year;

    public Car(String carModel, int year) {
        if (carModel == null || carModel.isEmpty()) {
            System.err.println("Car Model: none");
            this.carModel = "none";
        } else {
            this.carModel = carModel;
        }

        if (year == 0) {
            System.err.println("Car Year: 0000");
            this.year = 0000;
        } else {
            this.year = year;
        }
    }

    public void getInfo() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Year: " + year);
    }
}

public class exc7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the car model: ");
        String model = scan.next();
        System.out.print("Input the car year: ");
        int year = scan.nextInt();

        Car car = new Car(model, year);
        car.getInfo();
    }
}
