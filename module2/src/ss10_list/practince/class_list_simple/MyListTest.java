package ss10_list.practince.class_list_simple;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element 4" + listInteger.get(4));
        System.out.println( "element 1 "+ listInteger.get(1));
        System.out.println("element 2"+listInteger.get(2));

       




    }



}
