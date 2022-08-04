package ss2_loop_and_array.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {

        int count = 0;
        int number =2;
        int prime;
        int count1;
        while (true) {
            count1=0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count1++;
                }
            }
            if (count1 == 0) {
                prime = number;
                System.out.println(prime);
                count++;
            }
            number++;
            if (count==20){
                break;
            }

        }
    }
}

