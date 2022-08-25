package demo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static List<String> readFile(String src) {
        FileReader file = null;
        String line = "";
        List<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader(src);
            bufferedReader = new BufferedReader(file);
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return strings;
    }
}
