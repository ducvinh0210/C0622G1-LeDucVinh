package quan_ly_phuong_tien.utils.read_write_file;

import quan_ly_phuong_tien.model.Car;
import quan_ly_phuong_tien.model.MotorBike;
import quan_ly_phuong_tien.model.Truck;

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtils {

    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);

        }
        bufferedReader.close();
        return strings;


    }

    public static List<Car> readFileCar(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Car> carList= new ArrayList<>();
String[] info;
        for (String line:strings) {
            info= line.split(",");
            carList.add(new Car(info[0],info[1],info[2],info[3],Integer.parseInt(info[4]),info[5]));
        }
        return carList;

    }



    public static List<Truck> readFileTruck(String path) throws IOException {
        List<String > strings= readFile(path);
        List<Truck> truckList= new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info= line.split(",");
            truckList.add(new Truck(info[0],info[1],info[2],info[3],Double.parseDouble(info[4])));

        }
        return truckList;


    }

    public static List<MotorBike> readFileMotorBike(String path) throws IOException {
        List<String> strings= readFile(path);
        List<MotorBike> motorBikeList= new ArrayList<>();
        String[] info;
        for (String line:strings) {
            info= line.split(",");
            motorBikeList.add(new MotorBike(info[0],info[1],info[2],info[3],Double.parseDouble(info[4])));

        }
        return motorBikeList;

    }


}
