package furama_resort.model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Booking {
    private String idBooking;
private LocalDate startDay;
private LocalDate endDay;
private Customer customerId;
private Facility nameService;
private int status;

    public Booking() {
    }


    public Booking(String idBooking, LocalDate startDay, LocalDate endDay, Customer customerId, Facility nameService, int status) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.nameService = nameService;
        this.status = status;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Facility getNameService() {
        return nameService;
    }

    public void setNameService(Facility nameService) {
        this.nameService = nameService;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;

    }
    public String checkedBooking(){
        if (this.status==0){
            return "Chưa tạo hợp đồng";

        }
        return "ĐÃ TẠo HỢP ĐỒng";

    }

    @Override
    public String toString() {
//        return "Booking{" +
//                "idBooking='" + idBooking + '\'' +
//                ", startDay=" + startDay +
//                ", endDay=" + endDay +
//                ", customerId=" + customerId +
//                ", nameService=" + nameService +
//                ", status=" + status +
//                '}';
        return idBooking+","+startDay+","+endDay+","+customerId.getId()+","+nameService.getNameService()+","+status;
    }
}
