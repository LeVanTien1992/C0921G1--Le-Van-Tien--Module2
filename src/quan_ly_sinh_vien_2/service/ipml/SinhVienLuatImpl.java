package quan_ly_sinh_vien_2.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_sinh_vien_2.common.FileUtilsSinhVien2;
import quan_ly_sinh_vien_2.models.SinhVien;
import quan_ly_sinh_vien_2.models.SinhVienLuat;
import quan_ly_sinh_vien_2.service.QuanLySinhVien;
import quan_ly_sinh_vien_2.service.ipml.Comparator1;
import quan_ly_sinh_vien_2.validate.Validate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinhVienLuatImpl implements QuanLySinhVien {
    List<SinhVienLuat> sinhVienLuatList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_SVLUAT= "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_sinh_vien_2\\data\\sinhVienLuat.csv";
    {
        sinhVienLuatList = covertStringToSinhVienLuat();
    }
    @Override
    public void them() {
        List<String> stringList = new ArrayList<>();
        SinhVienLuat sinhVienLuat1 = new SinhVienLuat();
        System.out.println("Nhập mã sinh viên");
        sinhVienLuat1.setMaSinhVien(Validate.validateMaSinhVienLuat());
        System.out.println("Nhập tên sinh viên");
        sinhVienLuat1.setTenSinhVien(Validate.validateTenSinhVien());
        System.out.println("Nhập tuổi sinh viên");
        sinhVienLuat1.setTuoi(Integer.parseInt(Validate.validateTuoi()));
        System.out.println("Nhập tranh luận sinh viên");
        sinhVienLuat1.setTranhLuan(Validate.validateTenSinhVien());
        System.out.println("Nhập tiền làm thêm sinh viên");
        sinhVienLuat1.setTienLamThem(Double.parseDouble(Validate.validateTien()));
        sinhVienLuatList.add(sinhVienLuat1);
        stringList.add(sinhVienLuat1.toString());
        FileUtilsSinhVien2.writeFile(FILE_SVLUAT, stringList, true);
    }

    @Override
    public void xoa(String timKiem) {
        for (int i = 0; i < sinhVienLuatList.size(); i++) {
            if(checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                if(sinhVienLuatList.get(i).getMaSinhVien().contains(timKiem)||
                        sinhVienLuatList.get(i).getTenSinhVien().contains(timKiem)){
                    sinhVienLuatList.remove(sinhVienLuatList.get(i));
                }
            }
        }
        List<String> stringList = covertSinhVienLuatToString();
        FileUtilsSinhVien2.writeFile(FILE_SVLUAT, stringList, false);
    }
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVienLuat sinhVienLuat: sinhVienLuatList) {
            if(maSinhVien.equals(sinhVienLuat.getMaSinhVien())){
                return true;
            }
        }
        return false;
    }
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVienLuat sinhVienLuat: sinhVienLuatList) {
            if(tenSinhVien.equals(sinhVienLuat.getTenSinhVien())){
                return true;
            }
        }
        return false;
    }


    @Override
    public void tiemKiem(String tenSinhVien) {
        for (int i = 0; i < sinhVienLuatList.size(); i++) {
            if(sinhVienLuatList.get(i).getTenSinhVien().contains(tenSinhVien)){
                System.out.println(sinhVienLuatList.get(i));
            }
        }
    }

    @Override
    public void hienThi() {
        int id = 1;
        for (SinhVien sinhVienLuat: sinhVienLuatList) {
            System.out.print(id++ + ",");
            System.out.println(sinhVienLuat);
        }
    }
    public List<SinhVienLuat> covertStringToSinhVienLuat() {
        List<String> stringList = FileUtils.readFile(FILE_SVLUAT);
        List<SinhVienLuat> sinhVienLuatList = new ArrayList<>();
        Collections.sort(sinhVienLuatList, new Comparator1());
        String[] arrSinhVienLuat;
        for (String line : stringList) {
            arrSinhVienLuat = line.split(",");
//            String maSinhVien, String tenSinhVien, int tuoi, String tranhLuan, double tienLamThem) {
            sinhVienLuatList.add(new SinhVienLuat(arrSinhVienLuat[0], arrSinhVienLuat[1], Integer.parseInt(arrSinhVienLuat[2]),
                    arrSinhVienLuat[3], Double.parseDouble(arrSinhVienLuat[4])));
            Collections.sort(sinhVienLuatList,new Comparator1());
        }
        return sinhVienLuatList;
    }

    public List<String> covertSinhVienLuatToString() {
        List<String> listString = new ArrayList<>();
        for (SinhVienLuat sinhVienLuat : sinhVienLuatList) {
            listString.add(sinhVienLuat.toString());
        }
        return listString;
    }
}
