package demo_viet_doc_file.doc_ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static List<String> readFile(String path) {
        FileReader file = null;
        String line = "";
        List<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader(path);
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
