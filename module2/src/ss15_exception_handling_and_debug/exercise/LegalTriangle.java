package ss15_exception_handling_and_debug.exercise;

import java.util.Scanner;

public class LegalTriangle {
    private static Scanner scanner = new Scanner(System.in);

    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("khong phai tam giac");
        } else {
            System.out.println("Đây là một tam giác ");
        }
    }

    public static void main(String[] args) {
        LegalTriangle triangle = new LegalTriangle();
        try {
            System.out.print("Nhập cạnh thứ nhất ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh thứ 2: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh thứ 3: ");
            int c = Integer.parseInt(scanner.nextLine());
            triangle.checkTriangle(a, b, c);
        } catch (IllegalTriangleException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println("sai so");
        }
    }
}
