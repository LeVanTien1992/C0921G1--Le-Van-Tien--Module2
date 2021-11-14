package quan_ly_phuong_tien_giao_thong.models;

public class OTo extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;

    public OTo() {
    }

    public OTo(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, int soChoNgoi,
               String kieuXe) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "OTo{" +
                "Biển Kiểm Soát='" + getBienKiemSoat() + '\'' +
                "Tên Hãng='" + getTenHang() + '\'' +
                "Năm Sản Xuất='" + getNamSanXuat() + '\'' +
                "Chủ Sở Hữu='" + getChuSoHuu() + '\'' +
                "Só Chổ Ngồi='" + soChoNgoi + '\'' +
                ", Kiểu Xe='" + kieuXe + '\'' +
                '}';
    }

}
