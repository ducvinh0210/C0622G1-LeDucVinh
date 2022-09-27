package quan_ly_phuong_tien.controller;

import quan_ly_phuong_tien.service.ITruckService;
import quan_ly_phuong_tien.service.impl.TruckService;

import java.io.IOException;
import java.util.Scanner;

public class TruckController {





    private static Scanner scanner= new Scanner(System.in);
    static ITruckService truckService= new TruckService();


    public void menuDisplayTruck() throws IOException {
        while (true){
            System.out.println("1.them moi xe tai");
            System.out.println("2.hien thi danh sach xe");
            System.out.println("3. xoa xe");
            System.out.println("4.tim  xe");
            System.out.println("5 exit");
            System.out.println("moi ban nhap chuc nang 1-->5");
            int choice2= Integer.parseInt(scanner.nextLine());
             switch (choice2){
                 case 1:
                     truckService.addTruck();
                     break;
                 case 2:
                     truckService.displayAllTruck();
                     break;
                 case 3:
                     truckService.removeTruck();
                     break;
                 case   4:
                     truckService.findTruck();
                     break;
                 case 5:
                     return;
                 default:
                     System.out.println("ban nhap khong dung chuc nang");
                     break;

             }
        }



    }
}
