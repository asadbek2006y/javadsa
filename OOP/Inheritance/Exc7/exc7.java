package Exc7;

public class exc7 {
    public static void main(String[] args) {
     
        Employee employee1 = new Employee("Asadbek", "Otabekov", 1, "Software engeneer");
        System.out.println(employee1.getFirstName() +" "+ employee1.getLastName() +" "+ employee1.getEmployeeId());
        Employee employee2 = new Employee("Asadbek", "Otabekov", 2, "engeneer");
        Employee employee3 = new Employee("Asadbek", "Otabekov", 3, "DevOps");
        Employee employee4 = new Employee("Asadbek", "Otabekov", 4, "Hacker");
    }
}
