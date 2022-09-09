package demo_viet_doc_file;

public class Student1 {
    private String idStudent;
    private String nameStudent;
    private String dateOfBirth;
    private double score;

    public Student1() {
    }

    public Student1(String idStudent, String nameStudent, String dateOfBirth, double score) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.score = score;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
//        return "Student1{" +
//                "idStudent='" + idStudent + '\'' +
//                ", nameStudent='" + nameStudent + '\'' +
//                ", dateOfBirth='" + dateOfBirth + '\'' +
//                ", score=" + score +
//                '}';
   return idStudent+","+nameStudent+","+dateOfBirth+","+score;
    }
}

