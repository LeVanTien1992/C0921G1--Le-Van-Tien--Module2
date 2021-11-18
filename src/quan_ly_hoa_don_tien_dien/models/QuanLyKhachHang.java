package quan_ly_hoa_don_tien_dien.models;

public abstract class QuanLyKhachHang {
    private String maKhachHang;
    private String hoTen;

    public QuanLyKhachHang() {
    }

    public QuanLyKhachHang(String maKhachHang, String hoTen) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "QuanLyKhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
