package quan_ly_nhan_su.model;

public class Teacher extends Person {
    private String specialty;

    public Teacher() {
    }

    public Teacher(String specialty) {
        this.specialty = specialty;
    }

    public Teacher(String id, String name, String dateOfBirth, String gender, String specialty) {
        super(id, name, dateOfBirth, gender);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
//        return "Teacher{" +
//                "specialty='" + specialty + '\'' +
//                '}';
        return super.toString()+ ","+specialty;

    }
}
