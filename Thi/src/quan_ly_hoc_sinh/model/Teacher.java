package quan_ly_hoc_sinh.model;

public class Teacher extends Person {
    private String specialty;

    public Teacher() {
    }

    public Teacher(String specialty) {
        this.specialty = specialty;
    }

    public Teacher(String idName, String dateOfBirth, String gender, String specialty) {
        super(idName, dateOfBirth, gender);
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
        return super.getIdName()+","+super.getDateOfBirth()+","+super.getGender()+ this.specialty;
    }

    @Override
    public String toString() {
//        return "Teacher{" +
//                "specialty='" + specialty + '\'' +
//                '}';
        return super.toString()+","+specialty;
    }
}
