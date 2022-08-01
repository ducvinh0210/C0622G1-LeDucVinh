package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class MoneyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter money: ");

        double USD= sc.nextDouble();
        double VND= USD*23000;
        System.out.println("USD "+USD);
        System.out.println("VND"+VND);
    }
}
