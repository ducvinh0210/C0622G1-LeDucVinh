package test1.controller;

import test1.service.ICarService;
import test1.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    private static Scanner scanner = new Scanner(System.in);
private ICarService carService = new CarService();



    public void menuManage() {
        while (true) {
            System.out.println("________________________________");

            System.out.println("Chon thao tac");
            System.out.println("1. Them moi");
            System.out.println("2. Hien thi");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem");
            System.out.println("0. exit");
            System.out.println("Mời bạn nhập chức năng từ 0-->4:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    carService.create();
                    break;
                case 2:
                    carService.display();
                    break;
                case 3:
                    carService.remove();
                    break;
                case 4:
                    carService.find();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");

            }



        }


    }

}