package luyen_tap_thi_module2.utils.read_write_file.read_and_write_file;

import luyen_tap_thi_module2.model.Student;

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

    public static List<Student> readFileStudent(String path) throws IOException {
        List<String> strings= readFile(path);
        List<Student> studentList= new ArrayList<>();
        try {
            String[] info;
            for (String line:strings) {
                info= line.split(",");
                studentList.add(new Student(info[0],info[1],Double.parseDouble(info[2])));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("File hien tai trong");
        }
return studentList;

    }


}
