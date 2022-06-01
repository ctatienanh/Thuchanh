import java.util.Date;

public class Sinhvien {
    private String  masv;
    private String name;
    private String  Tuoi;
    private String Gioitinh;
    private String Diachi;
    private int Diemtb;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String name, String tuoi, String gioitinh, String diachi, int diemtb) {
        this.masv = masv;
        this.name = name;
        Tuoi = tuoi;
        Gioitinh = gioitinh;
        Diachi = diachi;
        Diemtb = diemtb;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public int getDiemtb() {
        return Diemtb;
    }

    public void setDiemtb(int diemtb) {
        Diemtb = diemtb;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", Tuoi=" + Tuoi +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Diemtb=" + Diemtb +
                '}';
    }
    public String write(){
        return  masv+ "," + name + ","+ Tuoi + "," +Gioitinh+ "," +Diachi+","+Diemtb;
    }


}
