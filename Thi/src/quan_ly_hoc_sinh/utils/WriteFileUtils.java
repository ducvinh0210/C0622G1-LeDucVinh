package quan_ly_hoc_sinh.utils;

import quan_ly_hoc_sinh.model.Student;
import quan_ly_hoc_sinh.model.Teacher;

import java.io.*;
import java.util.List;

public class WriteFileUtils {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();

    }

    public static void writeFileStudent(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString();
            data += "\n";


        }

        writeFile(path, data);
    }

    public static void writeFileTeacher(String path, List<Teacher> teachers) throws IOException {
        String data = "";
        for (Teacher teacher : teachers) {
            data += teacher.toString();
            data += "\n";

        }
        writeFile(path, data);
    }


}
