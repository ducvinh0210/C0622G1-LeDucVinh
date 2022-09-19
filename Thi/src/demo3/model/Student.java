package demo3.model;

import java.util.Comparator;
import java.util.Scanner;

public class Student  extends Person implements Comparable <Student>  {
    static Scanner scanner= new Scanner(System.in);
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



















//    @Override
//    public int compare(Student o1, Student o2) {
//
//
//
//        if(o1.getScore()>o2.getScore()){
//            return 1;
//
//        }else if (o1.getScore()==o2.getScore()){
//            if (o1.getName().compareTo(o2.getName())>0){
//                return 1;
//            }else if (o1.getName().compareTo(o2.getName())==0){
//                return 0;
//            }else {
//                return -1;
//            }
//        }else {
//            return -1;
//
//        }
//    }

}

