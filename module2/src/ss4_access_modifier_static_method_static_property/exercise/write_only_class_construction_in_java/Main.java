package ss4_access_modifier_static_method_static_property.exercise.write_only_class_construction_in_java;

public class Main {
    public static void main(String[] args) {
Student student=  new Student();
        System.out.println(student);
        student.setName("");
        student.setClasses("c03");
        Student student1 = new Student("le duc vinh","c06");
        System.out.println(student1);
    }
}
