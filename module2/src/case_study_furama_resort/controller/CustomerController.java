package case_study_furama_resort.controller;

import case_study_furama_resort.service.ICustomerService;
import case_study_furama_resort.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private ICustomerService customerService =  new CustomerService();

    public void displayCustomerMenu() {
        while (true) {
            System.out.println("_________________________");
            System.out.println("Chào mừng bạn đến với Furama Resort của chúng tôi");
            System.out.println("1. Hiển thị danh sách khách hàng");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. SỬa thông tin khách hàng");
            System.out.println("4. Trả về trang chính");
            try {
                System.out.println("Mời bạn nhập chức năng 1-->4");
                int choice2 = Integer.parseInt(scanner.nextLine());
                switch (choice2) {
                    case 1:
                        customerService.displayAllCustomer();
                        break;
                    case 2:
                        customerService.addCustomer();
                        break;
                    case 3:
                        customerService.editCustomer();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn bạn không đúng");

                }
            }catch (NumberFormatException e){
                System.out.println("Bạn nhập không đúng dạng số, mời nhập lại");
            }catch (Exception e){
                System.out.println( e.getMessage());
            }
        }
    }

}
