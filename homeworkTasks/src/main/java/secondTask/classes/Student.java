package secondTask.classes;

import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class Student {
    @Pattern(regexp = "\\d{4}")
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate birthdayDate;
    private double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", gpa=" + gpa +
                '}';
    }

    public Student(int id, String surname, String name, String middleName, LocalDate birthdayDate, double gpa) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthdayDate = birthdayDate;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFullName()
    {
        return getSurname() + " " + getName() + " " + getMiddleName();
    }
}
