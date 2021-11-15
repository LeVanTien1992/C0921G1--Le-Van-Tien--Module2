package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models;

public class BlackBerry extends Product{
    private String baoMat;

    public BlackBerry() {
    }

    public BlackBerry(String ten, int giaTien, String hangSanXuat, String baoMat) {
        super(ten, giaTien, hangSanXuat);
        this.baoMat = baoMat;
    }

    public String getBaoMat() {
        return baoMat;
    }

    public void setBaoMat(String baoMat) {
        this.baoMat = baoMat;
    }

    @Override
    public String toString() {
        return "BlackBerry{" +
                "Tên sản phẩm='" + getTen() + '\'' +
                "Giá Tiền='" + getGiaTien() + '\'' +
                "Hãng Sản Xuất='" + getHangSanXuat() + '\'' +
                "baoMat='" + baoMat + '\'' +
                '}';
    }
}
