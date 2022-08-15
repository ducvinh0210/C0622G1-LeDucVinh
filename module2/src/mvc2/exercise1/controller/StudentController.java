package mvc2.exercise1.controller;

import mvc2.exercise1.service.IStudentService;
import mvc2.exercise1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService= new StudentService();
    public void menuManagement(){
        while (true){
            System.out.println("________________________________");
            System.out.println("Chào mừng bạn đến với C06");
            System.out.println("1. them hoc sinh");
            System.out.println("2. xoa hoc sinh");
            System.out.println("3. hien thi ds hoc sinh");

            System.out.println("4. Exit");
            System.out.println("Mời bạn nhập chức năng từ 1-->4:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
                    studentService.displayAllStudent();
                    break;

                case 4:

                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");
            }
        }


    }
}
