package ngan_hang.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private double soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private int kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kiHan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(double soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
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

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return getId()+ ","+
                getMaTaiKhoan()+ ","+
                getTenChuTaiKhoan()+ ","+
                getNgayTaoTaiKhoan()+ ","+
                soTienGuiTietKiem + ","+
                ngayGuiTietKiem + ","+
                laiSuat +
                kiHan
                ;
    }
}
