package quan_ly_hoc_sinh.model;

public class Student extends Person {
private String nameClass;
private double score;

    public Student() {
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String idName, String dateOfBirth, String gender, String nameClass, double score) {
        super(idName, dateOfBirth, gender);
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
        return super.getIdName()+","+super.getDateOfBirth()+","+super.getGender()+this.nameClass+","+this.score;

    }

    @Override
    public String toString() {
//        return "Student{" +
//                "nameClass='" + nameClass + '\'' +
//                ", score=" + score +
//                '}';
        return super.toString()+","+nameClass+","+ score;

    }
}
