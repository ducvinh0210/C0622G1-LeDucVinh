package bai_thi.utils.read_write;

import bai_thi.model.Employee;
import bai_thi.model.Student;

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

    public static List<Employee> readFileEmployee(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : strings
        ) {
            info = line.split(",");
            employeeList.add(new Employee(info[0],
                    info[1],
                    info[2],
                    info[3],
                    info[4],
                    Double.parseDouble(info[5]),
                    info[6],
                    info[7]));

        }
        return employeeList;

    }

public static List<Student> readFileStudent(String path) throws IOException {
        List<String>strings= readFile(path);
        List<Student> studentList= new ArrayList<>();
        String [] info;
    for (String line: strings) {
        info= line.split(",");
        studentList.add(new Student(info[0], info[1], info[2], info[3], info[4],Double.parseDouble(info[5]),info[6],info[7]));

    }
    return studentList;

}
}
