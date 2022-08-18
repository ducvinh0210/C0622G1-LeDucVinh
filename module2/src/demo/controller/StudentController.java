package demo.controller;

import demo.model.Student;
import demo.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();
    public void menuManagement(){
       while (true){
           System.out.println("chao mung ban den voi c06");
           System.out.println("1. Them moi\n" +
                   "2. Hien thi\n" +
                   "3. Ket thuc");
           Scanner scanner = new Scanner(System.in);
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   studentService.themMoi();
                   break;
               case 2:
                   studentService.displayAll();
                   break;

           }
       }

    }



}
