package ss2_loop_and_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        for (int i = 0; i <10 ; i++) {
            System.out.println("nhap du lieu vao");
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int max= arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
