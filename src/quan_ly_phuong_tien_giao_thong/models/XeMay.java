package quan_ly_phuong_tien_giao_thong.models;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "Biển Kiểm Soát='" + getBienKiemSoat() + '\'' +
                "Tên Hãng='" + getTenHang() + '\'' +
                "Năm Sản Xuất='" + getNamSanXuat() + '\'' +
                " Chủ Sở Hữu='" + getChuSoHuu() + '\'' +
                "congSuat='" + congSuat + '\'' +
                '}';
    }

}
