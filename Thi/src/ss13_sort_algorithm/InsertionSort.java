package ss13_sort_algorithm;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so phan tu mang");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac phan tu cua mang");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        boolean check= true;
        for (int i = 0; i <arr.length-1 ; i++) {
            check= false;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    check= true;
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;


                }
            }

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }
}
