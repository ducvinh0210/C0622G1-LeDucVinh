package furama_resort.model;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private String identityCard;
    private String  phoneNumber;
    private String email;

    public Person() {
    }


    public Person(String id, String name, LocalDate dateOfBirth, String gender, String identityCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                ", gender='" + gender + '\'' +
//                ", identityCard=" + identityCard +
//                ", phoneNumber=" + phoneNumber +
//                ", email='" + email + '\'' +
//                '}';
        return id+","+name+","+dateOfBirth+","+gender+","+identityCard+","+phoneNumber+","+email;

    }
}
