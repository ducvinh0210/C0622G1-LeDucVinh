package furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeController employeeController = new EmployeeController();
    static CustomerController customerController = new CustomerController();
    static FacilityController facilityController = new FacilityController();
    static BookingController bookingController = new BookingController();
    static PromotionController promotionController = new PromotionController();

    public void menuFurama() {
        while (true) {
            System.out.println("________________________");
            System.out.println("Chào mừng bạn đến FURAMA RESORT");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý cơ sở vật chất");
            System.out.println("4. Quản lý đặt phòng");
            System.out.println("5. Quản lý hợp đồng");
            System.out.println("6. Thoát");
            try {
                System.out.println("mời bạn nhập chức năng 1-->6");
                int choice= Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        employeeController.menuEmployee();
                        break;
                    case 2:
                        customerController.menuCustomer();
                        break;
                    case 3:
                        facilityController.menuFacility();
                        break;
                    case 4:
                        bookingController.menuBooking();
                        break;
                    case 5:
                        promotionController.menuPromotion();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");
                        break;

                }

            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung");
            }

        }


    }
}