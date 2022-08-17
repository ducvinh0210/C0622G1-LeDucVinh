package test1.model;

public class Truck extends Transport{
    private int trongTai;

    public Truck() {
    }

    public Truck(int trongTai) {
        this.trongTai = trongTai;
    }

    public Truck(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trongTai=" + trongTai +
                '}'
                +super.toString();
    }
}
