package firstTask.employeesTask.main;


import firstTask.employeesTask.classes.Designer;
import firstTask.employeesTask.classes.Developer;
import firstTask.employeesTask.classes.Employee;
import firstTask.employeesTask.classes.SalaryException;

public class Main {
    public static void main(String[] args){
        try
        {
            Employee emp1 = new Developer(1, "Roman", "Bakin", 3, 40000);
            Employee emp2 = new Designer(2, "Antony", "Blinken", 12, 10000);
            emp1.introduceInfo();
            emp2.introduceInfo();

        } catch (SalaryException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
