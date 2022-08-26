package case_study_furama_resort.model;

public class Contract {
    private int contractNumber;
    private String idBooking;
    private double downPayment;
    private double totalCost;
    private String idCustomer;

    public Contract() {
    }

    public Contract(int contractNumber, String idBooking, double downPayment, double totalCost, String idCustomer) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.downPayment = downPayment;
        this.totalCost = totalCost;
        this.idCustomer = idCustomer;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", idBooking='" + idBooking + '\'' +
                ", downPayment=" + downPayment +
                ", totalCost=" + totalCost +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
