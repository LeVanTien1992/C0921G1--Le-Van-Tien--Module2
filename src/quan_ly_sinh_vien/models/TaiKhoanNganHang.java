package quan_ly_sinh_vien.models;

public abstract class TaiKhoanNganHang {
    private String maSinhVien;
    private String tenSinhVien;
    private String ngayNhapHoc;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String maSinhVien, String tenSinhVien, String ngayNhapHoc) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngayNhapHoc = ngayNhapHoc;
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

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", ngayNhapHoc='" + ngayNhapHoc + '\'' +
                '}';
    }
}
