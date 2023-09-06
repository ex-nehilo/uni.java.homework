package firstTask.employeesTask.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Employee {
    private int id;
    private String name;
    private String surname;
    private int experienceYears;
    public void introduceInfo() {
        System.out.println("----------------------------------");
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee surname: " + getSurname());
        System.out.println("Employee department : " + displayDepartment());
        System.out.println("Employee salary : " + displayAndCalculateSalary());
        System.out.println("----------------------------------");
        System.out.println();
    }
    public abstract double displayAndCalculateSalary();

    public abstract String displayDepartment();
}
