package quan_ly_hoc_sinh.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();


    public void menuDisplay() throws IOException {
        while (true) {
            System.out.println("1. quan ly hoc sinh");
            System.out.println("2. quan ly nhan vien");
            System.out.println("3. exit");
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
                    System.out.println("ban nhap khong dung dinh dang");

            }
        }
    }
}
