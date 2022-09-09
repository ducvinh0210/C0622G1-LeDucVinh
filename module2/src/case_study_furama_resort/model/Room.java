package case_study_furama_resort.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String nameService, double area, double price, int numberOfPeople, String style, String freeService) {
        super(serviceCode, nameService, area, price, numberOfPeople, style);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
//        return "Room{" +
//                "freeService='" + freeService + '\'' +
//                '}'
//                +super.toString();
        return super.toString()+","+freeService;
    }
}
