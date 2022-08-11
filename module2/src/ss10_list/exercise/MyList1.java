package ss10_list.exercise;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.Arrays;

public class MyList1<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY =10;
    private Object element[];
    public MyList1(){
    element = new Object[DEFAULT_CAPACITY];

    }
    private void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if(size==element.length){
            ensureCapa();
        }
        element[size++]= e;
    }
  private void checkIndex(int index){
        if(index<0|| index >=size){
            throw new IndexOutOfBoundsException("index"+index+"out of bounds");
        }
  }

////    public E remove(int index){
////        checkIndex(index);
////        E e = element[index];
////        for (int i = index; i <size-1 ; i++) {
////            element[i]=element[i+1];
////            element[size-1]= null;
////size--;
////return e;
//
//
//        }
//
//    }

}
