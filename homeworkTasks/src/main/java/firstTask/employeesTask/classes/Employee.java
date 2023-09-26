package firstTask.employeesTask.classes;

public abstract class Employee {
    private int id;
    private String name;
    private String surname;
    private int experienceYears;

    public abstract void introduceInfo();

    public abstract double displayAndCalculateSalary();

    public abstract String displayDepartment();

    public Employee(int id, String name, String surname, int experienceYears) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.experienceYears = experienceYears;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
