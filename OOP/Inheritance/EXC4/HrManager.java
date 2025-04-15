package EXC4;

public class HrManager extends Employee {
    
    public HrManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.print("\nManaging employee");
    }

    public void addEmployee(){
        System.out.println("\nAdding new employee");
    }
}
