package ss2_loop_and_array.thuc_hanh;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int count = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(count==0){
            System.out.println("so nguyen to"+number);
        }else {
            System.out.println("khoong phai laf so nguyen to");
        }

    }


}
