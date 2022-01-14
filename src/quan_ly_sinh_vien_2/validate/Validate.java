package quan_ly_sinh_vien_2.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);

    private Validate() {
    }

    public static String validateTenSinhVien() {
        while (true) {
            String name = sc.nextLine(); //^([A-Z])\w+$
            Pattern p = Pattern.compile("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$");
            if (p.matcher(name).matches()) {
                return name;
            } else {
                System.err.println("Bạn nhập tên chưa hợp lệ! Nhập lại tên đi nào!");
            }
        }
    }

    public static String validateMaSinhVienLuat() {
        while (true) {
            String maSinhVienLuat = sc.nextLine();
            Pattern p = Pattern.compile("^[S][V][L][0-9]+$");
            if (p.matcher(maSinhVienLuat).matches()) {
                return maSinhVienLuat;
            } else {
                System.err.println("Bạn nhập mã sinh viên chưa hợp lệ! Nhập lại mã đi nào!");
            }
        }
    }


    public static String validateMaSinhVienTheThao() {
        while (true) {
            String maSinhVienTheThao = sc.nextLine();
            Pattern p = Pattern.compile("^[S][V][T][T][0-9]+$");
            if (p.matcher(maSinhVienTheThao).matches()) {
                return maSinhVienTheThao;
            } else {
                System.err.println("Bạn nhập mã sinh viên chưa hợp lệ! Nhập lại mã đi nào!");
            }
        }
    }

    public static String validateTien() {
        while (true) {
            String tien = sc.nextLine();
            Pattern p = Pattern.compile("^\\d+(\\.\\d*)?$");
            if (p.matcher(tien).matches()) {
                return tien;
            } else {
                System.err.println("Bạn nhập tiền chưa hợp lệ! Nhập lại tiền đi nào!");
            }
        }
    }

    public static String validateTuoi(){
//        ^\d{2}/\d{2}/\d{4}$
        while (true){
            String soThe = sc.nextLine();
            Pattern p = Pattern.compile("^\\d+$");
            if(p.matcher(soThe).matches()){
                return soThe;
            }else {
                System.err.println("Nhập vào số tuổi");
            }
        }
    }
}