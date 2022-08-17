package thuc_hanh_chung.test2;

import java.util.LinkedList;
import java.util.Queue;

public class TestNumber1 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());




    }



}
