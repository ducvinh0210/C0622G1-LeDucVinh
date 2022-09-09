package bai_thi.controller;

import exercise_mvc.exercise1.utils.read_write.ReadFile;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
Scanner scanner= new Scanner(System.in);
AddMilitaryController addMilitaryController=new AddMilitaryController();
RemoveMilitaryController removeMilitaryController=new RemoveMilitaryController();
DisplayMilitaryController displayMilitaryController= new DisplayMilitaryController();
 public  void displayMenu() throws IOException {
     while (true){
         System.out.println("1.them moi nhan su");
         System.out.println("2.xoa nhan su");
         System.out.println("3. hien thi danh sach nhan su");
         System.out.println("4. exit");
         System.out.println("nhap chuc nang 1-->4");
         int choice= Integer.parseInt(scanner.nextLine());
         switch (choice){
             case   1:

                 addMilitaryController.menuAddMilitary();
                 break;
             case 2:
                 removeMilitaryController.menuRemoveMititary();
                 break;
             case 3 :
                 displayMilitaryController.menuDisplayMilitary();
                 break;
             case 4:
                 return;
             default:
                 System.out.println("nhap khong dung chuc nang");

         }
     }
 }
}
