package ss2_loop_and_array.bai_tap;
import java.util.Scanner;
import java.util.Arrays  ;
public class SumOfTheNumbersOnTheDiagonalOfTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int number1 = sc.nextInt();
        System.out.println("nhap so cot");
        int number2 = sc.nextInt();
        int[][] arr = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.println("nhap cac phan tu trong mang");
                arr[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < number1; i++) {
            total = total + arr[i][i];
        }
        System.out.println(total);
    }
}
