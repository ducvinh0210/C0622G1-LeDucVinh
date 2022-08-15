package ss11_dsa_stack_queue.exercise.check_brackets;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        String str = "(s*(s-a)*(s-b)*(s-c)";
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='('){
                characterStack.push(str.charAt(i));
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==')'){
                characterStack.pop();
            }
        }
        if(characterStack.isEmpty()){
            System.out.println("Thỏa mãn điều kiện");
        }else {
            System.out.println("không thỏa mãn điều kiện");
        }

    }

}
// Em mới làm một trường hợp còn trường hợp dấu ')' nhiều hơn dấu '(' thì cem chưa biết làm.
