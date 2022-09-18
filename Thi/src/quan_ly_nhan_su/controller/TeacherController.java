package quan_ly_nhan_su.controller;

import quan_ly_nhan_su.service.ITeacherService;
import quan_ly_nhan_su.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    static ITeacherService teacherService = new TeacherService();

    public  void menuDisplayTeacher() throws IOException {
        while (true) {
            System.out.println("1.them moi gv");
            System.out.println("2.xoa gv");
            System.out.println("3.hien thi gv");
            System.out.println("4.exit");
            int choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2) {
                case 1:
                    teacherService.addTeacher();
                    break;
                case 2:
                    teacherService.removeTeacher();
                    break;
                case 3:
                    teacherService.displayTeacher();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("ban nhap sai lua chon");


            }
        }
    }
}
