package bai_thi.controller;

import bai_thi.service.IService;
import bai_thi.service.impl.EmployeeService;
import bai_thi.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class AddMilitaryController {
    private static Scanner scanner = new Scanner(System.in);
    private IService employeeService = new EmployeeService();
    private IService studentService = new StudentService();

    public void menuAddMilitary() throws IOException {
        while (true) {
            System.out.println("_________");
            System.out.println("chao munng");
            System.out.println("1. them nhan vien");
            System.out.println("2.them hoc sinh");
            System.out.println("3.exit");
            System.out.println("moi ban nhap chuc nang 1-->3");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    employeeService.add();
                    break;
                case 2:

                    studentService.add();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("ban nhap khong dung chuc nang");
                    break;

            }
        }
    }


}
