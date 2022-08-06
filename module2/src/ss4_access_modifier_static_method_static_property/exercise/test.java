package ss4_access_modifier_static_method_static_property.exercise;
import java .util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Square matrix's length has the same values as its row. Enter the number of rows: ");
        int arrRow = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[arrRow][arrRow];
        for (int i = 0; i < arrRow; i++) {
            for (int j = 0; j < arrRow; j++) {
                System.out.println("Enter the element of the array: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.printf("Your array: %s", Arrays.deepToString(arr));
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];

        }
        System.out.println();
        System.out.printf("Total of diagonal values of the square matrix is %d", total);

    }
}
