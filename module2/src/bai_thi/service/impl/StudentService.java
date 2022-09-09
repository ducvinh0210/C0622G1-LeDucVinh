package bai_thi.service.impl;

import bai_thi.model.Employee;
import bai_thi.model.Student;
import bai_thi.service.IService;
import bai_thi.utils.read_write.ReadFileUtils;
import bai_thi.utils.read_write.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IService {

    public static final String PATH_STUDENT = "src\\bai_thi\\data\\fileStudent.csv";
    private static Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    @Override
    public void add() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student= this.inforStudent();
        students.add(student);
        WriteFileUtils.writeFileStudent(PATH_STUDENT,students);

    }

    @Override
    public void remove() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student= this.findStudent();

        students.remove(student);
        WriteFileUtils.writeFileStudent(PATH_STUDENT, students);


    }

    @Override
    public void displayAll() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        for (Student student :students
                ) {
            System.out.println(student);

        }

    }

    public Student inforStudent() {
        String id;
        System.out.println("nhap id");
        id = scanner.nextLine();
        String name;
        System.out.println("nhap ten");
        name = scanner.nextLine();
        String dateOfBirth;
        System.out.println("nhap ngay sinh");
        dateOfBirth = scanner.nextLine();
        String address;
        System.out.println("nhap dia chi");
        address = scanner.nextLine();
        String numberPhone;
        System.out.println("nhap so dt");
        numberPhone = scanner.nextLine();
        double score;
        System.out.println("nhap diem");
        score = Double.parseDouble(scanner.nextLine());
        String nameClass;
        System.out.println("nhap lop");
        nameClass = scanner.nextLine();
        String dayInClass;
        System.out.println("nhap ngay nhap hoc");
        dayInClass = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, address, numberPhone, score, nameClass, dayInClass);
        return student;
    }
    public Student findStudent(){
        System.out.println("nhap id moi vao");
        String idStudent= scanner.nextLine();
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId().equals(idStudent)){
                return students.get(i);
            }
        }
        return null;
    }

}
