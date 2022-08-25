package student_management.controller;

import student_management.service.IStudentService;
import student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = (IStudentService) new StudentService();

    public void menuManagementStudent(){
        while (true){
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với chúng tôi");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Sửa thông tin học sinh");
            System.out.println("5. Tìm kiếm học sinh");
            System.out.println("6. Exit");
//             try{
//                 System.out.println("Mời bạn nhập chức năng từ 1-->6");
//                 int choice1= Integer.parseInt(scanner.nextLine());
////                 switch (choice1){
////                     case 1:
////                         studentService.showAllStudent();
////                 }
//
//
//
//
//
//
//             }catch ()










        }
    }
}
