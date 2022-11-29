package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class User implements Validator {
    @NotEmpty
    @Size(min = 5, max = 45,message = "{name}")
    private String firstName;


    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    private String phoneNumber;
    @Min(18)
    private int age;

    private String email;


    public User() {
    }

    public User(@NotEmpty @Size(min = 5, max = 45, message = "{name}") String firstName, @NotEmpty @Size(min = 5, max = 45) String lastName, String phoneNumber, @Size(min = 18) int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user= (User) target;
       if (!user.getPhoneNumber().matches("[0-9]{10}")){
           errors.rejectValue("phoneNumber","phoneNumber","phoneNumber khong hop le");
       }
       if (!user.getEmail().matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")){
           errors.rejectValue("email","email","email khong hop le");
       }


    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
