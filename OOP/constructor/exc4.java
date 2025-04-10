package constructor;

import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String grade;

    // Constructor 1
    public Student(String name, int studentId) {
        this.studentId = studentId;
        this.name = name;
        this.grade = "Noma'lum";
    }

    // Constructor 2
    public Student(String name, String grade, int studentId) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void getInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the student's name: ");
        String name = scan.next();

        System.out.print("Input the student's grade: ");
        String grade = scan.next();

        int randomId = (int)(Math.random() * 10000); // Tasodifiy ID yaratish

        // 2-parametrli constructor
        Student student1 = new Student(name, randomId);

        // 3-parametrli constructor
        Student student2 = new Student(name, grade, randomId);

        System.out.println("\n--- Student 1 Info ---");
        student1.getInfo();

        System.out.println("\n--- Student 2 Info ---");
        student2.getInfo();

        scan.close();
    }
}
