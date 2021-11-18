package quan_ly_hoa_don_tien_dien.models;

public class KhachHangNuocNgoai extends QuanLyKhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String quocTich) {
        super(maKhachHang, hoTen);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                "maKhachHang='" + getMaKhachHang() + '\'' +
                "hoTen='" + getHoTen() + '\'' +
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
