import java.util.Scanner;

public class exc1 {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int tot_marks = scan.nextInt();
        System.out.println("Enter your practical score: ");
        int tot_prac_marks = scan.nextInt();
        System.out.println("Enter your theory score: ");
        int tot_theory_mark = scan.nextInt();

        int result = ((tot_prac_marks + tot_theory_mark) * 100) / tot_marks;

        System.out.println("The score of your mark in persantage: " + result);
    }
} 