package ss14_sort_algorithm.practince.poamy_sort_algorithm;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so  phan tu");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println(" moi ban nhap tung phan tu trong mang");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("mang cua ban");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("mang da duoc sap xeep");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;


        
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }

            }
            if (needNextPass == false) {
                System.out.println("Mang da duoc sap xep");
                break;
            }
        }
    }


}
