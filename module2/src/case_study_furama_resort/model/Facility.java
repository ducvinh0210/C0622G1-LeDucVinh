package case_study_furama_resort.model;

public abstract class Facility {
    private String nameService;
    private double area;
    private double price;
    private int numberOfPeople;
    private String style;

    public Facility() {
    }

    public Facility(String nameService, double area, double price, int numberOfPeople, String style) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.style = style;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberOfPeople=" + numberOfPeople +
                ", style='" + style + '\'' +
                '}';
    }
}
