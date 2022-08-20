package ss15_exception_handling_and_debug.practince.number_format_exception;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;

public class ArrayExample {
public Integer[] createRadom(){
    Random rd = new Random();
    Integer[] arr = new Integer[100];
    System.out.println(" nhập số phần tử mảng");
    for (int i = 0; i <100 ; i++) {
        arr[i]=rd.nextInt(100);
        System.out.println(arr[i]);
        
    }
    return arr;

    }

}
