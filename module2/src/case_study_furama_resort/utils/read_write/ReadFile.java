package case_study_furama_resort.utils.read_write;

import case_study_furama_resort.model.Facility;
import case_study_furama_resort.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFile {
//     public static List<String> readFile(String src){
//         FileReader file=null;
//         String line="";
//         List<String>strings= new ArrayList<>();
//         BufferedReader bufferedReader=null ;
//         try{
//             file= new FileReader(src);
//             bufferedReader= new BufferedReader(file);
//while ((line=bufferedReader.readLine())!=null){
//    strings.add(line);
//}
//
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }finally {
//             try{
//                 bufferedReader.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//return strings;
//     }


    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();

        while ((line = bufferedReader.readLine() )!= null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;

    }
public static Map<Facility,Integer>readFacilityFile(String path) throws IOException {
        List<String >strings=readFile(path);
        Map<Facility,Integer> facilityList= new LinkedHashMap<>();

            String[] info;
            for(String line:strings){
                info    =line.split(",");
                if(info[1].contains("Villa")){
                    facilityList.put(new Villa(info[0],info[1],Double.parseDouble(info[2]),
                            Double.parseDouble(info[3]),Integer.parseInt(info[4]),info[5],info[6],
                            Double.parseDouble(info[7]),Integer.parseInt(info[8])),Integer.parseInt(info[9]));
                }
            }
        return facilityList;


}



}
