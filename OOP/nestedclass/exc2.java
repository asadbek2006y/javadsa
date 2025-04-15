package nestedclass;

class University {
    
    static class Department {    
        private String departmentName;
        private int facultyCount;
    
        public Department(String departmentName, int facultyCount) {
            this.departmentName = departmentName;
            this.facultyCount = facultyCount;
        }
        
        // Method to display department information
        public void displayInfo() {
            System.out.println("Department: " + departmentName);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }
}

public class exc2 {

    public static void main(String[] args) {
        
        University.Department compSciDept = new University.Department("Computer Science", 50);

        compSciDept.displayInfo();
    }
        
}
