package luyen_tap_thi_module2.utils.read_write_file.file_student;

import luyen_tap_thi_module2.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileStudent {
    public static List<Student> readFileStudent(String path) throws IOException {
        List<Student> students= new ArrayList<>();
        File file= new File(path);
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);


        bufferedReader.readLine();








        return students;
    }
}
