package ss13_search_algorithm.exercise.find_the_longest_consecutive_string;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap mang");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
       // LinkedList<Character> str2= new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
         LinkedList<Character> str2= new LinkedList<>();
            str2.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j)>str2.getFirst()){
                    str2.add(string.charAt(j));
                }

            }
            if(str2.size()>max.size()){
                max.clear();
                max.addAll(str2);
            }
            str2.clear();
        }
        for(Character character: max ){
            System.out.println(character);
        }
        System.out.println();


    }
}
