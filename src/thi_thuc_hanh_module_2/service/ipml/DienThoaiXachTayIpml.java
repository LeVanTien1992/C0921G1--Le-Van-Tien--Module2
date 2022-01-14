package thi_thuc_hanh_module_2.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_sinh_vien_2.service.ipml.Comparator1;
import thi_thuc_hanh_module_2.common.FileUtilsModel2;
import thi_thuc_hanh_module_2.models.DienThoaiChinhHang;
import thi_thuc_hanh_module_2.models.DienThoaiXachTay;
import thi_thuc_hanh_module_2.service.QuanLyDienThoai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayIpml implements QuanLyDienThoai {
    List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_XACHTAY= "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\thi_thuc_hanh_module_2\\data\\xachtay.csv";

    {
        dienThoaiXachTayList= covertStringToDienThoaiXachTay();
    }
    @Override
    public void them() {
        //            int id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
//                    String quocGiaXachTay, String trangThai
        List<String> stringList = new ArrayList<>();
        DienThoaiXachTay dienThoaiXachTay1= new DienThoaiXachTay();
        System.out.println("Nhập vào id điện thoại xách tay");
        dienThoaiXachTay1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào tên điện thoại xách tay");
        dienThoaiXachTay1.setTenDienThoai(scanner.nextLine());
        System.out.println("Nhập vào giá bán điện thoại xách tay");
        dienThoaiXachTay1.setGiaBan(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào số lượng điện thoại xách tay");
        dienThoaiXachTay1.setSoLuong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào nhà sản xuẩt điện thoại xách tay");
        dienThoaiXachTay1.setNhaSanXuat(scanner.nextLine());
        System.out.println("Nhập vào quốc gia xách tay điện thoại xách tay");
        dienThoaiXachTay1.setQuocGiaXachTay(scanner.nextLine());
        System.out.println("Nhập vào trạng thái điện thoại xách tay");
        dienThoaiXachTay1.setTrangThai(scanner.nextLine());
        dienThoaiXachTayList.add(dienThoaiXachTay1);
        stringList.add(dienThoaiXachTay1.toString());
        FileUtilsModel2.writeFile(FILE_XACHTAY, stringList, true);
    }

    @Override
    public void xoa(int index) {
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if(i == index){
                dienThoaiXachTayList.remove(dienThoaiXachTayList.get(i));
            }
        }
        List<String> stringList = covertDienThoaiChinhHangToString();
        FileUtilsModel2.writeFile(FILE_XACHTAY, stringList, false);
    }

    @Override
    public void hienThi() {
        int id = 0;
        for (DienThoaiXachTay dIenThoaiXachTay: dienThoaiXachTayList) {
            System.out.print(id++ + ",");
            System.out.println(dIenThoaiXachTay);
        }
    }
    public List<DienThoaiXachTay> covertStringToDienThoaiXachTay() {
        List<String> stringList = FileUtils.readFile(FILE_XACHTAY);
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        String[] arrDienThoaiXachTay;
        for (String line : stringList) {
            arrDienThoaiXachTay = line.split(",");
//            int id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
//                    String quocGiaXachTay, String trangThai
            dienThoaiXachTayList.add(new DienThoaiXachTay(Integer.parseInt(arrDienThoaiXachTay[0]), arrDienThoaiXachTay[1],  Double.parseDouble(arrDienThoaiXachTay[2]),
                    Integer.parseInt(arrDienThoaiXachTay[3]), arrDienThoaiXachTay[4], arrDienThoaiXachTay[5], arrDienThoaiXachTay[6]));
        }
        return dienThoaiXachTayList;
    }

    public List<String> covertDienThoaiChinhHangToString() {
        List<String> listString = new ArrayList<>();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            listString.add(dienThoaiXachTay.toString());
        }
        return listString;
    }
    @Override
    public void timKiem(String tenDienThoai) {
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if(dienThoaiXachTayList.get(i).getTenDienThoai().contains(tenDienThoai)){
                System.out.println(dienThoaiXachTayList.get(i));
            }
        }
    }
}
