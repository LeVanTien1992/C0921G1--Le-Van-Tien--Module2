package quan_ly_phuong_tien_giao_thong.service.Ipml;

import quan_ly_phuong_tien_giao_thong.models.HangSanXuat;
import quan_ly_phuong_tien_giao_thong.models.OTo;
import quan_ly_phuong_tien_giao_thong.models.XeMay;
import quan_ly_phuong_tien_giao_thong.models.XeTai;
import quan_ly_phuong_tien_giao_thong.service.XeTaiService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiIpml implements XeTaiService {

    HangSanXuat hangSanXuat = new HangSanXuat();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        XeTai xeTai4 = new XeTai();
        System.out.println("Nhập vào bảng kiểm soát");
        xeTai4.setBienKiemSoat(scanner.nextLine());
        System.out.println("Nhập vào tên hãng");
        xeTai4.setTenHang(hangSanXuat.hangSanXuat());
        System.out.println("Nhập vào năm sản xuất");
        xeTai4.setNamSanXuat(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào chủ sở hữu");
        xeTai4.setChuSoHuu(scanner.nextLine());
        System.out.println("Nhập vào trọng tải");
        xeTai4.setTrongTai(Integer.parseInt(scanner.nextLine()));

        xeTaiArrayList.add(xeTai4);
//        for (XeMay xeMay: xeMayArrayList) {
//            System.out.println(xeMay);
//        }
        for (XeTai x: xeTaiArrayList) {
            System.out.println(x);
        }

    }
    static ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();
    static{
        XeTai xeTai1 = new XeTai("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3);
        XeTai xeTai2 = new XeTai("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9);
        XeTai xeTai3 = new XeTai("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12);
        xeTaiArrayList.add(xeTai1);
        xeTaiArrayList.add(xeTai2);
        xeTaiArrayList.add(xeTai3);
    }
    @Override
    public void hienThi() {

        for (XeTai xeTai: xeTaiArrayList) {
            System.out.println(xeTai);
        }

    }

    @Override
    public void xoa(String bienKiemSoat2) {
        for (int i = 0; i < xeTaiArrayList.size(); i++) {
            // kiểm tra tham số biển kiểm soát truyền vào có bằng với biển kiểm soát của danh sách không
            // nếu bằng thì xóa
            if(bienKiemSoat2.equals(xeTaiArrayList.get(i).getBienKiemSoat())){
                xeTaiArrayList.remove(xeTaiArrayList.get(i));
            }
        }

    }

    public boolean check(String bienKiemSoat){
        for (XeTai xeTai: xeTaiArrayList) {
            // kiểm tra xem biển kiểm soát mới truyền vào có bằng với biển kiểm soát của danh sách hiện tại không
            // nếu bằng thì return true, không bằng thì return false
            if(bienKiemSoat.equals(xeTai.getBienKiemSoat())){
                return true;
            }
        }
        return false;
    }
}
