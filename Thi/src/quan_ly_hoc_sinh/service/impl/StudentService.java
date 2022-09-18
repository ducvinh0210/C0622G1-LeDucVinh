package quan_ly_hoc_sinh.service.impl;

import quan_ly_hoc_sinh.model.Student;
import quan_ly_hoc_sinh.service.IStudentService;
import quan_ly_hoc_sinh.utils.ReadFileUtils;
import quan_ly_hoc_sinh.utils.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String PATH_STUDENT = "src\\quan_ly_hoc_sinh\\data\\studentFile.csv";
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    @Override
    public void addStudent() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.infoStudent();
        students.add(student);
        WriteFileUtils.writeFileStudent(PATH_STUDENT,students);


    }

    @Override
    public void removeStudent() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("khong tim thay doi tuong");
        } else {
            System.out.println("ban co chac xoa id" + student.getIdName() + "khong");
            System.out.println("1. co");
            System.out.println("2.khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                students.remove(student);

            }
            System.out.println("xoa thanh cong");
        }
        WriteFileUtils.writeFileStudent(PATH_STUDENT,students);

    }

    @Override
    public void displayStudent() throws IOException {
        students= ReadFileUtils.readFileStudent(PATH_STUDENT);
        for (Student student:students) {
            System.out.println(student);
        }

    }


    public Student infoStudent() {

        String id;
        System.out.println("nhap id moi");
        id = scanner.nextLine();
        String dateOfBirth;
        System.out.println("nhap ngay sinh");
        dateOfBirth = scanner.nextLine();
        String gender;
        System.out.println("nhap gioi tinh");
        gender = scanner.nextLine();
        String nameClass;
        System.out.println("nhap ten lop");
        nameClass = scanner.nextLine();
        double score;
        System.out.println("nhap diem");
        score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, dateOfBirth, gender, nameClass, score);
        return student;
    }

    public Student findStudent() {
        System.out.println("moi ban nhap id can tim");
        String id = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdName().equals(id)) {
                return students.get(i);
            }
        }
        return null;


    }
}
