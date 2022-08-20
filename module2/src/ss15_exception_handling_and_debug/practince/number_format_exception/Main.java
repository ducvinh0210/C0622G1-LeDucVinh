package ss15_exception_handling_and_debug.practince.number_format_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRadom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n vui long nhap chi so cua mot phan tu bat ky");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5" + x + "la" + arr[x]);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("chi so vuot qua gioi han cua mang");
        }
    }
}