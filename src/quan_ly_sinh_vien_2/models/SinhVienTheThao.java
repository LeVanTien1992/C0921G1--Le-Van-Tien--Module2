package quan_ly_sinh_vien_2.models;

public class SinhVienTheThao extends SinhVien{
    private String sucKhoe;
    private String body;

    public SinhVienTheThao() {
    }

    public SinhVienTheThao(String maSinhVien, String tenSinhVien, int tuoi, String sucKhoe, String body) {
        super(maSinhVien, tenSinhVien, tuoi);
        this.sucKhoe = sucKhoe;
        this.body = body;
    }

    public String getSucKhoe() {
        return sucKhoe;
    }

    public void setSucKhoe(String sucKhoe) {
        this.sucKhoe = sucKhoe;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return  getMaSinhVien()+","+
                getTenSinhVien()+","+
                getTuoi()+","+
                sucKhoe + "," +
                body
                ;
    }
}
