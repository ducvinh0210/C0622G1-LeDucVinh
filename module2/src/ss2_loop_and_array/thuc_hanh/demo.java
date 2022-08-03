package ss2_loop_and_array.thuc_hanh;

import java.util.Arrays;

public class demo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] arr2 = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr.length + i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
