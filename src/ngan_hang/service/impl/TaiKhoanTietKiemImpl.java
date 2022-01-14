package ngan_hang.service.impl;

import Candidate_Management_system.common.FileUtils;
import ngan_hang.common.FileUtilsNganHang;
import ngan_hang.models.TaiKhoanTietKiem;
import ngan_hang.service.QuanLyNganHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemImpl implements QuanLyNganHang {
    static List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
//    int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
//    double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kiHan\
    public static final String FILE_TIETKIEM = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\nganhang\\data\\tietKiem.csv";
    {
        taiKhoanTietKiemList= covertStringToTaiKhoanTietKiem();
    }
    @Override
    public void them() {
        TaiKhoanTietKiem taiKhoanTietKiem1 = new TaiKhoanTietKiem();
        List<String > stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id tài khoản");
        taiKhoanTietKiem1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập mã tài khoản");
        taiKhoanTietKiem1.setMaTaiKhoan(scanner.nextLine());
        System.out.println("Nhập tên chủ tài khoản");
        taiKhoanTietKiem1.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhập ngày tạo tài khoản");
        taiKhoanTietKiem1.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhập số tiền gửi tiết kiêm");
        taiKhoanTietKiem1.setSoTienGuiTietKiem(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập ngày gửi tiết kiêm");
        taiKhoanTietKiem1.setNgayGuiTietKiem(scanner.nextLine());
        System.out.println("Nhập số lãi suât tiết kiêm");
        taiKhoanTietKiem1.setLaiSuat(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập kì hạn tiết kiêm");
        taiKhoanTietKiem1.setLaiSuat(Integer.parseInt(scanner.nextLine()));
        taiKhoanTietKiemList.add(taiKhoanTietKiem1);
        stringList.add(taiKhoanTietKiem1.toString());
        FileUtilsNganHang.writeFile(FILE_TIETKIEM, stringList, true);
    }

    @Override
    public void xoa(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if(maTaiKhoan.equals(taiKhoanTietKiemList.get(i).getMaTaiKhoan())){
                taiKhoanTietKiemList.remove(taiKhoanTietKiemList.get(i));
            }
        }
        List<String> stringList = covertTaiKhoanTietKiemToString();
        FileUtilsNganHang.writeFile(FILE_TIETKIEM, stringList, false);
    }
    public boolean checkMaTaiKhoan(String maTaiKhoan){
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            if(maTaiKhoan.equals(taiKhoanTietKiem.getMaTaiKhoan())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        int id = 1;
        for (TaiKhoanTietKiem taiKhoanTietKiem: taiKhoanTietKiemList) {
            System.out.print(id++ + ",");
            System.out.println(taiKhoanTietKiem);
        }
    }
    public List<TaiKhoanTietKiem> covertStringToTaiKhoanTietKiem() {
        List<String> stringList = FileUtils.readFile(FILE_TIETKIEM);
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        String[] arrTaiKhoanTietKiem;
        for (String line : stringList) {
            arrTaiKhoanTietKiem = line.split(",");
            //    int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
//    double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kiHan\
            taiKhoanTietKiemList.add(new TaiKhoanTietKiem(Integer.parseInt(arrTaiKhoanTietKiem[0]), arrTaiKhoanTietKiem[1], arrTaiKhoanTietKiem[2],
                    arrTaiKhoanTietKiem[3], Double.parseDouble(arrTaiKhoanTietKiem[4]), arrTaiKhoanTietKiem[5], Double.parseDouble(arrTaiKhoanTietKiem[6]), Integer.parseInt(arrTaiKhoanTietKiem[7])));
        }
        return taiKhoanTietKiemList;
    }

    public List<String> covertTaiKhoanTietKiemToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            listString.add(taiKhoanTietKiem.toString());
        }
        return listString;
    }

    @Override
    public void tiemKiem(String tenChuTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if(taiKhoanTietKiemList.get(i).getTenChuTaiKhoan().contains(tenChuTaiKhoan)){
                System.out.println(taiKhoanTietKiemList.get(i));
            }
        }
    }
}
