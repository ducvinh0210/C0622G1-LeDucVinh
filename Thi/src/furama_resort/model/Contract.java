package furama_resort.model;

public class Contract {
    private String contractId;
    private Booking bookingId;
    private double downPayment;
    private double totalCost;
    private Booking customerId;

    public Contract() {
    }

    public Contract(String contractId, Booking bookingId, double downPayment, double totalCost, Booking customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.downPayment = downPayment;
        this.totalCost = totalCost;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Booking getBookingId() {
        return bookingId;
    }

    public void setBookingId(Booking bookingId) {
        this.bookingId = bookingId;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Booking getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Booking customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
//        return "Contract{" +
//                "contractId='" + contractId + '\'' +
//                ", bookingId=" + bookingId +
//                ", downPayment=" + downPayment +
//                ", totalCost=" + totalCost +
//                ", customerId=" + customerId +
//                '}';
        return contractId + "," + bookingId.getIdBooking() + "," + downPayment + "," + totalCost + "," + customerId.getCustomerId().getId();


    }
}
