package quan_ly_sinh_vien.controller;

import quan_ly_sinh_vien.models.SinhVienNgoaiNgu;
import quan_ly_sinh_vien.service.impl.SinhVienNgoaiNguImpl;
import quan_ly_sinh_vien.service.impl.SinhVienThongTinImpl;

import java.util.Scanner;

public class MeNu {
    public void displayMeNu(){
        SinhVienThongTinImpl sinhVienThongTin = new SinhVienThongTinImpl();
        SinhVienNgoaiNguImpl sinhVienNgoaiNgu = new SinhVienNgoaiNguImpl();
        Scanner scanner = new Scanner(System.in);
        int choie = 0;
        while (choie!=6){
            System.out.println("1.Thêm");

            System.out.println("2.Xóa");

            System.out.println("3.Sửa");

            System.out.println("4.Tìm Kiếm");

            System.out.println("5.Hiện thị");

            System.out.println("6.Thoát");
            choie = Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    int choie1 = 0;
                    while (choie1 != 3){
                        System.out.println("======================");
                        System.out.println("1.Thêm sinh viên thông tin");
                        System.out.println("2.Thêm sinh viên ngoại ngữ");
                        System.out.println("3.Thoát");
                        System.out.println("======================");
                        choie1 = Integer.parseInt(scanner1.nextLine());
                        switch (choie1){
                            case 1:
                                System.out.println("======================");
                                sinhVienThongTin.them();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("======================");
                                sinhVienNgoaiNgu.them();
                                System.out.println("======================");
                                break;
                        }
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    int choie2 = 0;
                    while (choie2 != 3){
                        System.out.println("======================");
                        System.out.println("1.Xóa sinh viên thông tin");
                        System.out.println("2.Xóa sinh viên ngoại ngữ");
                        System.out.println("3.Thoát");
                        System.out.println("======================");
                        choie2 = Integer.parseInt(scanner2.nextLine());
                        switch (choie2){
                            case 1:
                                System.out.println("======================");
                                Scanner scanner5 = new Scanner(System.in);
                                System.out.println("Nhập vào tên sinh viên cần tìm");
                                String ten1 = scanner5.nextLine();
                                System.out.println("1.Yes" + "\n" + "2.No");
                                int nhap1 = scanner5.nextInt();
                                if(nhap1 == 1){
                                    sinhVienThongTin.xoa(ten1);
                                    System.out.println("Đã xóa thành công");
                                    break;
                                }else if(nhap1 == 2){
                                    break;
                                }
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("======================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào tên sinh viên cần tìm");
                                String ten = scanner3.nextLine();
                                System.out.println("1.Yes" + "\n" + "2.No");
                                int nhap = scanner3.nextInt();
                                if(nhap == 1){
                                    sinhVienNgoaiNgu.xoa(ten);
                                    System.out.println("Đã xóa thành công");
                                    break;
                                }else if(nhap == 2){
                                    break;
                                }
                                System.out.println("======================");
                                break;
                        }
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    int choie3 = 0;
                    while (choie3 != 3){
                        System.out.println("======================");
                        System.out.println("1.Sửa sinh viên thông tin");
                        System.out.println("2 Sửa sinh viên ngoại ngữ");
                        System.out.println("3.Thoát");
                        System.out.println("======================");
                        choie3 = Integer.parseInt(scanner3.nextLine());
                        switch (choie3){
                            case 1:
                                System.out.println("======================");
                                Scanner scanner6 = new Scanner(System.in);
                                System.out.println("Nhập vào mã sinh viên cần tìm");
                                String maSinhVien1 = scanner6.nextLine();
                                sinhVienThongTin.sua(maSinhVien1);
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("======================");
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Nhập vào mã sinh viên cần tìm");
                                String maSinhVien = scanner4.nextLine();
                                sinhVienNgoaiNgu.sua(maSinhVien);
                                System.out.println("======================");
                                break;
                        }
                    }
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    int choie4 = 0;
                    while (choie4 != 3){
                        System.out.println("======================");
                        System.out.println("1.Tìm Kiếm sinh viên thông tin");
                        System.out.println("2 Tìm Kiếm sinh viên ngoại ngữ");
                        System.out.println("3.Thoát");
                        System.out.println("======================");
                        choie4 = Integer.parseInt(scanner4.nextLine());
                        switch (choie4){
                            case 1:
                                System.out.println("======================");
                                Scanner scanner5 = new Scanner(System.in);
                                System.out.println("Nhâp vào mã sinh viên hoặc tên sinh viên cần tìm");
                                String nhap = scanner5.nextLine();
                                sinhVienThongTin.timKiem(nhap);
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("======================");
                                Scanner scanner6 = new Scanner(System.in);
                                System.out.println("Nhâp vào mã sinh viên hoặc tên sinh viên cần tìm");
                                String nhap1 = scanner6.nextLine();
                                sinhVienNgoaiNgu.timKiem(nhap1);
                                System.out.println("======================");
                                break;
                        }
                    }
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    int choie5 = 0;
                    while (choie5 != 3){
                        System.out.println("======================");
                        System.out.println("1.Hiện thị sinh viên thông tin");
                        System.out.println("2 Hiện thị sinh viên ngoại ngữ");
                        System.out.println("3.Thoát");
                        System.out.println("======================");
                        choie5 = Integer.parseInt(scanner5.nextLine());
                        switch (choie5){
                            case 1:
                                System.out.println("======================");
                                sinhVienThongTin.hienThi();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("======================");
                                sinhVienNgoaiNgu.hienThi();
                                System.out.println("======================");
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("======================");
                    System.exit(0);
                    System.out.println("======================");
                    break;
                default:
                    System.out.println("======================");
                    System.out.println("Vui lòng nhập số từ 1-6. Thanks!");
                    System.out.println("======================");
                    break;
            }
        }
    }
}
