package quan_ly_tai_khoan_ngan_hang.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int soTaiKhoanTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private int kyHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem( String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            int soTaiKhoanTietKiem, String ngayGuiTietKiem, double laiSuat, int kyHan) {
        super( maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTaiKhoanTietKiem = soTaiKhoanTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public int getSoTaiKhoanTietKiem() {
        return soTaiKhoanTietKiem;
    }

    public void setSoTaiKhoanTietKiem(int soTaiKhoanTietKiem) {
        this.soTaiKhoanTietKiem = soTaiKhoanTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return  getMaTaiKhoan() + "," +getTenChuTaiKhoan() +"," + getNgayTaoTaiKhoan() + ","
                +soTaiKhoanTietKiem + "," +ngayGuiTietKiem +"," +laiSuat + "," +kyHan ;
    }
}
