package ss3_class_and_object_in_java.thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your rectangle \n"+ rectangle.display());
        System.out.println("perimeter of the rectangle "+ rectangle.getPerimter());
        System.out.println("area of the rectangle"+ rectangle.getArea());
    }
}
