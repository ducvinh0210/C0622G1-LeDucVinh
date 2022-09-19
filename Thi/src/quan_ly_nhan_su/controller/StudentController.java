package quan_ly_nhan_su.controller;

import quan_ly_nhan_su.model.Student;
import quan_ly_nhan_su.service.IStudentService;
import quan_ly_nhan_su.service.impl.StudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    static IStudentService studentService = new StudentService();


    public void menuDisplayStudent() throws IOException {
        while (true) {
            System.out.println("________________________");
            System.out.println("1.them hoc sinh moiw");
            System.out.println("2.xoa hoc sinh");
            System.out.println("3. hien thi hoc sinh");
            System.out.println("4.sua thong tin hoc sinh");
            System.out.println("5.sap xep hoc sinh");
            System.out.println("6.tim kiem hoc sinh");
            System.out.println("7.exit");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
                    studentService.displayStudent();
                    break;
                case 4:
                    studentService.editStudent();
                    break;
                case 5:
                    studentService.sortStudent();
                    break;
                case 6:
                    studentService.findInfoStudent();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("ban nhap khong dung dinh dang");

            }
        }
    }

}
