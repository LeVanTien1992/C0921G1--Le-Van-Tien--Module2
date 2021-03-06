package case_study.models;

public class Employee extends Person{
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(int maSo, String hoTen, String ngaySinh, String gioiTinh, int soCMND,
                    int soDienThoai, String email, String trinhDo, String viTri, double luong) {
        super(maSo, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }


    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return
                getMaSo() + "," +
                getHoTen() + "," +
                getNgaySinh() + "," +
                getGioiTinh() + "," +
                getSoCMND() + "," +
                getSoDienThoai() + "," +
                getEmail() + "," +
                trinhDo +"," +
                viTri + "," +
                luong;
    }
}
