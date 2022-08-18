package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertSort {
    static int[] arr = {2, 50, 34, 22, 11, 10, 20, 6, 12, 19, 98};

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];

            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
