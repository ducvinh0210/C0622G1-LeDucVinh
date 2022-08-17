package test1.model;

public class Moto extends Transport {
    private int congSuat;

    public Moto() {
    }

    public Moto(int congSuat) {
        this.congSuat = congSuat;
    }

    public Moto(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "congSuat=" + congSuat +
                '}'
                +super.toString();
    }



}
