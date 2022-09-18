package quan_ly_phuong_tien.model;

public class Truck extends Vehicle{
    private double vehicleWeight;

    public Truck() {
    }

    public Truck(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public Truck(String id, String name, String yearOfManufacture, String owner, double vehicleWeight) {
        super(id, name, yearOfManufacture, owner);
        this.vehicleWeight = vehicleWeight;
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
//        return "Truck{" +
//                "vehicleWeight=" + vehicleWeight +
//                '}';
        return super.toString()+","+vehicleWeight;

    }
}
