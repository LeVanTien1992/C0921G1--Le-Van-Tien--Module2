package quan_ly_tai_khoan_ngan_hang.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_tai_khoan_ngan_hang.common.FileUtilsNganHang;
import quan_ly_tai_khoan_ngan_hang.models.TaiKhoanThanhToan;
import quan_ly_tai_khoan_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_tai_khoan_ngan_hang.service.HeThongQuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanIpml implements HeThongQuanLy {
    static List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
//    Validate validate = new Validate();
    public static final String PATH_THANHTOAN = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_tai_khoan_ngan_hang\\data\\taikhoanthanhtoan.csv";
    {
        taiKhoanThanhToanList = covertStringToTaiKhoanThanhToan();
    }
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        TaiKhoanThanhToan thanhToan4 = new TaiKhoanThanhToan();
        System.out.println("Thêm mới mã tài khoản");
        thanhToan4.setMaTaiKhoan(Validate.validateMaTaiKhoanThanhToan());
        System.out.println("Thêm mới chủ tài khoản");
        thanhToan4.setTenChuTaiKhoan(Validate.validateTenChuTaiKhoan());
        System.out.println("Thêm mới ngày tạo tài khoản");
        thanhToan4.setNgayTaoTaiKhoan(Validate.validateNgayTaoTaiKhoan());
        System.out.println("Thêm mới số thẻ");
        thanhToan4.setSoThe(Integer.parseInt(Validate.validateSoThe()));
        System.out.println("Thêm mới số tiền trong tài khoản");
        thanhToan4.setSoTienTrongTaiKhoan(Double.parseDouble(Validate.validateSoTien()));
        taiKhoanThanhToanList.add(thanhToan4);
        stringList.add(thanhToan4.toString());
        FileUtilsNganHang.writeFile(PATH_THANHTOAN, stringList, true);
    }

    @Override
    public void xoa(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if(maTaiKhoan.equals(taiKhoanThanhToanList.get(i).getMaTaiKhoan())){
                taiKhoanThanhToanList.remove(taiKhoanThanhToanList.get(i));
            }
        }
        List<String> stringList = covertTaiKhoanThanhToanToString();
        FileUtilsNganHang.writeFile(PATH_THANHTOAN, stringList, false);
    }
    public boolean checkMaTaiKhoan(String maTaiKhoan){
        for (TaiKhoanThanhToan thanhToan: taiKhoanThanhToanList) {
            if(maTaiKhoan.equals(thanhToan.getMaTaiKhoan())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        int id = 1;
        String chuoi = "STT";
        for (TaiKhoanThanhToan thanhToan: taiKhoanThanhToanList) {
            System.out.print(chuoi+ id++ +",");
            System.out.println(thanhToan);
        }
    }
    public List<TaiKhoanThanhToan> covertStringToTaiKhoanThanhToan() {
        List<String> stringList = FileUtils.readFile(PATH_THANHTOAN);
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        String[] arrTaiKhoanThanhToan;
        for (String line : stringList) {
            arrTaiKhoanThanhToan = line.split(",");
            taiKhoanThanhToanList.add(new TaiKhoanThanhToan(arrTaiKhoanThanhToan[0], arrTaiKhoanThanhToan[1], arrTaiKhoanThanhToan[2],
                    Integer.parseInt(arrTaiKhoanThanhToan[3]), Double.parseDouble(arrTaiKhoanThanhToan[4])));
        }
        return taiKhoanThanhToanList;
    }

    public List<String> covertTaiKhoanThanhToanToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanThanhToan thanhToan : taiKhoanThanhToanList) {
            listString.add(thanhToan.toString());
        }
        return listString;
    }

    @Override
    public void timKiem(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if(taiKhoanThanhToanList.get(i).getMaTaiKhoan().contains(maTaiKhoan)){
                System.out.println(taiKhoanThanhToanList.get(i));
            }
        }
    }
}
