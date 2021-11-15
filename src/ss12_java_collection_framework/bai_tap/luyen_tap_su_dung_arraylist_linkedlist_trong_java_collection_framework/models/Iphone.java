package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models;

public class Iphone extends Product{
    private String faceId;

    public Iphone() {
    }

    public Iphone(String ten, int giaTien, String hangSanXuat, String faceId) {
        super(ten, giaTien, hangSanXuat);
        this.faceId = faceId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String toString() {
        return "Iphone10{" +
                "Tên sản phẩm='" + getTen() + '\'' +
                "Giá Tiền='" + getGiaTien() + '\'' +
                "Hãng Sản Xuất='" + getHangSanXuat() + '\'' +
                "Nhận diện khuôn mặt='" + faceId + '\'' +
                '}';
    }
}
