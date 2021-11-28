package case_study.models;

import java.util.Objects;

public class Contact {
    private int soHopDong;
    private String maBooking;
    private double soTienCocTruoc;
    private double tongSoTienThanhToan;
    private int maKhachHang;

    public Contact() {
    }

    public Contact(int soHopDong, String maBooking, double soTienCocTruoc, double tongSoTienThanhToan,
                   int maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(double soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public double getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(double tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contact{" + "\t" +
                soHopDong + "\t" +
                maBooking + "\t" +
                soTienCocTruoc +"\t" +
                tongSoTienThanhToan +"\t"+
                maKhachHang + "\t" +
                '}';
    }

}
