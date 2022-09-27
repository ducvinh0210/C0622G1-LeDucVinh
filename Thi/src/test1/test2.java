package test1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        System.out.println("mời bạn nhập năm sinh");
//        int dateOfBirth= Integer.parseInt(scanner.nextLine());
//        LocalDate localDate= LocalDate.now();
//        int year= localDate.getYear();
//        int doTuoi= year-dateOfBirth;
//        System.out.println(doTuoi);
//
//        //bài 2
//        System.out.println("mòi bạn nhập số thứ nhất");
//        int number1= Integer.parseInt(scanner.nextLine());
//        System.out.println("mời bạn nhập số thứ 2");
//        int number2= Integer.parseInt(scanner.nextLine());
//        int total= number1+number2;
//        System.out.println(total);
//        int hieu= number1-number2;
//        System.out.println(hieu);
//        System.out.println(number1*number2);
//        System.out.println(number1/number2);
//
// bài 3
//        System.out.println("nhập tên sản phẩm");
//        String nameProduct= scanner.nextLine();
//        System.out.println("nhập số lượng sản phẩm");
//        int amount= Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập giá bán");
//        double price= Double.parseDouble(scanner.nextLine());
//        double money= amount*price;
//        System.out.println(money);
//        System.out.println("thuế giá trị gia tăng");
//        System.out.println(money*0.1);
//

//        System.out.println("nhập điểm thi môn toán");
//        double scoreMath= Double.parseDouble(scanner.nextLine());
//        System.out.println("nhập điểm thi môn Lý");
//        double scorePhysics= Double.parseDouble(scanner.nextLine());
//        System.out.println("nhạp điểm thi môn hóa");
//        double scoreChemistry= Double.parseDouble(scanner.nextLine());
//         double averageScore= (scoreChemistry+scoreMath+scorePhysics)/3;
//        System.out.println(averageScore);


        int i=1;
        int j=1;
        int a = i++ + ++i - i-- - --i;
        System.out.println(a);
int b= i++ + i++ - i-- ;
        System.out.println(b);


}

}

