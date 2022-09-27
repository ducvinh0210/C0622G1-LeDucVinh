package ss13_sort_algorithm;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("bạn nhập số phần tử vào");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arrs= new int[number];
        for (int i = 0; i <arrs.length ; i++) {
            System.out.println("nhap phan tu mang"+(i+1));
            arrs[i]= Integer.parseInt(scanner.nextLine());
        }
      



    }

}


