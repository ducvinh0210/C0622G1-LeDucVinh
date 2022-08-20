package exercise_mvc.exercise1.controller;

import exercise_mvc.exercise1.service.IStudentService;
import exercise_mvc.exercise1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = new StudentService();

    public void menuManagement() {
        while (true) {
            System.out.println("________________________________");
            System.out.println("Chào mừng bạn đến với C06");
            System.out.println("1. Hiển thị danh sách học viên");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Tìm thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Sắp xếp học sinh");
            System.out.println("6. Exit");
            System.out.println("Mời bạn nhập chức năng từ 1-->5:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:

                    studentService.searchStudent();
                    break;
                case 4:
                    studentService.removeStudent();
                    break;
                case 5:
                    studentService.sortStudent();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");
            }
        }
    }
}
