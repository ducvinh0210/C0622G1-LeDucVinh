package quan_ly_phuong_tien.utils.read_write_file;

import quan_ly_phuong_tien.model.Car;
import quan_ly_phuong_tien.model.MotorBike;
import quan_ly_phuong_tien.model.Truck;

import java.io.*;
import java.util.Calendar;
import java.util.List;

public class WriteFileUtils {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeFileCar(String path, List<Car> cars) throws IOException {
        String data = "";
        for (Car car : cars) {
            data += car.toString();
            data += "\n";

        }
        writeFile(path, data);
    }

    public static void writeFileTruck(String path, List<Truck> trucks) throws IOException {
        String data = "";
        for (Truck truck : trucks) {
            data += truck.toString();
            data += "\n";

        }
        writeFile(path, data);

    }
    public static void writeFileMotorBike(String path, List<MotorBike> motorBikes) throws IOException {
        String data="";
        for (MotorBike motorBike:motorBikes) {
            data += motorBike.toString();
            data+="\n";


        }
        writeFile(path,data);
    }


}
