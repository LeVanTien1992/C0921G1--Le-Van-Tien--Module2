package quan_ly_tai_khoan_ngan_hang.controller;

import quan_ly_tai_khoan_ngan_hang.service.ipml.TaiKhoanThanhToanIpml;
import quan_ly_tai_khoan_ngan_hang.service.ipml.TaiKhoanTietKiemIpml;

import java.util.Scanner;

public class MeNu {
    TaiKhoanThanhToanIpml taiKhoanThanhToanIpml = new TaiKhoanThanhToanIpml();
    TaiKhoanTietKiemIpml taiKhoanTietKiemIpml = new TaiKhoanTietKiemIpml();
    Scanner scanner = new Scanner(System.in);
    public void MeNu(){
        int choose = 0;
        menu:
        while (choose !=5 ){
            System.out.println("1.Thêm mới tài khoản");

            System.out.println("2.Xóa tài khoản");

            System.out.println("3.Hiện thị danh sách các tài khoản ngân hàng");

            System.out.println("4.Tìm kiếm");

            System.out.println("5.Thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    int choose1 = 0;
                    while (choose1 != 3){
                        System.out.println("===================");
                        System.out.println("1.Thêm tài khoản thanh toán");
                        System.out.println("2.Thêm tài khoản tiết kiệm");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose1 = scanner.nextInt();
                        switch (choose1){
                            case 1:
                                System.out.println("=================");
                                taiKhoanThanhToanIpml.them();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                taiKhoanTietKiemIpml.them();
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 2:
                    int choose2 = 0;
                    while (choose2 != 3){
                        System.out.println("===================");
                        System.out.println("1.Xóa tài khoản thanh toán");
                        System.out.println("2.Xóa tài khoản tiết kiệm");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose2 = scanner.nextInt();
                        switch (choose2){
                            case 1:
                                System.out.println("=================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản cần tìm");
                                String ma2 = scanner2.nextLine();
                                System.out.println("1.Yes"+"\n"+"2.No");
                                int nhap2 = scanner2.nextInt();
                                if(taiKhoanThanhToanIpml.checkMaTaiKhoan(ma2)){
                                    if(nhap2 == 1){
                                        taiKhoanThanhToanIpml.xoa(ma2);
                                        break;
                                    }else if(nhap2 == 2){
                                        continue menu;
                                    }
                                }
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản cần tìm");
                                String ma1 = scanner1.nextLine();
                                System.out.println("1.Yes"+"\n"+"2.No");
                                int nhap1 = scanner1.nextInt();
                                if(taiKhoanTietKiemIpml.checkMaTaiKhoan(ma1)){
                                    if(nhap1==1){
                                        taiKhoanTietKiemIpml.xoa(ma1);
                                        break;
                                    }else if(nhap1 == 2){
                                        continue menu;
                                    }
                                }
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 3:
                    int choose3 = 0;
                    while (choose3 != 3){
                        System.out.println("===================");
                        System.out.println("1.Hiện thị tài khoản thanh toán");
                        System.out.println("2.Hiện thị tài khoản tiết kiệm");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose3 = scanner.nextInt();
                        switch (choose3){
                            case 1:
                                System.out.println("=================");
                                taiKhoanThanhToanIpml.hienThi();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                taiKhoanTietKiemIpml.hienThi();
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 4:
                    int choose4 = 0;
                    while (choose4 != 3){
                        System.out.println("===================");
                        System.out.println("1.Tìm kiếm tài khoản thanh toán");
                        System.out.println("2.Tìm kiếm tài khoản tiết kiệm");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose4 = scanner.nextInt();
                        switch (choose4){
                            case 1:
                                System.out.println("=================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản cần tìm kiếm");
                                String ma1 = scanner1.nextLine();
                                taiKhoanThanhToanIpml.timKiem(ma1);
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản cần tìm kiếm");
                                String ma2 = scanner2.nextLine();
                                taiKhoanTietKiemIpml.timKiem(ma2);
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
