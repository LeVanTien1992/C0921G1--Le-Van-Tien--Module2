package thi_thuc_hanh_module_2.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_tai_khoan_ngan_hang.common.FileUtilsNganHang;
import quan_ly_tai_khoan_ngan_hang.models.TaiKhoanTietKiem;
import thi_thuc_hanh_module_2.common.FileUtilsModel2;
import thi_thuc_hanh_module_2.models.DienThoaiChinhHang;
import thi_thuc_hanh_module_2.models.DienThoaiXachTay;
import thi_thuc_hanh_module_2.service.QuanLyDienThoai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class DienThoaiChinhHangIpml implements QuanLyDienThoai {
    List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_CHINHHANG= "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\thi_thuc_hanh_module_2\\data\\chinhhang.csv";
    {
        dienThoaiChinhHangList = covertStringToDienThoaiChinhHang();
    }
    @Override
    public void them() {
        //            int id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
//                    String thoiGianBaoHanh, String phamViBaoHanh
        List<String> stringList = new ArrayList<>();
        DienThoaiChinhHang dienThoaiChinhHang1= new DienThoaiChinhHang();
        System.out.println("Nhập vào id điện thoại chính hãng");
        dienThoaiChinhHang1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào tên điện thoại chính hãng");
        dienThoaiChinhHang1.setTenDienThoai(scanner.nextLine());
        System.out.println("Nhập vào giá bán điện thoại chính hãng");
        dienThoaiChinhHang1.setGiaBan(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào số lượng điện thoại chính hãng");
        dienThoaiChinhHang1.setSoLuong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào nhà sản xuẩt điện thoại chính hãng");
        dienThoaiChinhHang1.setNhaSanXuat(scanner.nextLine());
        System.out.println("Nhập vào thời gian bảo hành điện thoại chính hãng");
        dienThoaiChinhHang1.setThoiGianBaoHanh(scanner.nextLine());
        System.out.println("Nhập vào phạm vi bảo hành điện thoại chính hãng");
        dienThoaiChinhHang1.setPhamViBaoHanh(scanner.nextLine());
        dienThoaiChinhHangList.add(dienThoaiChinhHang1);
        stringList.add(dienThoaiChinhHang1.toString());
        FileUtilsModel2.writeFile(FILE_CHINHHANG, stringList, true);
    }

    @Override
    public void xoa(int index) {
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
          if(i == index){
              dienThoaiChinhHangList.remove(dienThoaiChinhHangList.get(i));
          }
        }
        List<String> stringList = covertDienThoaiChinhHangToString();
        FileUtilsModel2.writeFile(FILE_CHINHHANG, stringList, false);
    }


    @Override
    public void hienThi() {
        int id = 0;
        for (DienThoaiChinhHang dienThoaiChinhHang: dienThoaiChinhHangList) {
            System.out.print(id++ + ",");
            System.out.println(dienThoaiChinhHang);
        }
    }
    public List<DienThoaiChinhHang> covertStringToDienThoaiChinhHang() {
        List<String> stringList = FileUtils.readFile(FILE_CHINHHANG);
        List<DienThoaiChinhHang> dIenThoaiXachTayList = new ArrayList<>();
        String[] arrDienThoaiChinhHang;
        for (String line : stringList) {
            arrDienThoaiChinhHang = line.split(",");
//            int id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
//                    String thoiGianBaoHanh, String phamViBaoHanh
            dIenThoaiXachTayList.add(new DienThoaiChinhHang(Integer.parseInt(arrDienThoaiChinhHang[0]), arrDienThoaiChinhHang[1],  Double.parseDouble(arrDienThoaiChinhHang[2]),
                    Integer.parseInt(arrDienThoaiChinhHang[3]), arrDienThoaiChinhHang[4], arrDienThoaiChinhHang[5], arrDienThoaiChinhHang[6]));
        }
        return dIenThoaiXachTayList;
    }

    public List<String> covertDienThoaiChinhHangToString() {
        List<String> listString = new ArrayList<>();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            listString.add(dienThoaiChinhHang.toString());
        }
        return listString;
    }

    @Override
    public void timKiem(String tenDienThoai) {
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if(dienThoaiChinhHangList.get(i).getTenDienThoai().contains(tenDienThoai)){
                System.out.println(dienThoaiChinhHangList.get(i));
            }
        }
    }
}
