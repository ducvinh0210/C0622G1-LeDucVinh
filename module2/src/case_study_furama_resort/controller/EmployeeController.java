package case_study_furama_resort.controller;

import case_study_furama_resort.service.IEmployeeService;
import case_study_furama_resort.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private IEmployeeService employeeService = new EmployeeService();

    public void displayEmployeeMenu() {
        while (true) {
                System.out.println("_________________________");
                System.out.println("Chào mừng bạn đến với Furama Resort của chúng tôi");
                System.out.println("1. Hiển thị danh sách nhân viên");
                System.out.println("2. Thêm nhân viên");
                System.out.println("3. SỬa thông tin nhân viên");
                System.out.println("4. Trả về trang chính");
            try {
                System.out.println(" Mời bạn nhập chức năng 1-->4");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
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
                        System.out.println("Lựa chọn bạn không đúng");
                }
            }catch (NumberFormatException e){
                System.out.println("Bạn nhập không đúng dạng số, mời nhập lại");
            }catch (Exception e){
                System.out.println( e.getMessage());
            }
        }


    }
}
