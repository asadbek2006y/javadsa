package Exc7;

public class Employee extends Person{
    
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Override the getLastName method from the superclass (Person)
    @Override
    public String getLastName() {
        // Return the last name from the superclass combined with the job title
        return super.getLastName() + ", " + jobTitle;
    }
}
