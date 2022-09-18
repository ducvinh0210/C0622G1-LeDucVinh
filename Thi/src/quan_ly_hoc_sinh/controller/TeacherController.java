package quan_ly_hoc_sinh.controller;

import quan_ly_hoc_sinh.service.ITeacherService;
import quan_ly_hoc_sinh.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class TeacherController {
static Scanner scanner= new Scanner(System.in);
ITeacherService teacherService= new TeacherService();
 public  void menuDisplayTeacher() throws IOException {
     while (true) {
         System.out.println("1.them moi giao vien");
         System.out.println("2. xoa giao vien");
         System.out.println("3. hien thi giao vien");
         System.out.println("4. exit");
         int choice2 = Integer.parseInt(scanner.nextLine());
         switch (choice2) {
             case 1:
                 teacherService.addTeacher();
                 break;
             case 2:
                 teacherService.removeTeacher();
                 break;
             case 3:
                 teacherService.displayAllTeacher();
                 break;
             case 4:
                 return;
             default:
                 System.out.println("ban nhap khong dung dinh dang");

         }


     }
 }
}
