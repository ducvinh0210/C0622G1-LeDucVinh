package exercise_mvc.exercise1.utils.read_write;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFile(String src, boolean append, List<String> list) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(src, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
