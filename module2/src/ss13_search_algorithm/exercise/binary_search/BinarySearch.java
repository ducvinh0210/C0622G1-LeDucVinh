package ss13_search_algorithm.exercise.binary_search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang");
        int number = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[number];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhap so phan tu trong mang "+(i+1));
            arr[i]= Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi duoc sap xep");
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 7));

    }
    public static int binarySearch(int[] arr, int value){
        int left = 0;
        int right= arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==value){
                return mid;
            }else if(arr[mid]>value){
                right= mid-1;
            }else {
                left = mid+1;
            }
        }
return -1;
    }

}
