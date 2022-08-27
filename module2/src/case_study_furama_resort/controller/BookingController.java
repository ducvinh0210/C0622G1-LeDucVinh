package case_study_furama_resort.controller;

import case_study_furama_resort.service.IBookingService;
import case_study_furama_resort.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    private IBookingService bookingService = new BookingService();

    public void displayBookingMenu() {
        while (true) {
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với Furama Resort của chúng tôi");
            System.out.println("1. Đặt thêm chỗ mới");
            System.out.println("2. Hiển thị danh sách đã đặt");
            System.out.println("3. Tạo hợp đồng mới");
            System.out.println("4. Hiển thị danh sách hợp đồng");
            System.out.println("5. Sửa hợp đồng");
            System.out.println("6. Quay lại trang chính");
            try {
                System.out.println("Mời bạn nhập chức năng từ 1-->6");
                int choice4 = Integer.parseInt(scanner.nextLine());
                switch (choice4) {
                    case 1:
                        bookingService.addBooking();
                        break;
                    case 2:
                        bookingService.displayBooking();
                        break;
                    case 3:
                        bookingService.creatNewContract();
                        break;
                    case 4:
                        bookingService.displayContract();
                        break;
                    case 5:
                        bookingService.editContract();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Lựa chọn bạn không đúng");
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng dạng số, mời nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
