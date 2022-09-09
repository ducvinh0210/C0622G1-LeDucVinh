package luyen_tap_thi_module2.model;

public class Teacher  extends Person{
    private String chuyenMon;

    public Teacher() {
    }

    public Teacher(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public Teacher(String id, String name, String chuyenMon) {
        super(id, name);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String getInfo() {
        return super.getId()+","+super.getName()+","+this.chuyenMon;
    }

    @Override
    public String toString() {
        return super.toString()+ "Teacher{" +
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
