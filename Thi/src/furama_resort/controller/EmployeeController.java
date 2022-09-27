package furama_resort.controller;


import furama_resort.service.IEmployeeService;
import furama_resort.service.impl.EmployeeService;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeController {
    static Scanner scanner= new Scanner(System.in);

    static IEmployeeService employeeService= new EmployeeService();

    public void menuEmployee(){
        while (true){
            System.out.println("___________________________");
            System.out.println("Chào mừng bạn đến với quản lý nhân viên của FURAMA RESORT");
            System.out.println("1.Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Sửa nhân viên");
            System.out.println("4. Ra menu chính");
            try {
                System.out.println("Mời bạn nhập chức năng 1-->4");
                int choice1= Integer.parseInt(scanner.nextLine());
                switch (choice1){
                    case 1:
                        employeeService.displayAllEmployee();
                        break;
                    case 2:
                        employeeService.addEmployee();
                        break;
                    case 3:
                        employeeService.editEmployee();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("ban nhap khong dung");
            }


        }
    }




}
