package quan_ly_sinh_vien_2.models;

public class SinhVienLuat extends SinhVien{
    private String tranhLuan;
    private double tienLamThem;

    public SinhVienLuat() {
    }

    public SinhVienLuat(String maSinhVien, String tenSinhVien, int tuoi, String tranhLuan, double tienLamThem) {
        super(maSinhVien, tenSinhVien, tuoi);
        this.tranhLuan = tranhLuan;
        this.tienLamThem = tienLamThem;
    }

    public String getTranhLuan() {
        return tranhLuan;
    }

    public void setTranhLuan(String tranhLuan) {
        this.tranhLuan = tranhLuan;
    }

    public double getTienLamThem() {
        return tienLamThem;
    }

    public void setTienLamThem(double tienLamThem) {
        this.tienLamThem = tienLamThem;
    }

    @Override
    public String toString() {
        return  getMaSinhVien()+","+
                getTenSinhVien()+","+
                getTuoi()+","+
                tranhLuan +","+
                tienLamThem
                ;
    }
}
