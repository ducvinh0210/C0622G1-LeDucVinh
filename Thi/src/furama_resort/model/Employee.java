package furama_resort.model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Employee  extends Person{
    private String level;
    private String job;
    private double salary;

    public Employee() {
    }


    public Employee(String level, String job, double salary) {
        this.level = level;
        this.job = job;
        this.salary = salary;
    }

    public Employee(String id, String name, LocalDate dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String job, double salary) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.job = job;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
//        return "Employee{" +
//                "level='" + level + '\'' +
//                ", job='" + job + '\'' +
//                ", salary=" + salary +
//                '}';
        return super.toString()+","+level+","+job+","+salary;

    }
}
