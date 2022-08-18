package ss14_sort_algorithm.exercise;

import java.util.Scanner;

public class InsertSortByStep {
    //Tạo lớp InsertSortBYStep tạo hàm main tạo 1 mảng để cho người dùng nhập vào.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập các phần tử trong mảng" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        // Hiển thị mảng sau sắp xếp.
        insertSortByStep(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    // khởi tạo phương thức insertSortByStep(int arr[]) thực hiện thuậ toán sắp xếp chèn

    public static void insertSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = key;
        }
    }


}

