package test1.view;

import test1.controller.CarController;
import test1.service.ICarService;
import test1.service.impl.CarService;

import java.util.Scanner;

public class MainView {

    private static Scanner scanner = new Scanner(System.in);
    private static CarController carController = new CarController();

    public static void menu() {
        while (true) {
            System.out.println("________________________________");
            System.out.println("Chon loai phuong tien");
            System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. moto");
            System.out.println("0. exit");
            System.out.println("Mời bạn nhập chức năng từ 0-->3:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    carController.menu();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");

            }
        }


    }

    public static void main(String[] args) {
        menu();
    }
}
