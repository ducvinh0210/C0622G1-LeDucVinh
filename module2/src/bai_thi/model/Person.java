package bai_thi.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", dateOfBirth='" + dateOfBirth + '\'' +
//                ", address='" + address + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
        return id+","+name+","+dateOfBirth+","+address+","+phoneNumber;
    }
}

