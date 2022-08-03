package ss2_loop_and_array.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao day");
        int number = sc.nextInt();

        // System.out.println("nhap vi tri can chen");
        int index ;
        do {
            System.out.println("nhap vi tri can chen");
            index = sc.nextInt();
            if (index<= -1  ||  index >= (arr.length-1)){
                System.out.println("khong the chen phan tu vao mang");
            }
        }while (index<=-1 || index>=(arr.length-1));
        for (int i = arr.length-1; i > index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=number;
        System.out.println(Arrays.toString(arr));
    }
}
