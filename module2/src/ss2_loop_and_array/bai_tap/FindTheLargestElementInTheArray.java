package ss2_loop_and_array.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class FindTheLargestElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int number= sc.nextInt();
        System.out.println("nhap so cot");
        int number1= sc.nextInt();
        int[][] arr=new int[number][number1];
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number1 ; j++) {
                System.out.println("nhap cac phan tu trong mang");
                arr[i][j]= sc.nextInt();
            }
        }
       int max = arr[0][0];
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number1 ; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
