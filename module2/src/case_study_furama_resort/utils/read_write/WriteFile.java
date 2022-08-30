package case_study_furama_resort.utils.read_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFile(String path, boolean append, List<String> list){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
