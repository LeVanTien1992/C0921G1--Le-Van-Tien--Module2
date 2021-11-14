package case_study.models;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    public Customer() {

    }

    public Customer(String maSo, String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai,
                    String email, String loaiKhach, String diaChi) {
        super(maSo, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Costomer{" +
                "Mã số khách hàng='" + getMaSo() + '\'' +
                "Họ tên='" + getHoTen() + '\'' +
                "Ngày sinh='" + getNgaySinh() + '\'' +
                "Giới tính='" + getGioiTinh() + '\'' +
                "Số CMND='" + getSoCMND() + '\'' +
                "Số điện thoại='" + getSoDienThoai() + '\'' +
                "Email='" + getEmail() + '\'' +
                "Loại Khách='" + loaiKhach + '\'' +
                ", Địa chỉ='" + diaChi + '\'' +
                '}';
    }
}
