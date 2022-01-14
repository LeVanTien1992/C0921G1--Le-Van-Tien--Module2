package quan_ly_sinh_vien.service.impl;

import Candidate_Management_system.common.FileUtils;
import quan_ly_sinh_vien.common.FileUtilsSinhVien;
import quan_ly_sinh_vien.models.SinhVienNgoaiNgu;
import quan_ly_sinh_vien.models.SinhVienThongTin;
import quan_ly_sinh_vien.service.QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienThongTinImpl implements QuanLySinhVien {
    static List<SinhVienThongTin > sinhVienThongTinList = new ArrayList<>();
//    String maSinhVien, String tenSinhVien, String ngayNhapHoc,
//    double tienHocPhi, String ngayRaTruong
    public static final String FILE_SVTT = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_sinh_vien\\data\\sinhvienthongtin.csv";
    {
        sinhVienThongTinList= covertStringToSinhVienThongTin();
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        List<String> stringList = new ArrayList<>();
        SinhVienThongTin sinhVienThongTin1 = new SinhVienThongTin();
        System.out.println("Nhập vào mã sinh viên");
        sinhVienThongTin1.setMaSinhVien(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên");
        sinhVienThongTin1.setTenSinhVien(scanner.nextLine());
        System.out.println("Nhập vào ngày nhập học");
        sinhVienThongTin1.setNgayNhapHoc(scanner.nextLine());
        System.out.println("Nhập vào tiền học phí");
        sinhVienThongTin1.setTienHocPhi(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào ngày ra trường");
        sinhVienThongTin1.setNgayRaTruong(scanner.nextLine());
        sinhVienThongTinList.add(sinhVienThongTin1);
        stringList.add(sinhVienThongTin1.toString());
        FileUtilsSinhVien.writeFile(FILE_SVTT, stringList, true);
    }

    @Override
    public void sua(String maSinhVien) {
        for (int i = 0; i < sinhVienThongTinList.size(); i++) {
            if(maSinhVien.equals(sinhVienThongTinList.get(i).getMaSinhVien())){
                System.out.println("Nhập vào mã sinh viên");
                String maSV = scanner.nextLine();
                System.out.println("Nhập vào tên sinh viên");
                String tenSinhVien = scanner.nextLine();
                System.out.println("Nhập vào ngày nhập học");
                String ngayNhapHoc= scanner.nextLine();
                System.out.println("Nhập vào số tiền học phí");
                double tienHocPhi = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào ngày ra trường");
                String ngayRaTruong = scanner.nextLine();

                sinhVienThongTinList.get(i).setMaSinhVien(maSV);
                sinhVienThongTinList.get(i).setTenSinhVien(tenSinhVien);
                sinhVienThongTinList.get(i).setNgayNhapHoc(ngayNhapHoc);
                sinhVienThongTinList.get(i).setTienHocPhi(tienHocPhi);
                sinhVienThongTinList.get(i).setNgayRaTruong(ngayRaTruong);
                break;
            }
        }
        List<String> stringList = covertSinhVienThongTinToString();
        FileUtilsSinhVien.writeFile(FILE_SVTT, stringList, false);
    }

    @Override
    public void xoa(String tenSinhVien) {
        for (int i = 0; i < sinhVienThongTinList.size(); i++) {
            if(tenSinhVien.equals(sinhVienThongTinList.get(i).getTenSinhVien())){
                sinhVienThongTinList.remove(sinhVienThongTinList.get(i));
            }
        }
        List<String> stringList = covertSinhVienThongTinToString();
        FileUtilsSinhVien.writeFile(FILE_SVTT, stringList, false);
    }

    @Override
    public void timKiem(String timKiem) {
        for (int i = 0; i < sinhVienThongTinList.size(); i++) {
            if(checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                if(sinhVienThongTinList.get(i).getMaSinhVien().contains(timKiem)||
                sinhVienThongTinList.get(i).getTenSinhVien().contains(timKiem)){
                    System.out.println(sinhVienThongTinList.get(i));
                }
            }
        }
    }
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVienThongTin sinhVienThongTin: sinhVienThongTinList) {
            if(maSinhVien.equals(sinhVienThongTin.getMaSinhVien())){
                return true;
            }
        }
        return false;
    }
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVienThongTin sinhVienThongTin: sinhVienThongTinList) {
            if(tenSinhVien.equals(sinhVienThongTin.getTenSinhVien())){
                return true;
            }
        }
        return false;
    }


    @Override
    public void hienThi() {
        int id = 1;
        for (SinhVienThongTin sinhVienThongTin: sinhVienThongTinList) {
            System.out.print(id++ + ",");
            System.out.println(sinhVienThongTin);
        }
    }
    public List<SinhVienThongTin> covertStringToSinhVienThongTin() {
        List<String> stringList = FileUtils.readFile(FILE_SVTT);
        List<SinhVienThongTin> sinhVienThongTinList = new ArrayList<>();
        String[] arrSinhVienThongTin;
        for (String line : stringList) {
            arrSinhVienThongTin = line.split(",");
            ///    String maSinhVien, String tenSinhVien, String ngayNhapHoc,
//    double tienHocPhi, String ngayRaTruong
            sinhVienThongTinList.add(new SinhVienThongTin(arrSinhVienThongTin[0],
                    arrSinhVienThongTin[1], arrSinhVienThongTin[2],
                    Double.parseDouble(arrSinhVienThongTin[3]), arrSinhVienThongTin[4]));
        }
        return sinhVienThongTinList;
    }

    public List<String> covertSinhVienThongTinToString() {
        List<String> listString = new ArrayList<>();
        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTinList) {
            listString.add(sinhVienThongTin.toString());
        }
        return listString;
    }
}
