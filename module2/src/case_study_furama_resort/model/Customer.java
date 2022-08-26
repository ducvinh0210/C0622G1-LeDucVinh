package case_study_furama_resort.model;

public class Customer extends Person {
    private String typeOfGuet;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuet, String address) {
        this.typeOfGuet = typeOfGuet;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, int identityCard, int phoneNumber, String email, String typeOfGuet, String address) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.typeOfGuet = typeOfGuet;
        this.address = address;
    }

    public String getTypeOfGuet() {
        return typeOfGuet;
    }

    public void setTypeOfGuet(String typeOfGuet) {
        this.typeOfGuet = typeOfGuet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuet='" + typeOfGuet + '\'' +
                ", address='" + address + '\'' +
                '}'
                +super.toString();
    }
}
