package quan_ly_nhan_su.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;


    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", dateOfBirth='" + dateOfBirth + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
        return id+","+name+","+dateOfBirth+","+gender;
    }
}
