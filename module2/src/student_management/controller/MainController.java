package student_management.controller;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();


    public void menuManagement() {
        while (true) {
            System.out.println("__________________________");
            System.out.println("1. Quản lý sinh viên");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Exit");
            try {
                System.out.println("Mời bạn nhập chức năng thực hiện");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    studentController.menuManagementStudent();
                } else if (choice == 2) {
                    teacherController.menuManagementTeacher();
                } else if (choice == 3) {
                    return;

                } else {
                    System.out.println("Bạn nhâp sai,mời bạn nhập lại chức năng");
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng số mời bạn nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
