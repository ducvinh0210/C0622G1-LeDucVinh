package mvc2.exercise1.service.impl;

import exercise_mvc.exercise1.model.Student;
import mvc2.exercise1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new
                Student(1, "vinh", "11/22/2222", 9, "c06"));
        students.add(new
                Student(2, "vinh", "11/22/2222", 9, "c06"));

    }


    @Override
    public void addStudent() {
        Student student = this.inforStudent();
        students.add(student);
        System.out.println("them moi thanh cong");
    }

    @Override
    public void removeStudent() {
        Student student = this.findStudent();
        if(student== null){
            System.out.println("khong tim thay doi tuong can xoa");

        }else {
            System.out.println("ban co chac la muon xoa"+student.getId()+"khong");
            System.out.println("1. co");
            System.out.println("2.khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice==1){
                students.remove(student);
                System.out.println("xoa thanh cong");
            }

        }

    }

    @Override
    public void displayAllStudent() {
        for (Student student : students) {
            System.out.println(student);

        }

    }
    public Student findStudent(){
        System.out.println("moi ban nhap vao vi tri can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }


    public Student inforStudent() {
        System.out.println("mời bạn nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("moi ban nhap gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("mời bạn nhập điểm");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.println("mời bạn nhập tên lớp");
        String nameClass = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, point, nameClass);
        return student;

    }


}
