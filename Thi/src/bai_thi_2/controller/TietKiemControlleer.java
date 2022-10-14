package bai_thi_2.controller;

import java.util.Scanner;

public class TietKiemControlleer {
    static Scanner scanner= new Scanner(System.in);

    public void menuA(){
        while (true){
            System.out.println("____________________________");
            System.out.println("Chào mừng bạn đến quản lý        ");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            try {
                System.out.println("Mời bạn nhập chức năng 1-->");
                int choice1= Integer.parseInt(scanner.nextLine());
                switch (choice1){
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
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng");
            }
        }
    }

}
