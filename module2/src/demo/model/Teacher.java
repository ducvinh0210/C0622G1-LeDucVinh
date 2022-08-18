package demo.model;

public class Teacher extends Person {
    private String expertiseAt;

    public Teacher() {
    }

    public Teacher(String expertiseAt) {
        this.expertiseAt = expertiseAt;
    }

    public Teacher(int id, String name, String dateOfBirth, String expertiseAt) {
        super(id, name, dateOfBirth);
        this.expertiseAt = expertiseAt;
    }

    public String getExpertiseAt() {
        return expertiseAt;
    }

    public void setExpertiseAt(String expertiseAt) {
        this.expertiseAt = expertiseAt;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "expertiseAt='" + expertiseAt + '\'' +
                '}'+
                super.toString();
    }
}
