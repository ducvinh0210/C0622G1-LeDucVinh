package quan_ly_phuong_tien.model;

public class MotorBike  extends Vehicle{
    private double wattage;

    public MotorBike() {
    }

    public MotorBike(double wattage) {
        this.wattage = wattage;
    }

    public MotorBike(String id, String name, String yearOfManufacture, String owner, double wattage) {
        super(id, name, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
//        return "MotorBike{" +
//                "wattage=" + wattage +
//                '}';
        return super.toString()+","+wattage;

    }
}
