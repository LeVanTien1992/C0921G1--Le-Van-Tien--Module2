package quan_ly_hoa_don_tien_dien.models;

public class HoaDonTienDien {
    private String maHoaDon;
    private  String maKhachHang;
    private String ngayRaHoaDon;
    private double soLuongKw;
    private int donGia;
    private double thanhTien;

    public HoaDonTienDien() {
    }

    public HoaDonTienDien(String maHoaDon, String maKhachHang, String ngayRaHoaDon, double soLuongKw, int donGia, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuongKw = soLuongKw;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuongKw() {
        return soLuongKw;
    }

    public void setSoLuongKw(double soLuongKw) {
        this.soLuongKw = soLuongKw;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "HoaDonTienDien{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuongKw=" + soLuongKw +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
    KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
    public void khachHangVietNam(){
        if(this.soLuongKw <= khachHangVietNam.getDinhMucTieuThu()){
            thanhTien = soLuongKw * donGia;
        }else {
            thanhTien = soLuongKw * donGia * khachHangVietNam.getDinhMucTieuThu();

        }
    }

    KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();
    public void khachHangNuocNgoai(){
        thanhTien = soLuongKw * donGia;
    }
}
