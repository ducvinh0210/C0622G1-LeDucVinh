package quan_ly_nhan_su.controller;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    private static final Scanner scanner = new Scanner(System.in);
    static StudentController studentController = new StudentController();
    static TeacherController teacherController = new TeacherController();

    public  void menuDisplay() throws IOException {
        while (true) {
            System.out.println("_____________________________");
            System.out.println("chao mung ban den voi chung toi");
            System.out.println("1.quan ly hoc vien");
            System.out.println("2.quan ly giao vien");
            System.out.println("3.exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.menuDisplayStudent();
                    break;
                case 2:
                    teacherController.menuDisplayTeacher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("ban nhap khong dung chuc nang");


            }

        }

    }
}