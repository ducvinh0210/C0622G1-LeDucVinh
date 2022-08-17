package mvc1.exercise_person.service.impl;

import mvc1.exercise_person.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "vinh", "22-02-1990", "nam", 10.9, "C0622"));
        studentList.add(new Student(2, "vinh", "22-02-1990", "nam", 10.9, "C0622"));
    }

}
