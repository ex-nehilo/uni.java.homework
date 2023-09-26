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

    //ЗП + ПРЕМИЯ(КОЭФ*СТАЖ)
    @Override
    public double displayAndCalculateSalary() {
        return getSalary() + COEFFICIENT_OF_BONUS_FOR_EXPERIENCE_YEARS * getExperienceYears();
    }

    @Override
    public String displayDepartment() {
        return "Design";
    }

    //prop
    private double getSalary() {
        return salary;
    }

    private void setSalary(int salary) throws SalaryException {
        if (salary < 1000)
            throw new SalaryException("Минимальная базовая зарплата 10.000");
        this.salary = salary;
    }
}
