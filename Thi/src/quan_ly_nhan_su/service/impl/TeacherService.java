package quan_ly_nhan_su.service.impl;

import quan_ly_nhan_su.model.Student;
import quan_ly_nhan_su.model.Teacher;
import quan_ly_nhan_su.service.ITeacherService;
import quan_ly_nhan_su.utils.read_write_file.ReadFileUtils;
import quan_ly_nhan_su.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    public static final String PATH_TEACHER = "src\\quan_ly_nhan_su\\data\\teacherFile.csv";
    private static Scanner scanner = new Scanner(System.in);
    static List<Teacher> teachers = new ArrayList<>();


    @Override
    public void addTeacher() throws IOException {
        teachers = ReadFileUtils.readFileTeacher(PATH_TEACHER);
        Teacher teacher = this.infoTeacher();
        teachers.add(teacher);
        WriteFileUtils.writeFileTeacher(PATH_TEACHER, teachers);


    }

    @Override
    public void removeTeacher() throws IOException {
        teachers = ReadFileUtils.readFileTeacher(PATH_TEACHER);
        Teacher teacher = this.findTeacher();
        if (teacher == null) {
            System.out.println("du lieu khong co");
        } else {
            System.out.println("ban co chac muon xoa tai vi tri" + teacher.getId() + "khong");
            System.out.println("1.co");
            System.out.println("2.khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teachers.remove(teacher);

            }
        }
        WriteFileUtils.writeFileTeacher(PATH_TEACHER, teachers);


    }

    @Override
    public void displayTeacher() throws IOException {
        teachers = ReadFileUtils.readFileTeacher(PATH_TEACHER);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

    }


    public Teacher infoTeacher() {
        String id;
        while (true) {
            try {
                System.out.println("nhap id");
                id = scanner.nextLine();
                if (!(id.matches("[0-9]{4}"))) {
                    throw new NumberFormatException("nhap khong dung dinh dang");
                }

                id = "GV-" + id;
                break;


            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }


        }
        String name;
        System.out.println("nhap ten");
        name = scanner.nextLine();
        String dateOfBirth;
        System.out.println("nhap ngay sinh");
        dateOfBirth = scanner.nextLine();
        String gender;
        System.out.println("nhap gioi tinh");
        gender = scanner.nextLine();
        String specialty;
        System.out.println("nhap chuyen mon");
        specialty = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialty);
        return teacher;


    }


    public Teacher findTeacher() {
        System.out.println("nhap id can tim");
        String idTeacher = scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId().equals(idTeacher)) {
                return teachers.get(i);

            }

        }
        return null;
    }
}
