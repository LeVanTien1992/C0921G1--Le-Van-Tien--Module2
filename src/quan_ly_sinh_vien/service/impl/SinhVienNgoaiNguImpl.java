package quan_ly_sinh_vien.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.models.Customer;
import quan_ly_sinh_vien.common.FileUtilsSinhVien;
import quan_ly_sinh_vien.models.SinhVienNgoaiNgu;
import quan_ly_sinh_vien.models.SinhVienThongTin;
import quan_ly_sinh_vien.service.QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienNgoaiNguImpl implements QuanLySinhVien {
    static List<SinhVienNgoaiNgu> sinhVienNgoaiNguList = new ArrayList<>();
//    String maSinhVien, String tenSinhVien, String ngayNhapHoc, int soTheSinhVien
    public static final String FILE_SVNN = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_sinh_vien\\data\\sinhvienngoaingu.csv";
    {
        sinhVienNgoaiNguList = covertStringToSinhVienNgoaiNgu();
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        List<String> stringList = new ArrayList<>();
        SinhVienNgoaiNgu sinhVienNgoaiNgu1 = new SinhVienNgoaiNgu();
        System.out.println("Nhập vào mã sinh viên");
        sinhVienNgoaiNgu1.setMaSinhVien(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên");
        sinhVienNgoaiNgu1.setTenSinhVien(scanner.nextLine());
        System.out.println("Nhập vào ngày nhập học");
        sinhVienNgoaiNgu1.setNgayNhapHoc(scanner.nextLine());
        System.out.println("Nhập vào số thẻ sinh viên");
        sinhVienNgoaiNgu1.setSoTheSinhVien(Integer.parseInt(scanner.nextLine()));
        sinhVienNgoaiNguList.add(sinhVienNgoaiNgu1);
        stringList.add(sinhVienNgoaiNgu1.toString());
        FileUtilsSinhVien.writeFile(FILE_SVNN, stringList, true);
    }

    @Override
    public void sua(String maSinhVien) {
        for (int i = 0; i < sinhVienNgoaiNguList.size(); i++) {
            if(maSinhVien.equals(sinhVienNgoaiNguList.get(i).getMaSinhVien())){
                System.out.println("Nhập vào mã sinh viên");
                String maSV = scanner.nextLine();
                System.out.println("Nhập vào tên sinh viên");
                String tenSinhVien = scanner.nextLine();
                System.out.println("Nhập vào ngày nhập học");
                String ngayNhapHoc= scanner.nextLine();
                System.out.println("Nhập vào số thẻ sinh viên");
                int soThe = Integer.parseInt(scanner.nextLine());

                sinhVienNgoaiNguList.get(i).setMaSinhVien(maSV);
                sinhVienNgoaiNguList.get(i).setTenSinhVien(tenSinhVien);
                sinhVienNgoaiNguList.get(i).setNgayNhapHoc(ngayNhapHoc);
                sinhVienNgoaiNguList.get(i).setSoTheSinhVien(soThe);
                break;
            }
        }
        List<String> stringList = covertSinhVienNgoaiNguToString();
        FileUtilsSinhVien.writeFile(FILE_SVNN, stringList, false);
    }

    @Override
    public void xoa(String tenSinhVien) {
        for (int i = 0; i < sinhVienNgoaiNguList.size(); i++) {
            if(tenSinhVien.equals(sinhVienNgoaiNguList.get(i).getTenSinhVien())){
                sinhVienNgoaiNguList.remove(sinhVienNgoaiNguList.get(i));
            }
        }
        List<String> stringList = covertSinhVienNgoaiNguToString();
        FileUtilsSinhVien.writeFile(FILE_SVNN, stringList, false);
    }

    @Override
    public void timKiem(String timKiem) {
        for (int i = 0; i < sinhVienNgoaiNguList.size(); i++) {
            if(checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                if(sinhVienNgoaiNguList.get(i).getMaSinhVien().contains(timKiem)||
                        sinhVienNgoaiNguList.get(i).getTenSinhVien().contains(timKiem)){
                    System.out.println(sinhVienNgoaiNguList.get(i));
                }
            }
        }
    }
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu: sinhVienNgoaiNguList) {
            if(maSinhVien.equals(sinhVienNgoaiNgu.getMaSinhVien())){
                return true;
            }
        }
        return false;
    }
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu: sinhVienNgoaiNguList) {
            if(tenSinhVien.equals(sinhVienNgoaiNgu.getTenSinhVien())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        int id = 1;
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu: sinhVienNgoaiNguList) {
            System.out.print(id++ + ",");
            System.out.println(sinhVienNgoaiNgu);
        }
    }
    public List<SinhVienNgoaiNgu> covertStringToSinhVienNgoaiNgu() {
        List<String> stringList = FileUtils.readFile(FILE_SVNN);
        List<SinhVienNgoaiNgu> sinhVienNgoaiNguList = new ArrayList<>();
        String[] arrSinhVienNgoaiNgu;
        for (String line : stringList) {
            arrSinhVienNgoaiNgu = line.split(",");
            //    String maSinhVien, String tenSinhVien, String ngayNhapHoc, int soTheSinhVien
            sinhVienNgoaiNguList.add(new SinhVienNgoaiNgu(arrSinhVienNgoaiNgu[0],
                    arrSinhVienNgoaiNgu[1], arrSinhVienNgoaiNgu[2],
                    Integer.parseInt(arrSinhVienNgoaiNgu[3])));
        }
        return sinhVienNgoaiNguList;
    }

    public List<String> covertSinhVienNgoaiNguToString() {
        List<String> listString = new ArrayList<>();
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu : sinhVienNgoaiNguList) {
            listString.add(sinhVienNgoaiNgu.toString());
        }
        return listString;
    }

}
