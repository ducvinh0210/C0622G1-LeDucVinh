package case_study_furama_resort.utils.read_write;

import case_study_furama_resort.model.Facility;
import case_study_furama_resort.model.House;
import case_study_furama_resort.model.Room;
import case_study_furama_resort.model.Villa;
import sun.rmi.runtime.NewThreadAction;

import java.io.*;
import java.util.*;

public class ReadAndWriteFacility {
    public static Map<Facility, Integer> readFacilityFile(String path) {
        Map<Facility, Integer> facilities = new LinkedHashMap<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] infor = line.split(",");
                if (infor.length == 10) {
                    facilities.put(new Villa(infor[0], infor[1], Double.parseDouble(infor[2]), Double.parseDouble(infor[3]),
                            Integer.parseInt(infor[4]), infor[5], infor[6], Double.parseDouble(infor[7]),
                            Integer.parseInt(infor[8])), Integer.parseInt(infor[9]));

                } else if (infor.length == 9) {
                    facilities.put(new House(infor[0], infor[1], Double.parseDouble(infor[2]), Double.parseDouble(infor[3]),
                            Integer.parseInt(infor[4]), infor[5], infor[6], Integer.parseInt(infor[7])), Integer.parseInt(infor[8]));
                } else if (infor.length == 8) {
                    facilities.put(new Room(infor[0], infor[1], Double.parseDouble(infor[2]), Double.parseDouble(infor[3]),
                            Integer.parseInt(infor[4]), infor[5], infor[6]), Integer.parseInt(infor[7]));
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public static void writeFacilityFile(String path, Map<Facility, Integer> facilities, boolean append) {
        List<String> stringList = new ArrayList<>();
        Set<Facility> facilitySet = facilities.keySet();
        for (Facility facility : facilitySet) {
            stringList.add(facility + "," + facilities.get(facility));
        }
        File file= new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try{
            fileWriter =new FileWriter(path, append);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String string :stringList
                 ) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                
            }
            bufferedWriter.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
