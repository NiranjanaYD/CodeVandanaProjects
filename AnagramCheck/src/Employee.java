import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
       
        List<Employee> employeeList = new ArrayList<>();

     
        employeeList.add(new Employee(20251001, "NIRANJANA", 55000.0));
        employeeList.add(new Employee(2025102, "KARNA", 60000.0));
        employeeList.add(new Employee(20251003, "RAMA", 75000.0));

        
        System.out.println("********EMPLOYEE MANAGEMENT SYSTEM**************");
        System.out.println("--------------------------------------------------");
        
        
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
