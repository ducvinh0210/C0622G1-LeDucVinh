package student_management.controller;

import student_management.service.ITeacherService;
import student_management.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private ITeacherService teacherService = (ITeacherService) new TeacherService();

    public void menuManagementTeacher() {
        while (true) {
            System.out.println("_______________________________");
            System.out.println("Chào mừng bạn đến với chúng tôi");
            System.out.println("1.Hiển thị danh sách giảng viên");
            System.out.println("2.Thêm mới giảng viên ");
            System.out.println("3.Xóa giảng viên");
            System.out.println("4.Sửa thông tin giảng viên");
            System.out.println("5. Tìm thông tin giảng viên");
            System.out.println("6.Exit");
            try {
                System.out.println("Mời bạn nhập chức năng từ 1-->6");
                int choice2 = Integer.parseInt(scanner.nextLine());
                switch (choice2) {
                    case 1:
                        teacherService.displayAllTeacher();
                        break;
                    case 2:
                        teacherService.addTeacher();
                        break;
                    case 3:
                        teacherService.removeTeacher();
                        break;
                    case 4:
                        teacherService.changeInforTeacher();
                        break;
                    case 5:
                        teacherService.findInforTeacher();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Lựa chọn của bạn không đúng");
                }


            }catch (NumberFormatException e){
                System.out.println("Không đúng định dạng số, mời nhập lại");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
