package quan_ly_phuong_tien.controller;

import quan_ly_phuong_tien.service.ICarService;
import quan_ly_phuong_tien.service.impl.CarService;

import java.io.IOException;
import java.util.Scanner;

public class CarController {
    private static Scanner scanner= new Scanner(System.in);
   static ICarService carService= new CarService();

   public void menuDisplayCar() throws IOException {
       while (true){
           System.out.println("1.them moi xe oto");
           System.out.println("2. hien thi phuong tien");
           System.out.println("3.xoa phuong tien");
           System.out.println("4.tim kiem phuong tien");
           System.out.println("5.ra menu chinh");
           System.out.println("mời ban nhap chu năng 1-->5");
           int choice1= Integer.parseInt(scanner.nextLine());
           switch (choice1){
               case 1:
                   carService.addCar();
                   break;
               case 2:
                   carService.displayAllCar();
                   break;
               case 3:
                   carService.removeCar();
                   break;
               case 4:
                   carService.findCar();
                   break;
               case 5:
                   return;
               default:
                   System.out.println("ban nhap sai chuc nang");

           }
       }

   }








}
