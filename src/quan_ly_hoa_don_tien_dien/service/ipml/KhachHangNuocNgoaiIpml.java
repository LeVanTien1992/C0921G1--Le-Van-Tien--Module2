package quan_ly_hoa_don_tien_dien.service.ipml;

import quan_ly_hoa_don_tien_dien.models.KhachHangNuocNgoai;
import quan_ly_hoa_don_tien_dien.models.KhachHangVietNam;
import quan_ly_hoa_don_tien_dien.service.QuanLyKhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class KhachHangNuocNgoaiIpml implements QuanLyKhachHang {
    static List<KhachHangNuocNgoai> khachHangNuocNgoaiList = new ArrayList<>();
    @Override
    public void themKhachHang() {
        Scanner scanner1 = new Scanner(System.in);
        KhachHangNuocNgoai khachHangNuocNgoai4 = new KhachHangNuocNgoai();
        System.out.println("Nhập vào mã khách hàng");
        khachHangNuocNgoai4.setMaKhachHang(scanner1.nextLine());
        System.out.println("Nhập vào họ tên khách hàng");
        khachHangNuocNgoai4.setHoTen(scanner1.nextLine());
        System.out.println("Nhập vào quốc tịch khách hàng");
        khachHangNuocNgoai4.setQuocTich(scanner1.nextLine());

        khachHangNuocNgoaiList.add(khachHangNuocNgoai4);
        for (KhachHangNuocNgoai khachHangNuocNgoai:khachHangNuocNgoaiList) {
            System.out.println(khachHangNuocNgoai);
        }
    }
    static {
        KhachHangNuocNgoai khachHangNuocNgoai1 = new KhachHangNuocNgoai("999", "Elon Mark", "Mexico");
        KhachHangNuocNgoai khachHangNuocNgoai2 = new KhachHangNuocNgoai("555", "Donal J Trump", "USA");
        KhachHangNuocNgoai khachHangNuocNgoai3 = new KhachHangNuocNgoai("666", "Thomas Miller", "Canada");

        khachHangNuocNgoaiList.add(khachHangNuocNgoai1);
        khachHangNuocNgoaiList.add(khachHangNuocNgoai2);
        khachHangNuocNgoaiList.add(khachHangNuocNgoai3);
    }
    @Override
    public void hienThiKhachHang() {
        for (KhachHangNuocNgoai khachHangNuocNgoai:khachHangNuocNgoaiList) {
            System.out.println(khachHangNuocNgoai);
        }
    }

    @Override
    public void timKiemKhachHang(String tenKhachHang) {
        for (int i = 0; i < khachHangNuocNgoaiList.size(); i++) {
            if(khachHangNuocNgoaiList.get(i).getHoTen().contains(tenKhachHang)){
                System.out.println(khachHangNuocNgoaiList.get(i));
            }
        }
    }

}
