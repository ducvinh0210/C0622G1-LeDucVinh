package demo;

import sun.nio.cs.StreamEncoder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test1 {
    public static void main(String[] args) {
        Deque<String> danhSachSV= new ArrayDeque<>();
        danhSachSV.offer("le duc vinh");
        danhSachSV.offer("le thi hong vy");
        danhSachSV.offer("pham thi vi");
        danhSachSV.offerFirst("le duc nam");
        danhSachSV.offerLast("nguyen manh cuong");

        while (true){
            String ten=danhSachSV.poll();
            if (ten== null){
                break;
            }
            System.out.println(ten);

        }
    //  String ten= danhSachSV.poll();
      //  System.out.println(ten);
        for (String string:danhSachSV) {
            System.out.println(string);

        }

    }
}
