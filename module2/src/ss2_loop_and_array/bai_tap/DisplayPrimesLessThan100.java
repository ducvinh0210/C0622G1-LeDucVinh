package ss2_loop_and_array.bai_tap;
import java.util.Scanner;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        int prime;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so ");
//        number = sc.nextInt();
        while (true) {
            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                prime = number;
                System.out.println(prime);
                // count++;
            }
            number++;
            if (number == 100) {
                break;
            }

        }
    }
}




