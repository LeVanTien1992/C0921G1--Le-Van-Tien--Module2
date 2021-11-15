package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models;

public class SamSung extends Product {
    private String chongNuoc;

    public SamSung() {
    }

    public SamSung(String ten, int giaTien, String hangSanXuat, String chongNuoc) {
        super(ten, giaTien, hangSanXuat);
        this.chongNuoc = chongNuoc;
    }

    public String getChongNuoc() {
        return chongNuoc;
    }

    public void setChongNuoc(String chongNuoc) {
        this.chongNuoc = chongNuoc;
    }

    @Override
    public String toString() {
        return "SamSungGalaxyS10{" +
                "Tên sản phẩm='" + getTen() + '\'' +
                "Giá Tiền='" + getGiaTien() + '\'' +
                "Hãng Sản Xuất='" + getHangSanXuat() + '\'' +
                "Chống Nước='" + chongNuoc + '\'' +
                '}';
    }
}
