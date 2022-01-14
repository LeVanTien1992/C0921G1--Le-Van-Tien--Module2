package quan_ly_phuong_tien_giao_thong.service.ipml;

import quan_ly_phuong_tien_giao_thong.models.HangSanXuat;
import quan_ly_phuong_tien_giao_thong.models.OTo;
import quan_ly_phuong_tien_giao_thong.service.OToService;

import java.util.ArrayList;
import java.util.Scanner;

public class OToIpml implements OToService {

    HangSanXuat hangSanXuat = new HangSanXuat();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        OTo oTo4 = new OTo();
        System.out.println("Nhập vào bảng kiểm soát");
        oTo4.setBienKiemSoat(scanner.nextLine());
        System.out.println("Nhập vào tên hãng");
        oTo4.setTenHang(hangSanXuat.hangSanXuat());
        System.out.println("Nhập vào năm sản xuất");
        oTo4.setNamSanXuat(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào chủ sở hữu");
        oTo4.setChuSoHuu(scanner.nextLine());
        System.out.println("NHập vào số chổ ngồi");
        oTo4.setSoChoNgoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào kiểu xe");
        oTo4.setKieuXe(scanner.nextLine());

        oToArrayList.add(oTo4);
//        for (XeMay xeMay: xeMayArrayList) {
//            System.out.println(xeMay);
//        }
        for (OTo x: oToArrayList) {
            System.out.println(x);
        }

    }
    static ArrayList<OTo> oToArrayList = new ArrayList<OTo>();
    static {
        OTo oTo1 = new OTo("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du Lịch");
        OTo oTo2 = new OTo("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe khách");
        OTo oTo3 = new OTo("43B-453.89", "Ford", 2020, "Nguyễn Văn C", 16, "Xe khách");
        oToArrayList.add(oTo1);
        oToArrayList.add(oTo2);
        oToArrayList.add(oTo3);
    }

    @Override
    public void hienThi() {

        for (OTo o: oToArrayList) {
            System.out.println(o);
        }

    }

    @Override
    public void xoa(String bienKiemSoat2) {
        for (int i = 0; i < oToArrayList.size(); i++) {
            if(bienKiemSoat2.equals(oToArrayList.get(i).getBienKiemSoat())){
                oToArrayList.remove(i);
            }
        }

    }

    public boolean check(String bienKiemSoat){
        for (OTo oTo:oToArrayList) {
            if(bienKiemSoat.equals(oTo.getBienKiemSoat())){
                return true;
            }
        }
        return false;
    }


}
