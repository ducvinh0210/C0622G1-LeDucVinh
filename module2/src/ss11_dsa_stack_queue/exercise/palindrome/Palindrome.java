package ss11_dsa_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("nhập chuỗi cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
        String inputString= scanner.nextLine();
        Queue<String> queue =new LinkedList<>();
        for (int i = inputString.length()-1; i >=0 ; i--) {
            queue.add(String.valueOf(inputString.charAt(i)));
        }
        String reverseString="";
        while (!queue.isEmpty()){
            reverseString = reverseString+ queue.remove();

        }
        if(inputString.equals(reverseString)){
            System.out.println("Đây là dãy số Palindrome");
        }else {
            System.out.println("Đây không phải là dãy số Palindrome");
        }
    }
}
