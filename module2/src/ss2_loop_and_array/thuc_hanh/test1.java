package ss2_loop_and_array.thuc_hanh;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,5,7,8,9,10};

        int x;

        System.out.println("Input the number you want to erase");
        x = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
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
