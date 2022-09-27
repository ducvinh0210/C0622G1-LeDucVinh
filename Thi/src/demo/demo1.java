package demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Stack<String> stackSodu= new Stack<>();
        System.out.println("moi ban nhap so vao day");
        int x= Integer.parseInt(scanner.nextLine());
        while (x>0){
            int soDu=x%2;
            System.out.println(soDu);
            stackSodu.push(soDu+"");

            x=x/2;
        }
        System.out.println("so nhi phan la");
        int n= stackSodu.size();
        for (int i = 0; i <n ; i++) {
            System.out.print(stackSodu.pop());

        }


    }

}
