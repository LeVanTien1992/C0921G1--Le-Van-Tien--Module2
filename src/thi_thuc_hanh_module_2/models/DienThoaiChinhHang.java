package thi_thuc_hanh_module_2.models;

public class DienThoaiChinhHang extends DienThoai{
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(int id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
                              String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return  getId()+","+
                getTenDienThoai()+","+
                getGiaBan()+","+
                getSoLuong()+","+
                getNhaSanXuat()+","+
                thoiGianBaoHanh + "," +
                phamViBaoHanh
                ;
    }
}
