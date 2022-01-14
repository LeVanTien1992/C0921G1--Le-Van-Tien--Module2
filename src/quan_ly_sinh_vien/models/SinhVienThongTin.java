package quan_ly_sinh_vien.models;

public class SinhVienThongTin extends TaiKhoanNganHang{
    private double tienHocPhi;
    private String ngayRaTruong;

    public SinhVienThongTin() {
    }

    public SinhVienThongTin(String maSinhVien, String tenSinhVien, String ngayNhapHoc,
                            double tienHocPhi, String ngayRaTruong) {
        super(maSinhVien, tenSinhVien, ngayNhapHoc);
        this.tienHocPhi = tienHocPhi;
        this.ngayRaTruong = ngayRaTruong;
    }

    public double getTienHocPhi() {
        return tienHocPhi;
    }

    public void setTienHocPhi(double tienHocPhi) {
        this.tienHocPhi = tienHocPhi;
    }

    public String getNgayRaTruong() {
        return ngayRaTruong;
    }

    public void setNgayRaTruong(String ngayRaTruong) {
        this.ngayRaTruong = ngayRaTruong;
    }

    @Override
    public String toString() {
        return  getMaSinhVien()+ ","+
                getTenSinhVien()+ ","+
                getNgayNhapHoc()+ ","+
                tienHocPhi +","+
                ngayRaTruong
                ;
    }
}
