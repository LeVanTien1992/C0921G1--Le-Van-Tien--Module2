package ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model;

import java.io.Serializable;

public class Mitsubishi implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    private String cacMoTaKhac;

    public Mitsubishi() {
    }

    public Mitsubishi(String maSanPham, String tenSanPham, String hangSanXuat, double gia, String cacMoTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "Mitsubishi{"
                + maSanPham+"\t"
                + tenSanPham+"\t"
                + hangSanXuat+"\t"
                + gia+"\t"
                + cacMoTaKhac+
                '}';
    }
}
