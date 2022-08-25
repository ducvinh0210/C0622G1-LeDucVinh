package student_management.model;

public class Student extends Person {
    private double score;
    private String nameClass;

    public Student() {
    }

    public Student(double score, String nameClass) {
        this.score = score;
        this.nameClass = nameClass;
    }

    public Student(int id, String name, String dateOfBirth, String gender, double score, String nameClass) {
        super(id, name, dateOfBirth, gender);
        this.score = score;
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", nameClass='" + nameClass + '\'' +
                '}'
                +super.toString();
    }
}
