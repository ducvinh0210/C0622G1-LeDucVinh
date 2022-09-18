package quan_ly_phuong_tien.controller;

import quan_ly_phuong_tien.service.IMotorBikeService;
import quan_ly_phuong_tien.service.impl.MotorBikeService;

import java.util.Scanner;

public class MotorBikeController {
    static Scanner scanner = new Scanner(System.in);
    static IMotorBikeService motorBikeService = new MotorBikeService();

    public void menuDisplayMotorBike() {
        while (true) {
            System.out.println("1.them xe may");
            System.out.println("2.hien thi xe may");
            System.out.println("3.xoa xe may");
            System.out.println("4.sua danh sach xe may");
            System.out.println("5. exit");
            System.out.println("moi ban nhap chuc nang1-->5");
            int choice3 = Integer.parseInt(scanner.nextLine());

            switch (choice3) {
                case 1:
                    motorBikeService.addMotorBike();
                    break;
                case 2:
                    motorBikeService.displayAllMotorBike();
                    break;
                case 3:
                    motorBikeService.removeMotorBike();
                    break;
                case 4:
                    motorBikeService.findMotorBike();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("ban nhap khong dung dinh dang");

            }
        }


    }
}