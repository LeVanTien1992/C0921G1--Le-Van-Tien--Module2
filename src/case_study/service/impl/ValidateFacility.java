package case_study.service.impl;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateFacility {
//-	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
//-	Nếu là Villa thì XX sẽ là VL
//-	Nếu là House thì XX sẽ là HO
//-	Nếu Room thì XX sẽ là RO
//-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
//-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
//-	Chi phí thuê phải là số dương
//-	Số lượng người tối đa phải >0 và nhỏ hơn <20
//-	Số tầng phải là số nguyên dương.
//-	 Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ
    Scanner sc = new Scanner(System.in);
    public String validateTenDichVu(){
        while (true){
            String serviceName = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$");
            if(p.matcher(serviceName).matches()){
                return serviceName;
            }else {
                System.err.println("Thêm vào tên dịch vụ");
            }
        }
    }
    public String validateTieuChuanPhong(){
        while (true){
            String roomStandard = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$");
            if(p.matcher(roomStandard).matches()){
                return roomStandard;
            }else {
                System.err.println("Thêm vào tiêu chuẩn phòng");
            }
        }
    }
    public String validateKieuThue(){
        while (true){
            String rentType = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$");
            if(p.matcher(rentType).matches()){
                return rentType;
            }else {
                System.err.println("Thêm vào kiểu thuê");
            }
        }
    }

    public String validateMaDichVuVilla(){
        while (true){
            String serviceIdVilla = sc.nextLine();
            Pattern p = Pattern.compile("^[S][V][V][L][0-9]+$");
            if(p.matcher(serviceIdVilla).matches()){
                return serviceIdVilla;
            }else {
                System.err.println("Thêm vào mã dịch vụ");
            }
        }
    }
    public String validateMaDichVuHouse(){
        while (true){
            String serviceIdHouse = sc.nextLine();
            Pattern p = Pattern.compile("^[S][V][H][O][0-9]+$");
            if(p.matcher(serviceIdHouse).matches()){
                return serviceIdHouse;
            }else {
                System.err.println("Thêm vào mã dịch vụ");
            }
        }
    }
    public String validateMaDichVuRoom(){
        while (true){
            String serviceIdRoom = sc.nextLine();
            Pattern p = Pattern.compile("^[S][V][R][O][0-9]+$");
            if(p.matcher(serviceIdRoom).matches()){
                return serviceIdRoom;
            }else {
                System.err.println("Thêm vào mã dịch vụ");
            }
        }
    }
    public double validateChiPhiThue(){
        double chiPhiThue = Double.parseDouble(sc.nextLine());
        while (true){
           try {
               if(chiPhiThue > 0){
                   return chiPhiThue;
               }else {
                   System.err.println("Thêm vào số chi phí thuê");
               }
           }catch (NumberFormatException n){
               System.err.println("Chi phí thuê không hợp lệ. Thêm vào số chi phí thuê");
           }
        }

    }
    public int validateSoLuongNguoiToiDa(){
        int soLuongNguoi = Integer.parseInt(sc.nextLine());
        while (true){
            try {
                if(soLuongNguoi > 0 || soLuongNguoi < 20){
                    return soLuongNguoi;
                }else {
                    System.err.println("Thêm vào số lượng người tối đa");
                }
            }catch (NumberFormatException n){
                System.err.println("Số người không hợp lệ. Thêm vào số lượng người tối đa");
            }

        }

    }
    public int validateSoTang(){
        int soTang = Integer.parseInt(sc.nextLine());
        while (true){
            try {
                if(soTang > 0){
                    return soTang;
                }else {
                    System.err.println("Thêm vào số tầng");
                }
            }catch (NumberFormatException n){
                System.err.println("Số tầng không hợp lệ. Thêm vào số tầng");
            }

        }

    }
    public double validateDienTichHoBoi(){

        while (true ){
           try {
               double dienTichHoBoi = Double.parseDouble(sc.nextLine());
               if(dienTichHoBoi > 30){
                  return dienTichHoBoi;
               }else {
                   System.err.println("Diện tích hồ bơi không hợp lệ.Thêm vào diện tích sử dụng");
               }
           }catch (NumberFormatException n){
               System.err.println("Thêm vào diện tích sử dụng");
           }
        }
    }
    public double validateDienTichSuDung() {

        while (true){
            try {
                double dienTichSuDung = Double.parseDouble(sc.nextLine());
                if(dienTichSuDung > 30){
                    return dienTichSuDung;
                }else {
                    System.err.println("Sai diện tích sử dụng. Vui lòng nhập lại!");
                }
            }catch (NumberFormatException n){
                System.err.println(" Vui lòng nhập lại!");
            }
        }
    }

}
