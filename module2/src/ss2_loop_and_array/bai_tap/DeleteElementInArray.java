package ss2_loop_and_array.bai_tap;
import java.util.Scanner;
public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10,12,14,16,18,20,22,24,28,26,28,30};

        int number;

        System.out.println("nhap so");
        number = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]) {
                for (int j = i; j < (arr.length - 1); j++) {
                    arr[j] = arr[j + 1];
                    i--;
                }
                arr[arr.length - 1] = 0;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length-1]);
    }
}
