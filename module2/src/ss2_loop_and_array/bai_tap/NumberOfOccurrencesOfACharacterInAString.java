package ss2_loop_and_array.bai_tap;
import java.util.Scanner;
public class NumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        String str = new String("le duc vinh c0622g1");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi vao day");
        String str1= sc.nextLine();
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <str1.length() ; j++) {
                if(str1.charAt(j) ==str.charAt(i)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
