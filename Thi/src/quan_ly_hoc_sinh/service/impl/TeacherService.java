package quan_ly_hoc_sinh.service.impl;

import quan_ly_hoc_sinh.model.Teacher;
import quan_ly_hoc_sinh.service.ITeacherService;
import quan_ly_hoc_sinh.utils.ReadFileUtils;
import quan_ly_hoc_sinh.utils.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService  implements ITeacherService {
    public static final String PATH_TEACHER = "src\\quan_ly_hoc_sinh\\data\\teacherFile.csv";
    Scanner scanner= new Scanner(System.in);
    List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addTeacher() throws IOException {
        teachers= ReadFileUtils.readFileTeacher(PATH_TEACHER);
        Teacher teacher= this.infoTeacher();
        teachers.add(teacher);
        WriteFileUtils.writeFileTeacher(PATH_TEACHER,teachers);


    }

    @Override
    public void removeTeacher() throws IOException {
        teachers= ReadFileUtils.readFileTeacher(PATH_TEACHER);
        Teacher teacher= this.findTeacher();
        if (teacher== null){
            System.out.println("khong co du lieu");
        }else {
            System.out.println("ban co muon xoa tai vi tri"+ teacher.getIdName()+"khong");
            System.out.println("1.co");
            System.out.println("2.khong");
            int choice= Integer.parseInt(scanner.nextLine());
            if(choice==1) {

                teachers.remove(teacher);
            }
        }
        System.out.println("xoa thanh cong ");
        WriteFileUtils.writeFileTeacher(PATH_TEACHER,teachers);

    }

    @Override
    public void displayAllTeacher() throws IOException {
        teachers=  ReadFileUtils.readFileTeacher(PATH_TEACHER);
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }

    }

    public Teacher infoTeacher(){
        String id;
        System.out.println("mhap id");
        id= scanner.nextLine();
        String name;
        System.out.println("nhap ten");
        name= scanner.nextLine();
        String gender;
        System.out.println("nhap gioi tinh");
        gender= scanner.nextLine();
        String specialty;
        System.out.println("nhap chuyen mon");
        specialty= scanner.nextLine();
        Teacher teacher= new Teacher(id,name, gender,specialty);
        return teacher;
    }


public Teacher findTeacher(){
    System.out.println("nhap id gv can tim");
    String id = scanner.nextLine();
    for (int i = 0; i <teachers.size() ; i++) {
        if (teachers.get(i).getIdName().equals(id)){
            return teachers.get(i);
        }

    }
    return null;
}
}
