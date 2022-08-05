package ss4_access_modifier_static_method_static_property.exercise.write_only_class_construction_in_java;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "john";
        this.classes = "c02";
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
