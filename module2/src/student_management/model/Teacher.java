package student_management.model;

public class Teacher extends Person {
    private String qualification;

    public Teacher() {
    }

    public Teacher(String qualification) {
        this.qualification = qualification;
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String qualification) {
        super(id, name, dateOfBirth, gender);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "qualification='" + qualification + '\'' +
                '}'
                +super.toString();
    }
}
