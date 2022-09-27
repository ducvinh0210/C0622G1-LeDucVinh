package furama_resort.controller;

import furama_resort.service.ICustomerService;
import furama_resort.service.impl.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class CustomerController {
    static Scanner scanner = new Scanner(System.in);
    static ICustomerService customerService = new CustomerService();


    public void menuCustomer() {
        while (true) {
            System.out.println("_______________________");
            System.out.println("Chào mừng bạn đến quản lý khách hàng của FURAMA RESORT");
            System.out.println("1. Hiển thị danh sách khách hàng");
            System.out.println("2. Thêm khách hàng vào danh sách");
            System.out.println("3. Sửa thông tin khách hàng");
            System.out.println("4. Ra menu chính");
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
                        System.out.println("Bạn nhập không đúng định dạng");
                        break;

                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Bạn nhập không đúng định dạng");
            }


        }

    }
}