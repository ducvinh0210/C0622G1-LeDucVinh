package luyen_tap_thi_module2.controller;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import luyen_tap_thi_module2.service.IStudentService;
import luyen_tap_thi_module2.service.impl.StudentService;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
   private static Scanner scanner = new Scanner(System.in);
   private IStudentService studentService= new StudentService();


    public void menuManagementStudent() throws IOException {
       while (true){
           System.out.print("___________\n" +
                   "Chao mung .\n" +
                   "1.hien thi danh sach hoc sinh\n" +
                   "2. them hoc sinh\n" +
                   "3. xoa hoc sinh\n" +
                   "4.sua hoc sinh\n" +
                   "moi ban nhap chuc nang 1-->4:");
           int choice1= Integer.parseInt(scanner.nextLine());
           switch (choice1){
               case 1:
                   studentService.display();
                   break;
               case 2:
                   studentService.add();
                   break;
               case 3:
                   studentService.remove();
                   break;
               case 4:
                   studentService.edit();
                   break;
               case 5:
                   return;
               default:
                   System.out.println("ban nhap khong dung chuc nang");

           }
       }


    }

}
