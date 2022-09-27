package ss13_sort_algorithm;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        int number= Integer.parseInt(scanner.nextLine());
        int []arr= new int[number];
        for (int i = 0; i <arr.length ; i++) {
            arr [i]= Integer.parseInt(scanner.nextLine());
        }
     boolean   check= true ;

        for (int i = 0; i <arr.length-1 && check; i++) {
            check= false;
            for (int j = 0; j <arr.length-1-i  ; j++) {
                check= true;
                int temp= arr[j+1];
                arr[j+1]= arr[j];
                arr[j]= temp;

            }


        }
        for (int arr1:arr) {
            System.out.println(arr1);
        }
    }





}
