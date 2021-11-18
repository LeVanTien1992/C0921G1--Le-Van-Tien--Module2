package quan_ly_hoa_don_tien_dien.service.ipml;

import quan_ly_hoa_don_tien_dien.models.HoaDonTienDien;
import quan_ly_hoa_don_tien_dien.service.QuanLyHoaDon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonIpml implements QuanLyHoaDon {
    static List<HoaDonTienDien> hoaDonTienDienList = new ArrayList<>();

    @Override
    public void themHoaDon() {
        Scanner scanner1 = new Scanner(System.in);
        HoaDonTienDien hoaDonTienDien4 = new HoaDonTienDien();
        System.out.println("Nhập vào mã hóa đơn");
        hoaDonTienDien4.setMaHoaDon(scanner1.nextLine());
        System.out.println("Nhập vào mã khách hàng");
        hoaDonTienDien4.setMaKhachHang(scanner1.nextLine());
        System.out.println("Nhập vào ngày ra hóa đơn");
        hoaDonTienDien4.setNgayRaHoaDon(scanner1.nextLine());
        System.out.println("Nhập vào sô lượng kw");
        hoaDonTienDien4.setSoLuongKw(Integer.parseInt(scanner1.nextLine()));
        System.out.println("Nhập vào đơn giá");
        hoaDonTienDien4.setDonGia(Integer.parseInt(scanner1.nextLine()));
        System.out.println("Nhập vào thành tiền");
        hoaDonTienDien4.setThanhTien(Integer.parseInt(scanner1.nextLine()));
        hoaDonTienDienList.add(hoaDonTienDien4);
        for (HoaDonTienDien hoaDonTienDien:hoaDonTienDienList) {
            System.out.println(hoaDonTienDien);
        }
    }
    static {
        HoaDonTienDien hoaDonTienDien1 = new HoaDonTienDien("090", "KH1", "11", 111,1200,40000);
        HoaDonTienDien hoaDonTienDien2= new HoaDonTienDien("111", "KH2", "1", 222,1600,90000);
        HoaDonTienDien hoaDonTienDien3 = new HoaDonTienDien("911", "KH3", "12", 333,1700,80000);
        hoaDonTienDienList.add(hoaDonTienDien1);
        hoaDonTienDienList.add(hoaDonTienDien2);
        hoaDonTienDienList.add(hoaDonTienDien3);
    }
    @Override
    public void hienThiHoaDon() {
        for (HoaDonTienDien hoaDonTienDien:hoaDonTienDienList) {
            System.out.println(hoaDonTienDien);
        }
    }

    @Override
    public void suaHoaDon(int index) {
        for (int i = 0; i < hoaDonTienDienList.size(); i++) {
            if()
        }
    }
}
