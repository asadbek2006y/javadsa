package staticmembers;

import java.util.Scanner;

class Constants {
    static final double PI = 3.14159265359;
    static int n;

    public Constants(int n ) {
    
        this.n = n;
    }

    public static int circleare() {
        return (int) (PI * (n * n));
    }

    public void getResult() {
        System.out.print("Are of the circle : " + Constants.circleare());
    }

}

public class exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the your number: ");
        int n = scan.nextInt();

        Constants consta = new Constants(n);
        consta.getResult();
    }
}
