package constructor;

import java.util.Scanner;

class Classroom{
    String className;
    String[] students;

    public Classroom(String className, String[] students) {

        if(className.isEmpty() || className == null) {
            System.err.print("Class not Found");
            this.className = "none";
        }else {
            this.className = className;
        }

        if(students == null) {
            System.err.print("Students not found");
            this.students = new String[0];
        } else {
            this.students = students;
        }
        
    }
    public void displayInfo() {
        System.out.println("Class Name: " + className);
        if (students.length == 0) {
            System.out.println("No students in this class.");
        } else {
            System.out.println("Students:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }
}

public class exc9 {

    public static void main(String[] args) {
        String[] studentList = {"Alice", "Bob", "Charlie"};
        Classroom classroom = new Classroom("Math101", studentList);
        classroom.displayInfo();
    }
    
}
