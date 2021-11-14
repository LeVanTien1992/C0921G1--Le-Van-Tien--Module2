package quan_ly_phuong_tien_giao_thong.models;

import java.util.ArrayList;
import java.util.Scanner;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public ArrayList<HangSanXuat> getHangSanXuats() {
        return hangSanXuats;
    }

    public void setHangSanXuats(ArrayList<HangSanXuat> hangSanXuats) {
        this.hangSanXuats = hangSanXuats;
    }

    static ArrayList<HangSanXuat> hangSanXuats = new ArrayList<HangSanXuat>();
    static {
        hangSanXuats.add(new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-002", "Honda", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-005", "Ford", "Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-006", "Hino", "Nhật Bản"));
    }

    public String hangSanXuat(){
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        return hangSanXuats.get(choose).getMaHangSanXuat()+"\t"
                + hangSanXuats.get(choose-1).getTenHangSanXuat() +"\t" +hangSanXuats.get(choose-1).getTenQuocGia();
    }

    public void meNu(){
        System.out.println("1.HSX-001,Yamaha,Nhật Bản"+
                "2.HSX-002,Honda,Nhật Bản"+
                "3.HSX-003,Dongfeng,Trung Quốc"+
                "4.HSX-004,Huyndai,Hàn Quốc"+
                "5.HSX-005,Ford,Mỹ"+
                "6.HSX-006,Toyota,Nhật Bản"+
                "7.HSX-006,Hino,Nhật Bản");
    }

}
