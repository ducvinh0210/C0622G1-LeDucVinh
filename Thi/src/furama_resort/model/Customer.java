package furama_resort.model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Customer extends Person{
private String typeOfCustomer;
private String address;

    public Customer() {
    }

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
//        return "Customer{" +
//                "typeOfCustomer='" + typeOfCustomer + '\'' +
//                ", address='" + address + '\'' +
//                '}';
        return super.toString()+","+typeOfCustomer+","+address;
        
    }
}
