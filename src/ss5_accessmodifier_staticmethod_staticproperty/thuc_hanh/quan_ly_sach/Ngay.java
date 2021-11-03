package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.quan_ly_sach;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getNgay(){
        return this.ngay;
    }
    public int getThang(){
        return this.thang;
    }
    public int getNam(){
        return this.nam;
    }
    public void setNgay(int ngay){
        this.ngay = ngay;
    }
    public  void setThang(int thang){
        this.thang = thang;
    }
    public void setNam(int nam){
        this.nam = nam;
    }
}
