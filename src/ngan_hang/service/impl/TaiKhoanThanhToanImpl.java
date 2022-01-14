package ngan_hang.service.impl;

import Candidate_Management_system.common.FileUtils;
import ngan_hang.common.FileUtilsNganHang;
import ngan_hang.models.TaiKhoanThanhToan;
import ngan_hang.service.QuanLyNganHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanImpl implements QuanLyNganHang {
    static List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
//    int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
////    int soThe, double soTienTrongTaiKhoan
    public static final String FILE_THANHTOAN= "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\nganhang\\data\\thanhToan.csv";
    {
        taiKhoanThanhToanList = covertStringToTaiKhoanThanhToan();
    }
    @Override
    public void them() {
        TaiKhoanThanhToan taiKhoanThanhToan1 = new TaiKhoanThanhToan();
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id tài khoản");
        taiKhoanThanhToan1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập mã tài khoản");
        taiKhoanThanhToan1.setMaTaiKhoan(scanner.nextLine());
        System.out.println("Nhập tên chủ tài khoản");
        taiKhoanThanhToan1.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhập ngày tạo tài khoản");
        taiKhoanThanhToan1.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhập số thẻ thanh toán");
        taiKhoanThanhToan1.setSoThe(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số tiền trong tài khoản");
        taiKhoanThanhToan1.setSoTienTrongTaiKhoan(Double.parseDouble(scanner.nextLine()));
        taiKhoanThanhToanList.add(taiKhoanThanhToan1);
        stringList.add(taiKhoanThanhToan1.toString());
        FileUtilsNganHang.writeFile(FILE_THANHTOAN, stringList, true);
    }

    @Override
    public void xoa(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if(maTaiKhoan.equals(taiKhoanThanhToanList.get(i).getMaTaiKhoan())){
                taiKhoanThanhToanList.remove(taiKhoanThanhToanList.get(i));
            }
        }
        List<String > stringList = covertTaiKhoanThanhToanToString();
        FileUtilsNganHang.writeFile(FILE_THANHTOAN, stringList, false);
    }
    public boolean checkMaTaiKhoan(String maTaiKhoan){
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
            if(maTaiKhoan.equals(taiKhoanThanhToan.getMaTaiKhoan())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        int id = 1;
        for (TaiKhoanThanhToan taiKhoanThanhToan: taiKhoanThanhToanList) {
            System.out.print(id++ + ",");
            System.out.println(taiKhoanThanhToan);
        }
    }
    public List<TaiKhoanThanhToan> covertStringToTaiKhoanThanhToan() {
        List<String> stringList = FileUtils.readFile(FILE_THANHTOAN);
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        String[] arrTaiKhoanThanhToan;
        for (String line : stringList) {
            arrTaiKhoanThanhToan = line.split(",");
//    int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
////    int soThe, double soTienTrongTaiKhoan
            taiKhoanThanhToanList.add(new TaiKhoanThanhToan(Integer.parseInt(arrTaiKhoanThanhToan[0]), arrTaiKhoanThanhToan[1], arrTaiKhoanThanhToan[2],
                    arrTaiKhoanThanhToan[3], Integer.parseInt(arrTaiKhoanThanhToan[4]), Double.parseDouble(arrTaiKhoanThanhToan[5])));
        }
        return taiKhoanThanhToanList;
    }

    public List<String> covertTaiKhoanThanhToanToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
            listString.add(taiKhoanThanhToan.toString());
        }
        return listString;
    }

    @Override
    public void tiemKiem(String tenChuTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if(taiKhoanThanhToanList.get(i).getTenChuTaiKhoan().contains(tenChuTaiKhoan)){
                System.out.println(taiKhoanThanhToanList.get(i));
            }
        }
    }
}
