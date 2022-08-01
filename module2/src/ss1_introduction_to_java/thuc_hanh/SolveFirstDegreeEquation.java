package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b : ");
        b = sc.nextDouble();
        System.out.print("c : ");
        c = sc.nextDouble();
        if(a!=0){
            double  answer = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer );
        }else {
            if(b==c){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution");
            }
        }
    }
}
