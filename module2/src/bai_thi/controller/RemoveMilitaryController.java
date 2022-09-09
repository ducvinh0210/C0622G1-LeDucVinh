package bai_thi.controller;

import bai_thi.service.IService;
import bai_thi.service.impl.EmployeeService;
import bai_thi.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class RemoveMilitaryController {
private static Scanner scanner= new Scanner(System.in);
private IService employeeService= new EmployeeService();
private IService studentServiec= new StudentService();
public void menuRemoveMititary() throws IOException {
    while (true){
        System.out.println("1.xoa nhan vien");
        System.out.println("2.xoa hoc sinh");
        System.out.println("3.exit");
        System.out.println("moi ban nhap chuc nang 1-->3");
        int choice2= Integer.parseInt(scanner.nextLine());
        switch (choice2){
            case 1 :
                employeeService.remove();
                break;
            case 2:
                studentServiec.remove();
                break;
            case 3:
                return;
            default:
                System.out.println("ban nhap khong dung dinh dang");
                break;

        }
    }
}

}
