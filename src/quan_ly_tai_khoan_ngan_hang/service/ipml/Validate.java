package quan_ly_tai_khoan_ngan_hang.service.ipml;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    //            String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
//            int soTaiKhoanTietKiem, String ngayGuiTietKiem, double laiSuat, String kyHan,
//            int soThe, int soTienTrongTaiKhoan

    private Validate() {
    }

    public static String validateMaTaiKhoanThanhToan(){
        while (true){
            String maTaiKhoan = scanner.nextLine();
            Pattern p = Pattern.compile("^[T][K][T][T][0-9]+$");
            if(p.matcher(maTaiKhoan).matches()){
                return maTaiKhoan;
            }else {
                System.err.println("Thêm vào mã tài khoản");
            }
        }
    }
    public static String validateMaTaiKhoanTietKiem(){
        while (true){
            String maTaiKhoan = scanner.nextLine();
            Pattern p = Pattern.compile("^[T][K][T][K][0-9]+$");
            if(p.matcher(maTaiKhoan).matches()){
                return maTaiKhoan;
            }else {
                System.err.println("Thêm vào mã tài khoản");
            }
        }
    }
    public static String validateTenChuTaiKhoan(){
        while (true){
            String tenChuTaiKhoan = scanner.nextLine();
            Pattern p = Pattern.compile("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$");
            if(p.matcher(tenChuTaiKhoan).matches()){
                return tenChuTaiKhoan;
            }else {
                System.err.println("Thêm vào tên chủ tài khoản");
            }
        }
    }
    public static String validateNgayTaoTaiKhoan(){
//        ^\d{2}/\d{2}/\d{4}$
        while (true){
            String ngayTaoTaiKhoan = scanner.nextLine();
            Pattern p = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
            if(p.matcher(ngayTaoTaiKhoan).matches()){
                return ngayTaoTaiKhoan;
            }else {
                System.err.println("Thêm vào ngày tạo tài khoản");
            }
        }
    }
    public static String validateNgayGuiTietKiem(){
//        ^\d{2}/\d{2}/\d{4}$
        while (true){
            String ngayGuiTietKiem = scanner.nextLine();
            Pattern p = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
            if(p.matcher(ngayGuiTietKiem).matches()){
                return ngayGuiTietKiem;
            }else {
                System.err.println("Thêm vào ngày gửi tiết kiệm");
            }
        }
    }
    public static String validateSoThe(){
//        ^\d{2}/\d{2}/\d{4}$
        while (true){
            String soThe = scanner.nextLine();
            Pattern p = Pattern.compile("^\\d+$");
            if(p.matcher(soThe).matches()){
                return soThe;
            }else {
                System.err.println("Nhập vào số thẻ");
            }
        }
    }
    public static String validateSoTien(){
//        ^\d{2}/\d{2}/\d{4}$
        while (true){
            String soTien = scanner.nextLine();
            Pattern p = Pattern.compile("^\\d+(\\.\\d*)?$");
            if(p.matcher(soTien).matches()){
                return soTien;
            }else {
                System.err.println("Nhập vào số tiền");
            }
        }
    }

}
