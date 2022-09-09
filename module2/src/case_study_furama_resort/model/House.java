package case_study_furama_resort.model;

public class House extends Facility{
    private String houseStandard;
    private int numberOfFloors;

    public House(String s, String s1, double v, double parseDouble, int i, String s2, String s3, int parseInt, int anInt) {
    }

    public House(String houseStandard, int numberOfFloors) {
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode, String nameService, double area, double price, int numberOfPeople, String style, String houseStandard, int numberOfFloors) {
        super(serviceCode, nameService, area, price, numberOfPeople, style);
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
//        return "House{" +
//                "houseStandard='" + houseStandard + '\'' +
//                ", numberOfFloors=" + numberOfFloors +
//                '}'
//                +super.toString();
        return super.toString()+","+houseStandard+","+numberOfFloors;
    }
}
