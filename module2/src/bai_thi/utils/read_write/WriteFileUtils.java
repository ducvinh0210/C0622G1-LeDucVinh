package bai_thi.utils.read_write;

import bai_thi.model.Employee;
import bai_thi.model.Student;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;

public class WriteFileUtils {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();


    }

    public static void writeFileEmployee(String path, List<Employee> employees) throws IOException {
        String data = "";
        for (Employee employee : employees) {
            data += employee.toString();
            data += "\n";

        }
        writeFile(path, data);
    }

    public static void writeFileStudent(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString();
            data += "\n";
        }
        writeFile(path,data);
    }
}