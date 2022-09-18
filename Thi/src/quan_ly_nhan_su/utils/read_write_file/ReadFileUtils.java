package quan_ly_nhan_su.utils.read_write_file;

import quan_ly_nhan_su.model.Student;
import quan_ly_nhan_su.model.Teacher;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtils {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while((line = bufferedReader.readLine()) != null) {
            strings.add(line);


        }
        bufferedReader.close();
        return strings;
    }


    public static List<Student> readFileStudent(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], info[4], Double.parseDouble(info[5])));

        }
        return studentList;
    }
    public static List<Teacher> readFileTeacher(String path) throws IOException {
        List<String > strings= readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String [] info;
        for ( String line: strings) {
            info= line.split(",");
            teacherList.add(new Teacher(info[0], info[1], info[2], info[3], info[4]));
        }
        return teacherList;

    }


}
