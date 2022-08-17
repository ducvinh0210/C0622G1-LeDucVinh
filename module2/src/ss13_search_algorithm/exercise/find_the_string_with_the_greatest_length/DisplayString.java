package ss13_search_algorithm.exercise.find_the_string_with_the_greatest_length;

import java.util.LinkedList;
import java.util.Scanner;

public class DisplayString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getFirst()) {
                    list.add(string.charAt(j));
                }

            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();

        }
        for (Character ch : max) {
            System.out.print(ch+",");
        }
        System.out.println();
    }
}
