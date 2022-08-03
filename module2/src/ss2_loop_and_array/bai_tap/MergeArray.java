package ss2_loop_and_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử mảng 1");
        int number1 = sc.nextInt();
        int[] arr = new int[number1];



        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac phan tu cua mang 1 vi tri" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap phan tu mang 2");
        int number2 = sc.nextInt();
        int[] arr1 = new int[number2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap cac pahn tu cua mang 2 vi tri" + i);
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[arr.length+arr1.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        for (int i = 0; i <arr1.length ; i++) {
            arr2[arr.length+i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
