package case_study_furama_resort.utils.read_write;

import case_study_furama_resort.model.Facility;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFile {
//    public static void writeFile(String path, boolean append, List<String> list){
//        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter(path,append);
//            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
//            for (int i = 0; i <list.size() ; i++) {
//                bufferedWriter.write(list.get(i));
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }




    private static void writeFile(String path,String data) throws IOException {
        File file= new File(path);
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeFacilityFile(String path, Map<Facility,Integer> facilities) throws IOException {
        String data= "";
        Set<Facility> facilitySet=facilities.keySet();
        for (Facility facility:facilitySet) {
            data +=facility.toString()+","+facilities.get(facility);
            data+="\n";
        }
        writeFile(path,data);
    }
}
