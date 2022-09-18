package demo3.service;

import demo3.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService  implements IStudentController{
    private static Scanner scanner= new Scanner(System.in);
    private static List<Student> students= new ArrayList<>();
    static {
        students.add(new Student("12","le duc vinh","12/12/2","nam","13131",9));
        students.add(new Student("1234","vinh","122222","131313","nam",10));
        students.add(new Student("34","nam","!@###","35353","36363",6));
        
    }


    @Override
    public void sortStudent() {




    }
}
