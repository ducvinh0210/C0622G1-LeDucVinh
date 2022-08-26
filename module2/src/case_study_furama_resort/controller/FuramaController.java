package case_study_furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();

    CustomerController customerController = new CustomerController();

    FacilityController facilityController = new FacilityController();

    BookingController bookingController = new BookingController();

    PromotionController promotionController = new PromotionController();


    public void displayMainMenu() {
        while (true) {
            System.out.println("______________________________");
            System.out.println("Chào mừng bạn đến Furama Resort của chúng tôi");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý cơ sở");
            System.out.println("4. Quản lý đặt phòng");
            System.out.println("5. Quản lý khuyến mãi");
            System.out.println("6. Thoát khỏi chương trình");

            System.out.println("Mời bạn nhập chức năng từ 1-->6");
            int choice = Integer.parseInt(scanner.nextLine());
          switch (choice) {
              case 1:
                    employeeController.displayEmployeeMenu();
                  break;
//                case 2:
//                    customerController.displayMainMenu();
//                    break;
//                case 3:
//                    facilityController.displayMainMenu();
//                    break;
          }
        }
    }
}


