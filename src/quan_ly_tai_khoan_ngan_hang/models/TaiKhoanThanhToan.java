package quan_ly_tai_khoan_ngan_hang.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private int soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan( String maTaiKhoan, String tenChuTaiKhoan,
                             String ngayTaoTaiKhoan, int soThe, double soTienTrongTaiKhoan) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return getMaTaiKhoan() +","+ getTenChuTaiKhoan()+"," + getNgayTaoTaiKhoan() +","+ soThe +","+ soTienTrongTaiKhoan ;
    }
}
