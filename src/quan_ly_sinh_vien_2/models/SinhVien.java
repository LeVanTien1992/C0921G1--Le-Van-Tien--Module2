package quan_ly_sinh_vien_2.models;

public abstract class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, int tuoi) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
