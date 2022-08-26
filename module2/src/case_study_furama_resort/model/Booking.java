package case_study_furama_resort.model;

public class Booking {
    private String idBooking;
    private int startDate;
    private int endDate;
    private String idCustomer;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String idBooking, int startDate, int endDate, String idCustomer, String serviceName, String typeOfService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
