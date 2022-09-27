package test1;

public class test3 {
    public static void main(String[] args) {
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("*");

//            for (int j = 0; j <5; j++) {
//                System.out.println("*");
//            }
       // }
        //int number = 0;

        for (int i = 0; i <5 ; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <6 ; i++) {
            for (int j = 6-i; j <6 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


