package case_study_furama_resort.utils.read_write;

import case_study_furama_resort.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {
    public static List<Employee> readEmployeeFile(String path) {
        List<Employee> employees = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] info = line.split(",");
                employees.add(new Employee(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[4]), info[6], info[7], info[8], Double.parseDouble(info[9])));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void writeEmployeeFile(String path, List<Employee> employees, boolean append) {
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(path, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < employees.size(); i++) {
                bufferedWriter.write(employees.get(i).toString());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
