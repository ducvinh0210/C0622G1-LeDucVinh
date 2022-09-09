package luyen_tap_thi_module2.model;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    @Override
    public String getInfo() {
        return super.getId() +","+ super.getName()+","+this.score;

    }

    @Override
    public String toString() {
//        return super.toString()+ "Student{" +
//                "score=" + score +
//                '}';
        return super.toString()+","+score;
    }
}
