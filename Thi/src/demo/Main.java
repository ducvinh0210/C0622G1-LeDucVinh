package demo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("nam",20,"ha noi");
        Student student2= new Student("nu",30,"da nang");
        Student student3= new Student("vinh",24,"viet nam");
        Map<Integer,Student> studentMap= new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer, Student> student:studentMap.entrySet()) {
            System.out.println(student.getValue().toString());

        }
    }

}
