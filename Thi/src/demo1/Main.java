package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main<student3> {
    public static void main(String[] args) {
        Student student= new Student("ainh",20,"Vn");
        Student student1= new Student("ci", 22,"ha noi");
        Student student2= new Student("ban",12,"kkk");
        Student student3=new Student("vinh",20,"da nang");
        Student student5= new Student("thanh",15,"ha noi");
        Student student6= new Student("vi",1,"quang nam");



        List<Student> students= new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student5);
        students.add(student6);



        Collections.sort(students);
        for (Student student10: students) {
            System.out.println(student10.toString());
        }

//        AgeComparator ageComparator= new AgeComparator();
//        Collections.sort(students,ageComparator);
//        System.out.println("so sanh theo tuoi");
//        for (Student student4 : students) {
//            System.out.println(student4.toString());
//
//        }


    }


}
