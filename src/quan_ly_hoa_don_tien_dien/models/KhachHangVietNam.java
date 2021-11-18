package quan_ly_hoa_don_tien_dien.models;

public class KhachHangVietNam extends QuanLyKhachHang{
    private String loaiKhach;
    private float dinhMucTieuThu;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String maKhachHang, String hoTen, String loaiKhach, float dinhMucTieuThu) {
        super(maKhachHang, hoTen);
        this.loaiKhach = loaiKhach;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public float getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(float dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +
                "maKhachHang='" + getMaKhachHang() + '\'' +
                "hoTen='" + getHoTen() + '\'' +
                "loaiKhach='" + loaiKhach + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu +
                '}';
    }
}
