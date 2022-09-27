package furama_resort.controller;

import furama_resort.service.IFacilityService;
import furama_resort.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    static Scanner scanner = new Scanner(System.in);
    static IFacilityService facilityService = new FacilityService();


    public void menuFacility() {
        while (true) {
            System.out.println("______________________");
            System.out.println("Chào mừng bạn đến quản lý cơ sở của FURAMA RESORT");
            System.out.println("1. Hiển thị danh sách cơ sở");
            System.out.println("2. Thêm  cơ sở");
            System.out.println("3. Hiển thị danh sách cơ sở cần bảo trì");
            System.out.println("4. Ra menu chính");
            try {
                System.out.println("moi ban nhap chuc nang 1-->4");
                int choice3 = Integer.parseInt(scanner.nextLine());
                switch (choice3) {
                    case 1:
                        facilityService.displayAllFacility();
                        break;
                    case 2:
                        facilityService.addFacility();
                        break;
                    case 3:
                        facilityService.displayFacilityMaintenance();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung ");
            }


        }
    }
}