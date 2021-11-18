package quan_ly_hoa_don_tien_dien.service.ipml;

import quan_ly_hoa_don_tien_dien.models.KhachHangVietNam;
import quan_ly_hoa_don_tien_dien.service.QuanLyKhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangVietNamIpml implements QuanLyKhachHang {
    static List<KhachHangVietNam> khachHangVietNamList = new ArrayList<>();
    @Override
    public void themKhachHang() {
        Scanner scanner1 = new Scanner(System.in);
        KhachHangVietNam khachHangVietNam4 = new KhachHangVietNam();
        System.out.println("Nhập vào mã khách hàng");
        khachHangVietNam4.setMaKhachHang(scanner1.nextLine());
        System.out.println("Nhập vào họ tên khách hàng");
        khachHangVietNam4.setHoTen(scanner1.nextLine());
        System.out.println("Nhập vào loại khách hàng");
        khachHangVietNam4.setLoaiKhach(scanner1.nextLine());
        System.out.println("Nhập vào mức tiêu thụ");
        khachHangVietNam4.setDinhMucTieuThu(Integer.parseInt(scanner1.nextLine()));

        khachHangVietNamList.add(khachHangVietNam4);
        for (KhachHangVietNam khachHangVietNam:khachHangVietNamList) {
            System.out.println(khachHangVietNam);
        }
    }
    static {
        KhachHangVietNam khachHangVietNam1 = new KhachHangVietNam("313", "Le Van Teo", "Sinh Hoạt", 100);
        KhachHangVietNam khachHangVietNam2 = new KhachHangVietNam("222", "Le Van Tien", "Kinh Doanh", 10);
        KhachHangVietNam khachHangVietNam3 = new KhachHangVietNam("444", "Le Van Tin", "Kinh Doanh", 150);
        khachHangVietNamList.add(khachHangVietNam1);
        khachHangVietNamList.add(khachHangVietNam2);
        khachHangVietNamList.add(khachHangVietNam3);
    }
    @Override
    public void hienThiKhachHang() {
        for (KhachHangVietNam khachHangVietNam:khachHangVietNamList) {
            System.out.println(khachHangVietNam);
        }
    }

    @Override
    public void timKiemKhachHang(String tenKhachHang) {
        for (int i = 0; i < khachHangVietNamList.size(); i++) {
            if(khachHangVietNamList.get(i).getHoTen().contains(tenKhachHang)){
                System.out.println(khachHangVietNamList.get(i));
            }
        }
    }

}
