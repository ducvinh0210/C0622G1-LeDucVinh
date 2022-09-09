package luyen_tap_thi_module2.utils.read_write_file.read_and_write_file;

import luyen_tap_thi_module2.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtils {
    private static void writeFile(String path, String data) throws IOException {
        File file= new File(path);
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeFileStudent(String path, List<Student> students) throws IOException {
        String data ="";
        for (Student student:students) {
            data +=student.toString();
            data +="\n";
        }
        writeFile(path,data);
    }

}
