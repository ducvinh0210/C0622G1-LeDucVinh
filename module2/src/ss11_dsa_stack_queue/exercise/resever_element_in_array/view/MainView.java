package ss11_dsa_stack_queue.exercise.resever_element_in_array.view;

import java.util.Arrays;
import java.util.Stack;

public class MainView {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Stack<Integer> integerStack= new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            integerStack.push(arr[i]);
        }
        System.out.println("Mảng trước khi đảo ngược:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=integerStack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược: " );
        System.out.println(Arrays.toString(arr));
    }
}
