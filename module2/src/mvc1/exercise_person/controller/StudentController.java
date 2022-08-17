package mvc1.exercise_person.controller;

import exercise_mvc.exercise1.service.IStudentService;
import exercise_mvc.exercise1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService =new StudentService();
    public void menuStudent(){
        while (true){
            System.out.println("________________________________");
            System.out.println("1.thêm mới");
            System.out.println( "2.xóa");
            System.out.println("3.xem danh sách");
            System.out.println("0.thoát");
            System.out.println("mời bạn nhập chức năng từ 0-->3:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
//                    studentService.displayStudent();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn của bạn không đúng");

            }

        }
    }

}
