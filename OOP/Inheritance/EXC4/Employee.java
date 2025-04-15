package EXC4;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }
    void work() {
        System.out.print("Working as employee");
    } 
    public int getSalary() {
        return salary;
    }
}
