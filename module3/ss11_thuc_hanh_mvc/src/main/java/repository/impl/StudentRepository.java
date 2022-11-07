package repository.impl;

import model.Student;
import repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList= new ArrayList<>();
    static {
        studentList.add(new Student(1,"Vinh",true,"12/12/2022",4,"chanhtv",1,"vinh@gmail.com"));
        studentList.add(new Student(2,"vi",true,"12/12/2022",4,"chanhtv",1,"vinh@gmail.com"));
        studentList.add(new Student(3,"thanh",true,"12/12/2022",4,"chanhtv",1,"vinh@gmail.com"));
        studentList.add(new Student(4,"nhan",true,"12/12/2022",4,"chanhtv",1,"vinh@gmail.com"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        

    }
}
