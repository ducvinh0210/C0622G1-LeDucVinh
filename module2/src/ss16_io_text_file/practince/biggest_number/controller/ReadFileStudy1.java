package ss16_io_text_file.practince.biggest_number.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileStudy1 {
    public static void main(String[] args) throws IOException {
        File file  = new File("src\\ss16_io_text_file\\practince\\biggest_number\\data\\input.txt");
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while ((line= bufferedReader.readLine())!=null){
            if("".equals(line)){
                continue;
            }
            System.out.println(line);

        }

bufferedReader.close();
    }
}
