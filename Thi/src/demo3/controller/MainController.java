package demo3.controller;

import demo3.service.IStudentService;
import demo3.service.StudentService;

import java.util.Scanner;

public class  MainController {
    static Scanner scanner = new Scanner(System.in);
    static IStudentService studentService = new StudentService();

    public void menuManagent() {
        boolean flag = true;
        while (true) {

            System.out.println("1.sap xep hoc sinh");
            System.out.println("2.hien thi hoc sinh");
            System.out.println("3.thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.sortStudent();
                    break;
                case 2:
                    studentService.displayAllStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("ban nhap khong dung dinh dang");

            }

        }


    }
}
