package quan_ly_phuong_tien.model;

public abstract class Vehicle {
    private String id;
    private String name;
    private String yearOfManufacture;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String yearOfManufacture, String owner) {
        this.id = id;
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
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

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



    public abstract String getInfo();


    @Override
    public String toString() {
//        return "Vehicle{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", yearOfManufacture='" + yearOfManufacture + '\'' +
//                ", owner='" + owner + '\'' +
//                '}';
        return id+","+name+","+yearOfManufacture+","+owner;
    }
}
