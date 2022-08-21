package ss15_exception_handling_and_debug.exercise;

import java.util.Scanner;

public class LegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b;
        double c;
        while (true) {
            try {
                System.out.println("nhap canh thu nhat:");
                a = Double.parseDouble(scanner.nextLine());
                if (a < 0) {
                    throw new IllegalTriangleException("do dai canh khong hop le");
                }
                System.out.println("nhap canh thu 2");
                b = Double.parseDouble(scanner.nextLine());
                if (b < 0) {
                    throw new IllegalTriangleException("do dai canh khong hop le");
                }
                System.out.println("nhap canh thu 3");
                c = Double.parseDouble(scanner.nextLine());
                if (c < 0) {
                    throw new IllegalTriangleException("do dai canh khong hop le");
                }
                if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                    throw new IllegalTriangleException("do dai canh khong hop le");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("do dai canh khong phai so");
            } catch (Exception e) {
                System.out.println(" du lieu ban nhap khong hop le");
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
