package bai_thi.controller;

import bai_thi.service.IService;
import bai_thi.service.impl.EmployeeService;
import bai_thi.service.impl.StudentService;

import javax.management.MBeanRegistration;
import java.io.IOException;
import java.util.Scanner;

public class DisplayMilitaryController {
    private static Scanner scanner= new Scanner(System.in);
    private IService employeeService= new EmployeeService();
    private IService studentService= new StudentService();
    public void menuDisplayMilitary() throws IOException {
        while (true){
            System.out.println("1.hien thi nhan vien");
            System.out.println("2.hien thi hoc sinh");
            int choice3= Integer.parseInt(scanner.nextLine());
            switch ( choice3){
                case    1:
                    employeeService.displayAll();
                    break;
                case 2:
                    studentService.displayAll();
                    break;
                case    3:
                    return;
                default:
                    System.out.println("ban nhap khong dungg dinh dang");

            }
        }
    }

}
