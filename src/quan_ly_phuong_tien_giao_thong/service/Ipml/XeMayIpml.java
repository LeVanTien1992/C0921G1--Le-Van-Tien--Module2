package quan_ly_phuong_tien_giao_thong.service.Ipml;

import quan_ly_phuong_tien_giao_thong.models.HangSanXuat;
import quan_ly_phuong_tien_giao_thong.models.OTo;
import quan_ly_phuong_tien_giao_thong.models.XeMay;
import quan_ly_phuong_tien_giao_thong.service.XeMayService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayIpml implements XeMayService {

    HangSanXuat hangSanXuat = new HangSanXuat();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        XeMay xeMay4 = new XeMay();
        System.out.println("Nhập vào biển kiểm soát");
        xeMay4.setBienKiemSoat(scanner.nextLine());
        System.out.println("Nhập vào tên hãng");
        xeMay4.setTenHang(hangSanXuat.hangSanXuat());
        System.out.println("Nhập vào năm sản xuất");
        xeMay4.setNamSanXuat(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào chủ sở hữu");
        xeMay4.setChuSoHuu(scanner.nextLine());
        System.out.println("Nhập vào công suất");
        xeMay4.setCongSuat(Integer.parseInt(scanner.nextLine()));

        xeMayArrayList.add(xeMay4);
//        for (XeMay xeMay: xeMayArrayList) {
//            System.out.println(xeMay);
//        }
        for (XeMay x: xeMayArrayList) {
            System.out.println(x);
        }
    }
    static ArrayList<XeMay> xeMayArrayList = new ArrayList<XeMay>();
    static {
        XeMay xeMay1 = new XeMay("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100);
        XeMay xeMay2 = new XeMay("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150);
        XeMay xeMay3 = new XeMay("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50);
        xeMayArrayList.add(xeMay1);
        xeMayArrayList.add(xeMay2);
        xeMayArrayList.add(xeMay3);

    }

    @Override
    public void hienThi() {
        for (XeMay x: xeMayArrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void xoa(String bienKiemSoat2) {
        for (int i = 0; i < xeMayArrayList.size(); i++) {
            if(bienKiemSoat2.equals(xeMayArrayList.get(i).getBienKiemSoat())){
                xeMayArrayList.remove(i);
            }
        }
//        for (XeMay xeMay: xeMayArrayList) {
//            if(bienKiemSoat2.equals(xeMay.getBienKiemSoat())){
//                xeMayArrayList.remove(xeMay);
//            }
//        }

    }

    public boolean check(String bienKiemSoat){
        for (XeMay xeMay: xeMayArrayList) {
            if(bienKiemSoat.equals(xeMay.getBienKiemSoat())){
                return true;
            }
        }
        return false;
    }


}
