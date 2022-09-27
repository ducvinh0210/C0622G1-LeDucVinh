package furama_resort.model;

public class Villa extends Facility {
    private String roomStandard;
    private double lakeArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double lakeArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String nameService, double area, double price, int numberOfPeople, String style, String roomStandard, double lakeArea, int numberOfFloors) {
        super(serviceCode, nameService, area, price, numberOfPeople, style);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.numberOfFloors = numberOfFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(double lakeArea) {
        this.lakeArea = lakeArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
//        return "Villa{" +
//                "roomStandard='" + roomStandard + '\'' +
//                ", lakeArea=" + lakeArea +
//                ", numberOfFloors=" + numberOfFloors +
//                '}';
        return super.toString()+","+roomStandard+","+lakeArea+","+numberOfFloors;

    }
}
