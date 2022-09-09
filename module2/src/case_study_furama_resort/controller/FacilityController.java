package case_study_furama_resort.controller;

import case_study_furama_resort.service.IFacilityService;
import case_study_furama_resort.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private IFacilityService facilityService = new FacilityService();

    public void displayFacilityMenu() {
        while (true) {
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với Furama Resort của chúng tôi");
            System.out.println("1. Hiển thị danh sách cơ sở");
            System.out.println("2. Thêm cơ sở");
            System.out.println("3. Hiển thị danh sách cơ sở cần bảo trì");
            System.out.println("4. Trả về trang chính");
            try {
                System.out.println("Mời bạn nhập chức năng từ 1-->4");
                int choice3 = Integer.parseInt(scanner.nextLine());
                switch (choice3) {
                    case 1:
                        facilityService.displayFacility();
                        break;
                    case 2:
                        facilityService.addFacility();
                        break;

                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không đúng");

                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng dạng số, mời nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
