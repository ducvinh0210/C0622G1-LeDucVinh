package ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.controller;

import ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.service.IProductService;
import ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private IProductService productService = new ProductService();

    public void menuManagement() {
        while (true) {
            System.out.println("________________________________");
            System.out.println("Chào mừng bạn đến với cua hang cua chung toi");
            System.out.println("1. them san pham");
            System.out.println("2.sua san pham");
            System.out.println("3. xoa san pham");
            System.out.println("4. hien thi san pham");
            System.out.println("5.tim kiem san pham");
            System.out.println("6.sap xep san pham");
            System.out.println("7. Exit");
            System.out.println("Mời bạn nhập chức năng từ 1-->7:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.fixProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;

                case 4:
                    productService.displayAllProduct();
                    break;
                case 5:
                    productService.findProduct();
                    break;
                case 6:
                    productService.sortProduct();
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");
            }
        }
    }

}
