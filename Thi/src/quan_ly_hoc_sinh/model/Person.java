package quan_ly_hoc_sinh.model;

public abstract class Person {
private String idName;
private String dateOfBirth;
private String gender;

    public Person() {
    }

    public Person(String idName, String dateOfBirth, String gender) {
        this.idName = idName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract String getInfo();


    @Override
    public String toString() {
//        return "Person{" +
//                "idName='" + idName + '\'' +
//                ", dateOfBirth='" + dateOfBirth + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
       // return String.format("%s,%s,%s",getIdName(),getDateOfBirth(),getGender());
        return idName+","+dateOfBirth+","+gender;

    }
}
