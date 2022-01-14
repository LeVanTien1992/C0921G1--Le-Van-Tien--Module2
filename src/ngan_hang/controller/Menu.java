package ngan_hang.controller;

import ngan_hang.service.impl.TaiKhoanThanhToanImpl;
import ngan_hang.service.impl.TaiKhoanTietKiemImpl;

import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        TaiKhoanTietKiemImpl taiKhoanTietKiem = new TaiKhoanTietKiemImpl();
        TaiKhoanThanhToanImpl taiKhoanThanhToan = new TaiKhoanThanhToanImpl();
        Scanner scanner = new Scanner(System.in);
        int choie = 0;
        menu:
        while (choie!=5){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –");
            System.out.println("1. Thêm mới");

            System.out.println("2. Xóa" );

            System.out.println("3. Xem danh sách các tài khoản ngân hàng");

            System.out.println("4. Tìm kiếm");

            System.out.println("5. Thoát");
            choie = Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    int choie1 = 0;
                    while (choie1!=3){
                        System.out.println("================");
                        System.out.println("1.Thêm mới tài khoản tiết kiệm");
                        System.out.println("2.Thêm mới tài khoản thanh toán");
                        System.out.println("3.Thoát");
                        System.out.println("================");
                        choie1 = Integer.parseInt(scanner1.nextLine());
                        switch (choie1){
                            case 1:
                                System.out.println("================");
                                taiKhoanTietKiem.them();
                                System.out.println("================");
                                break;
                            case 2:
                                System.out.println("================");
                                taiKhoanThanhToan.them();
                                System.out.println("================");
                                break;
                        }
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    int choie2 = 0;
                    while (choie2!=3){
                        System.out.println("================");
                        System.out.println("1.Xóa tài khoản tiết kiệm");
                        System.out.println("2.Xóa tài khoản thanh toán");
                        System.out.println("3.Thoát");
                        System.out.println("================");
                        choie2 = Integer.parseInt(scanner2.nextLine());
                        switch (choie2){
                            case 1:
                                System.out.println("================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản");
                                String ma = scanner3.nextLine();
                                System.out.println("1.Yes" + "\n" + "2.No");
                                int nhap = scanner3.nextInt();
                                if(taiKhoanTietKiem.checkMaTaiKhoan(ma)){
                                    if(nhap == 1){
                                        taiKhoanTietKiem.xoa(ma);
                                        break;
                                    }else if(nhap == 2){
                                        continue menu;
                                    }
                                }
                                System.out.println("================");
                                break;
                            case 2:
                                System.out.println("================");
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Nhập vào mã tài khoản");
                                String ma1 = scanner4.nextLine();
                                System.out.println("1.Yes" + "\n" + "2.No");
                                int nhap1 = scanner4.nextInt();
                                if(taiKhoanThanhToan.checkMaTaiKhoan(ma1)){
                                    if(nhap1 == 1){
                                        taiKhoanThanhToan.xoa(ma1);
                                        break;
                                    }else if(nhap1 == 2){
                                        continue menu;
                                    }
                                }
                                System.out.println("================");
                                break;
                        }
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    int choie3 = 0;
                    while (choie3!=3){
                        System.out.println("================");
                        System.out.println("1.Xem danh sách tài khoản tiết kiệm");
                        System.out.println("2.Xem danh sách tài khoản thanh toán");
                        System.out.println("3.Thoát");
                        System.out.println("================");
                        choie3 = Integer.parseInt(scanner3.nextLine());
                        switch (choie3){
                            case 1:
                                System.out.println("================");
                                taiKhoanTietKiem.hienThi();
                                System.out.println("================");
                                break;
                            case 2:
                                System.out.println("================");
                                taiKhoanThanhToan.hienThi();
                                System.out.println("================");
                                break;
                        }
                    }
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    int choie4 = 0;
                    while (choie4!=3){
                        System.out.println("================");
                        System.out.println("1.Tìm kiếm tài khoản tiết kiệm");
                        System.out.println("2.Tìm kiếm tài khoản thanh toán");
                        System.out.println("3.Thoát");
                        System.out.println("================");
                        choie4 = Integer.parseInt(scanner4.nextLine());
                        switch (choie4){
                            case 1:
                                System.out.println("================");
                                Scanner scanner5 = new Scanner(System.in);
                                System.out.println("Nhập vào tên chủ tài khoản");
                                String ten = scanner5.nextLine();
                                taiKhoanTietKiem.tiemKiem(ten);
                                System.out.println("================");
                                break;
                            case 2:
                                System.out.println("================");
                                Scanner scanner6 = new Scanner(System.in);
                                System.out.println("Nhập vào tên chủ tài khoản");
                                String ten1 = scanner6.nextLine();
                                taiKhoanThanhToan.tiemKiem(ten1);
                                System.out.println("================");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("================");
                    System.exit(0);
                    System.out.println("================");
                    break;

                default:
                    System.out.println("================");
                    System.out.println("Vui lòng nhập vào số từ 1-5. Thanks!");
                    System.out.println("================");
                    break;
            }
        }
    }
}
