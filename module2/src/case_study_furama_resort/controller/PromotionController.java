package case_study_furama_resort.controller;

import case_study_furama_resort.service.IPromotionService;
import case_study_furama_resort.service.impl.PromotionService;
import sun.security.x509.OCSPNoCheckExtension;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);
    private IPromotionService promotionService = new PromotionService();

    public void displayPromotionMenu() {
        while (true) {
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với Furama Resort của chúng tôi");
            System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ");
            System.out.println("2. Hiển thị danh sách khách hàng nhận khuyến mãi");
            System.out.println("3. Quay lại trang chính");
            try {
                System.out.println(" Mời bạn nhập chức năng 1-->3");
                int choice4 = Integer.parseInt(scanner.nextLine());
                switch (choice4) {
                    case 1:
                        promotionService.displayCustomerUseService();
                        break;
                    case 2:
                        promotionService.displayCustomerGetVoucher();
                        break;
                    case 3:
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
