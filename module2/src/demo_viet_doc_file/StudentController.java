package demo_viet_doc_file;

import java.util.Scanner;

public class StudentController {
private static Scanner scanner= new Scanner(System.in);
private IStudentService studentService= new StudentService();

public void menuManagement(){
    while (true){
        System.out.println("_______________");
        System.out.println("Chào mừng bạn đến quản lý học sinh của chúng tôi\n" +
                "1.hiển thị danh sách học viên\n" +
                "2.thêm mới học viên\n" +
                "3.chỉnh sửa học viên\n" +
                "4.xóa học viên\t\t\n" +
                "5.exit");
        try {
            System.out.println("mời bạn nhập lựa chọn từ 1-->5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.displayAllStudent1();
                    break;
                case 2:
                    studentService.addStudent1();
                    break;
                case 3:
                    studentService.editStudent1();
                    break;
                case 4:
                    studentService.removeStudent1();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("bạn nhập không đúng định dạng");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("bạn nhập không đúng dạng số");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
}
