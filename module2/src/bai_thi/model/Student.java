package bai_thi.model;

public class Student extends Person {
    private  double score;
    private String nameClass;
    private String dayInClass;

    public Student() {
    }

    @Override
    public String getInfo() {
        return super.getId()+","+super.getName()+","+super.getDateOfBirth()+","+super.getAddress()+","+
                super.getPhoneNumber()+","+this.score+","+this.nameClass+","+this.dayInClass;
    }

    public Student(double score, String nameClass, String dayInClass) {
        this.score = score;
        this.nameClass = nameClass;
        this.dayInClass = dayInClass;
    }

    public Student(String id, String name, String dateOfBirth, String address, String phoneNumber, double score, String nameClass, String dayInClass) {
        super(id, name, dateOfBirth, address, phoneNumber);
        this.score = score;
        this.nameClass = nameClass;
        this.dayInClass = dayInClass;
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

    public String getDayInClass() {
        return dayInClass;
    }

    public void setDayInClass(String dayInClass) {
        this.dayInClass = dayInClass;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "score=" + score +
//                ", nameClass='" + nameClass + '\'' +
//                ", dayInClass='" + dayInClass + '\'' +
//                '}';
        return super.toString()+","+score+","+nameClass+","+dayInClass;

    }
}
