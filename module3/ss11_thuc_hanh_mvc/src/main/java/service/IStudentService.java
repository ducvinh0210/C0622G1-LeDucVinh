package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
     void  add(Student student);

}
