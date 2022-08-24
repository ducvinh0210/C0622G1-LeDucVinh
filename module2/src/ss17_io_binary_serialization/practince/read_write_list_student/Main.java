package ss17_io_binary_serialization.practince.read_write_list_student;

import exercise_mvc.exercise1.model.Student;

import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student1> student1s) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student1s);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        List<Student1> student1s = new ArrayList<>();
        student1s.add(new Student1(1, "Le Duc Vinh", "Quang Nam"));
        student1s.add(new Student1(2, "Pham Thi Vi", "Da Nang"));
        student1s.add(new Student1(3, "Phan Thi Van", "Dubai"));
        writeToFile("src\\ss17_io_binary_serialization\\practince\\read_write_list_student\\studentFile.txt", student1s);
        List<Student1> student1DataFromFile = readDataFromFile("src\\ss17_io_binary_serialization\\practince\\read_write_list_student\\studentFile.txt");
        for (Student1 student1 : student1DataFromFile) {
            System.out.println(student1);
        }

    }

    public static List<Student1> readDataFromFile(String path) throws IOException {
        List<Student1> student1s = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student1s = (List<Student1>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return student1s;

    }
}
