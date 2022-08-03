package ss2_loop_and_array.bai_tap;

public class ShowMathShapes {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


