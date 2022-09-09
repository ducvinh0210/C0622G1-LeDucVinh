package demo_viet_doc_file.doc_ghi_file;

import java.io.*;
import java.util.List;

public class VietFile {
    public static void writeFile(String src, boolean append, List<String >list){
        FileWriter fileWriter;
        try{
            fileWriter= new FileWriter(src,append);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i));

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
