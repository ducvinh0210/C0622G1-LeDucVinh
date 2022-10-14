package bai_thi_2.controller;

import java.util.Scanner;

public class ThanhToanController {
    static Scanner scanner= new Scanner(System.in);

    public void menuB(){
        while (true){
            System.out.println("______________________________");
            System.out.println("Chào mừng bạn đến quản lý       ");





           try{
               System.out.println("Mời bạn nhập chức năng 1-->");
               int choice2= Integer.parseInt(scanner.nextLine());
               switch (choice2){
                   case 1:
                       break;
                   case 2:
                       break;
                   case 3:
                       break;
                   case 4:
                       return;
                   default:
                       System.out.println("Bạn nhập không đúng chức năng");

               }

           } catch (NumberFormatException e) {
               System.out.println("Bạn nhập không đúng");
           }

        }
    }
}
