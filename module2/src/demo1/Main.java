package demo1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void readFile(String path) throws IOException {
        try{
            File fileRead = new File(path);

            if(!fileRead.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                if(line.equals("")){
                    continue;
                }
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("404");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap duong dan: ");
        String input = scanner.nextLine();

        readFile(input);
    }
}
