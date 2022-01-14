package quan_ly_tai_khoan_ngan_hang.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_tai_khoan_ngan_hang.common.FileUtilsNganHang;
import quan_ly_tai_khoan_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_tai_khoan_ngan_hang.service.HeThongQuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemIpml implements HeThongQuanLy {
    static List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
//    Validate validate = new Validate();
    public static final String PATH_TIETKIEM = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_tai_khoan_ngan_hang\\data\\taikhoantietkiem.csv";
    {
        taiKhoanTietKiemList = covertStringToTaiKhoanTietKiem();
    }
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        TaiKhoanTietKiem tietKiem4 = new TaiKhoanTietKiem();
        System.out.println("Thêm mới mã tài khoản");
        tietKiem4.setMaTaiKhoan(Validate.validateMaTaiKhoanTietKiem());
        System.out.println("Thêm mới chủ tài khoản");
        tietKiem4.setTenChuTaiKhoan(Validate.validateTenChuTaiKhoan());
        System.out.println("Thêm mới ngày tạo tài khoản");
        tietKiem4.setNgayTaoTaiKhoan(Validate.validateNgayTaoTaiKhoan());
        System.out.println("Thêm mới số tài khoản tiết kiệm");
        tietKiem4.setSoTaiKhoanTietKiem(Integer.parseInt(Validate.validateSoThe()));
        System.out.println("Thêm mới ngày gửi tiết kiệm");
        tietKiem4.setNgayGuiTietKiem(Validate.validateNgayGuiTietKiem());
        System.out.println("Thêm mới lãi suất");
        tietKiem4.setLaiSuat(Double.parseDouble(Validate.validateSoTien()));
        System.out.println("Thêm mới kỳ hạn");
        tietKiem4.setKyHan(Integer.parseInt(Validate.validateSoThe()));
        taiKhoanTietKiemList.add(tietKiem4);
        stringList.add(tietKiem4.toString());
        FileUtilsNganHang.writeFile(PATH_TIETKIEM, stringList, true);
    }

    @Override
    public void xoa(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if(maTaiKhoan.equals(taiKhoanTietKiemList.get(i).getMaTaiKhoan())){
                taiKhoanTietKiemList.remove(taiKhoanTietKiemList.get(i));
            }
        }
        List<String> stringList = covertTaiKhoanTietKiemToString();
        FileUtilsNganHang.writeFile(PATH_TIETKIEM, stringList, false);
    }
    public boolean checkMaTaiKhoan(String maTaiKhoan){
        for (TaiKhoanTietKiem tietKiem: taiKhoanTietKiemList) {
            if(maTaiKhoan.equals(tietKiem.getMaTaiKhoan())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        int id =  1;
        String kyTu= "STT";
        for (TaiKhoanTietKiem tietKiem: taiKhoanTietKiemList) {
            System.out.print( kyTu + id++ +",");
            System.out.println(tietKiem);
        }
    }
    public List<TaiKhoanTietKiem> covertStringToTaiKhoanTietKiem() {
        List<String> stringList = FileUtils.readFile(PATH_TIETKIEM);
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        String[] arrTaiKhoanTietKiem;
        for (String line : stringList) {
            arrTaiKhoanTietKiem = line.split(",");
            taiKhoanTietKiemList.add(new TaiKhoanTietKiem(arrTaiKhoanTietKiem[0], arrTaiKhoanTietKiem[1], arrTaiKhoanTietKiem[2],
                    Integer.parseInt(arrTaiKhoanTietKiem[3]), arrTaiKhoanTietKiem[4], Double.parseDouble(arrTaiKhoanTietKiem[5]), Integer.parseInt(arrTaiKhoanTietKiem[6])));
        }
        return taiKhoanTietKiemList;
    }

    public List<String> covertTaiKhoanTietKiemToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanTietKiem tietKiem : taiKhoanTietKiemList) {
            listString.add(tietKiem.toString());
        }
        return listString;
    }

    @Override
    public void timKiem(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if(taiKhoanTietKiemList.get(i).getMaTaiKhoan().contains(maTaiKhoan)){
                System.out.println(taiKhoanTietKiemList.get(i));
            }
        }
    }
}
