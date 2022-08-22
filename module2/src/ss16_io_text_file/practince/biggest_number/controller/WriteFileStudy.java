package ss16_io_text_file.practince.biggest_number.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\practince\\biggest_number\\data\\output.txt");
        FileWriter fileReader = new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileReader);
        bufferedWriter.write("duc vinh");
        bufferedWriter.newLine();
        bufferedWriter.write("pham thi vi");
        bufferedWriter.close();
    }


}
