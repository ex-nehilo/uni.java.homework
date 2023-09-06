package firstTask.employeesTask.classes;

public class Designer extends Employee {
    private double salary;
    private final int COEFFICIENT_OF_BONUS_FOR_EXPERIENCE_YEARS = 2500;

    public Designer(int id, String name, String surname, int experienceYears, double salary) throws SalaryException {
        super(id, name, surname, experienceYears);
        if (salary < 10000) throw new SalaryException("Минимальная базовая зарплата 10.000");
        this.salary = salary;
    }

    @Override
    public double displayAndCalculateSalary() {
        return getSalary() + COEFFICIENT_OF_BONUS_FOR_EXPERIENCE_YEARS * getExperienceYears();
    }

    @Override
    public String displayDepartment() {
        return "Design";
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(int salary) throws SalaryException {
        if (salary < 1000)
            throw new SalaryException("Минимальная базовая зарплата 10.000");
        this.salary = salary;
    }
}
