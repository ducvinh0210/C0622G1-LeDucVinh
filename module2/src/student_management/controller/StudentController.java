package student_management.controller;

import student_management.service.IStudentService;
import student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService =  new StudentService();

    public void menuManagementStudent() {
        while (true) {
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với chúng tôi");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Sửa thông tin học sinh");
            System.out.println("5. Tìm kiếm học sinh");
            System.out.println("6. Exit");
                try {
                System.out.println("Mời bạn nhập chức năng từ 1-->6");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        studentService.showAllStudent();
                        break;
                    case 2:
                        studentService.addStudent();
                        break;
                    case 3:
                        studentService.removeStudent();
                        break;
                    case 4:
                        studentService.changeInforStudent();
                        break;
                    case 5:
                        studentService.findInforStudent();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Lựa chọn bạn không đúng");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng số, mời nhập lại");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
