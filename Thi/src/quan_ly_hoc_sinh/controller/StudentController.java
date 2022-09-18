package quan_ly_hoc_sinh.controller;

import quan_ly_hoc_sinh.service.IStudentService;
import quan_ly_hoc_sinh.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
  static Scanner scanner= new Scanner(System.in);

    IStudentService studentService = new StudentService();



    public void menuDisplayStudent() throws IOException {
        while (true){
        System.out.println("chao mung ban den voi quan ly hoc sinh");
        System.out.println("1. them hoc sinh");
        System.out.println("2. xoa  hoc sinh");
        System.out.println("3. hien thi hoc sinh");
        System.out.println("4.exit");
        int choice1= Integer.parseInt(scanner.nextLine());
        switch (choice1){
            case 1:
                studentService.addStudent();
                break;
            case 2:
                studentService.removeStudent();
                break;
            case 3:
                studentService.displayStudent();
                break;
            case 4:
                return ;

            default:
                System.out.println("ban nhap khong dung dinh dang");

        }


    }
}
}
