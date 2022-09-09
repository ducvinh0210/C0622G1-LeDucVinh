package bai_thi.service.impl;

import bai_thi.model.Employee;
import bai_thi.service.IService;
import bai_thi.utils.read_write.ReadFileUtils;
import bai_thi.utils.read_write.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IService {
    public static String PATH_EMPLOYEE = "src\\bai_thi\\data\\file.csv";
    Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();


    @Override
    public void add() throws IOException {
     employees = ReadFileUtils.readFileEmployee(PATH_EMPLOYEE);
        Employee employee = this.infoEmployee();

        employees.add(employee);
        WriteFileUtils.writeFileEmployee(PATH_EMPLOYEE,employees);
    }




    @Override
    public void remove() throws IOException {
        employees= ReadFileUtils.readFileEmployee(PATH_EMPLOYEE);
Employee employee = this.findEmployee();
employees.remove(employee);
WriteFileUtils.writeFileEmployee(PATH_EMPLOYEE,employees);


    }

    @Override
    public void displayAll() throws IOException {
        employees= ReadFileUtils.readFileEmployee(PATH_EMPLOYEE);
        for (Employee employee :employees) {
            System.out.println(employee);

        }


    }

    public Employee infoEmployee() {
        String id;
        System.out.println("nhap id");
        id = scanner.nextLine();
        String name;
        System.out.println("nhap ten");
        name = scanner.nextLine();
        String dateOfBirth;
        System.out.println("nhap ngay sinh");
        dateOfBirth = scanner.nextLine();
        String address;
        System.out.println("nhap dia chi");
        address = scanner.nextLine();
        String numberPhone;
        System.out.println("nhap so dt");
        numberPhone = scanner.nextLine();

        double salary;
        System.out.println("nhap luong");
        salary = Double.parseDouble(scanner.nextLine());
        String department;
        System.out.println("nhap phong ban");
        department = scanner.nextLine();
        String level;
        System.out.println("nhap vi tri");
        level = scanner.nextLine();
        Employee employee = new Employee(id, name, dateOfBirth, address, numberPhone, salary, department, level);
        return employee;
    }
    public Employee findEmployee(){
        System.out.println("moi ban nhap id");
        String idEmployee= scanner.nextLine();
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).getId().equals(idEmployee)){
                return employees.get(i);
            }
        }
        return null;
    }
}
