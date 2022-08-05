package ss3_class_and_object_in_java.bai_tap.class_quadratic_equation;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("phuong trinh bac 2 co  nghiem kep : %.2f \n", quadraticEquation.getRoot0());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("phuong trinh bac 2 co 2 nghiem: %.2f and %.2f \n", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());

        } else {
            System.out.println("phuong trinh vo nghiem");
        }


    }







}
