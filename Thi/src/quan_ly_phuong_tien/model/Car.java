package quan_ly_phuong_tien.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String vehicleType;

    public Car() {
    }

    public Car(int numberOfSeats, String vehicleType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public Car(String id, String name, String yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(id, name, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
//        return "Car{" +
//                "numberOfSeats=" + numberOfSeats +
//                ", vehicleType='" + vehicleType + '\'' +
//                '}';
        return super.toString()+","+numberOfSeats+","+vehicleType;

    }
}
