package case_study.models;

import java.util.Objects;

public class Booking {
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking() {
    }

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc, int maKhachHang,
                   String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return
                maBooking + "," +
                ngayBatDau +","+
                ngayKetThuc + "," +
                maKhachHang + "," +
                tenDichVu + "," +
                loaiDichVu
               ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return maKhachHang == booking.maKhachHang &&
                maBooking.equals(booking.maBooking) &&
                ngayBatDau.equals(booking.ngayBatDau) &&
                ngayKetThuc.equals(booking.ngayKetThuc) &&
                tenDichVu.equals(booking.tenDichVu) &&
                loaiDichVu.equals(booking.loaiDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
    }

}
