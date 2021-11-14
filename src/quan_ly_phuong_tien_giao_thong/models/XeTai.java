package quan_ly_phuong_tien_giao_thong.models;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "Biển Kiểm Soát=" + getBienKiemSoat() +
                "Tên Hãng=" + getTenHang() +
                "Năm Sản Xuất=" + getNamSanXuat() +
                "Chủ Sở Hữu=" + getChuSoHuu() +
                "trongTai=" + trongTai +
                '}';
    }

}
