package ngan_hang.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private int soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                             int soThe, double soTienTrongTaiKhoan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
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
        return getId()+","+
                getMaTaiKhoan()+","+
                getTenChuTaiKhoan()+","+
                getNgayTaoTaiKhoan()+","+
                soThe +","+
                soTienTrongTaiKhoan
                ;
    }
}
