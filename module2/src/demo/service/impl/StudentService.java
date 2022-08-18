package demo.service.impl;

import demo.model.Student;
import demo.service.IStudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Student> studentlist = new ArrayList<>();

    @Override
    public void themMoi() {
        System.out.print(" xin nhap id hoc sinh: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap ten:  ");
        String name = scanner.nextLine();
        System.out.print(" ngay sinh:  ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("nhap diem :  ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id,name,dateOfBirth,score);
        studentlist.add(student);
        System.out.println("them thanh cong");
    }

    @Override
    public void displayAll() {
        for (int i = 0; i <studentlist.size() ; i++) {
            studentlist.get(i);
            System.out.println(studentlist.get(i));
        }
    }
}

