package luyen_tap_thi_module2.controller;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();

    public void displayMenu() throws IOException {
       while (true){
        System.out.print("___________\n" +
                "Chao mung .\n" +
                "1.quan ly hoc sinh\n" +
                "2.quan ly giao vien.\n" +
                "3.exit\n" +
                "moi ban nhap chuc nang 1-->3: ");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                studentController.menuManagementStudent();
                break;
            case    2:
                teacherController.menuManagementTeacher();
                break;
            case 3:
                return;
            default:
                System.out.println("ban nhap khong dung chuc nang");
        }
       }
    }
}
