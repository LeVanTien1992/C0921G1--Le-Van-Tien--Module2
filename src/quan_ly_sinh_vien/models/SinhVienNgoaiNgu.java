package quan_ly_sinh_vien.models;

public class SinhVienNgoaiNgu extends TaiKhoanNganHang{
    private int soTheSinhVien;

    public SinhVienNgoaiNgu() {
    }

    public SinhVienNgoaiNgu(String maSinhVien, String tenSinhVien, String ngayNhapHoc, int soTheSinhVien) {
        super(maSinhVien, tenSinhVien, ngayNhapHoc);
        this.soTheSinhVien = soTheSinhVien;
    }

    public int getSoTheSinhVien() {
        return soTheSinhVien;
    }

    public void setSoTheSinhVien(int soTheSinhVien) {
        this.soTheSinhVien = soTheSinhVien;
    }

    @Override
    public String toString() {
        return getMaSinhVien()+","+
                getTenSinhVien()+","+
                getNgayNhapHoc()+","+
                 soTheSinhVien
               ;
    }
}
