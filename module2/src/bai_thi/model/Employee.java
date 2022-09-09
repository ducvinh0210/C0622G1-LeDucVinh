package bai_thi.model;

public class Employee extends Person {
    private double salary;
    private String department;
    private String level;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return super.getId()+","+super.getName()+","+super.getDateOfBirth()+","+super.getAddress()+","+
                super.getPhoneNumber()+","+this.salary+","+this.department+","+this.level;
    }

    public Employee(double salary, String department, String level) {
        this.salary = salary;
        this.department = department;
        this.level = level;
    }

    public Employee(String id, String name, String dateOfBirth, String address, String phoneNumber, double salary, String department, String level) {
        super(id, name, dateOfBirth, address, phoneNumber);
        this.salary = salary;
        this.department = department;
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
//        return "Employee{" +
//                "salary=" + salary +
//                ", department='" + department + '\'' +
//                ", level='" + level + '\'' +
//                '}';
        return super.toString()+","+salary+","+department+","+level;
    }
}
