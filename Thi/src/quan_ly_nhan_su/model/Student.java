package quan_ly_nhan_su.model;

import java.util.Comparator;

public class Student  extends Person implements Comparable<Student> {
    private String nameClass;
    private double score;

    public Student() {
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String id, String name, String dateOfBirth, String gender, String nameClass, double score) {
        super(id, name, dateOfBirth, gender);
        this.nameClass = nameClass;
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }





    @Override
    public String getInfo() {
        return super.getId()+super.getName()+super.getDateOfBirth()+super.getGender()+this.nameClass+this.score;

    }


    @Override
    public String toString() {
//        return "Student{" +
//                "nameClass='" + nameClass + '\'' +
//                ", score=" + score +
//                '}';
        return super.toString()+","+nameClass+","+score;
    }


    @Override
    public int compareTo(Student student) {
      return this.getId().compareTo(student.getId());
    }
}
