package test1.controller;

import test1.service.ICarService;
import test1.service.impl.CarService;

import java.util.Scanner;

public class TransportController {
    private static Scanner scanner = new Scanner(System.in);
private ICarService carService = new CarService();



    public void menu() {
        while (true) {
            System.out.println("________________________________");

            System.out.println("moi chon loai xe");
            System.out.println("1. car");
            System.out.println("2. xe tai");
            System.out.println("3. xe may");
            System.out.println("4. exit");
            System.out.println("Mời bạn nhập chức năng từ 1-->4:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    carService.display();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");

            }



        }


    }
}