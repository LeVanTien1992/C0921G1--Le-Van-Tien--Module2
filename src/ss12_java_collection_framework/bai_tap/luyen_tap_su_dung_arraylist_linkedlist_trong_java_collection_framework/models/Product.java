package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models;

public abstract class Product {
    private String ten;
    private int giaTien;
    private String hangSanXuat;

    public Product() {
    }

    public Product(String ten, int giaTien, String hangSanXuat) {
        this.ten = ten;
        this.giaTien = giaTien;
        this.hangSanXuat = hangSanXuat;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }


    @Override
    public String toString() {
        return "Product{" +
                "Tên sản phẩm='" + ten + '\'' +
                ", Giá Tiền=" + giaTien +
                ", Hãng Sản Xuất='" + hangSanXuat + '\'' +
                '}';
    }
}
