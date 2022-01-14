package thi_thuc_hanh_module_2.controller;

import quan_ly_sinh_vien_2.service.ipml.SinhVienLuatImpl;
import quan_ly_sinh_vien_2.service.ipml.SinhVienTheThaoImpl;
import thi_thuc_hanh_module_2.models.DienThoaiXachTay;
import thi_thuc_hanh_module_2.service.QuanLyDienThoai;
import thi_thuc_hanh_module_2.service.ipml.DienThoaiChinhHangIpml;
import thi_thuc_hanh_module_2.service.ipml.DienThoaiXachTayIpml;

import java.util.Scanner;

public class MeNu {
    public void displayMeNu(){
        QuanLyDienThoai dienThoaiChinhHangIpml = new DienThoaiChinhHangIpml();
        QuanLyDienThoai dienThoaiXachTayIpml = new DienThoaiXachTayIpml();
        Scanner scanner = new Scanner(System.in);
        int choie = 0;
        menu:
        while (choie !=5){
            try {
                System.out.println("===========QUẢN LÝ DIỆN THOẠI=============");
                System.out.println("1.Thêm");

                System.out.println("2.Xóa");

                System.out.println("3.Hiện thị danh sách điện thoại.");

                System.out.println("4.Tìm kiếm");

                System.out.println("5.Thoát");
                choie = Integer.parseInt(scanner.nextLine());
                switch (choie){
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        int choie1 = 0;
                        while (choie1!=3){
                            System.out.println("=====================");
                            System.out.println("1.Thêm điện thoại chính hãng");
                            System.out.println("2.Thêm điện thoại xách tay");
                            System.out.println("3.Thoát");
                            System.out.println("=====================");
                            choie1 = Integer.parseInt(scanner1.nextLine());
                            switch (choie1){
                                case 1:
                                    System.out.println("=====================");
                                    dienThoaiChinhHangIpml.them();
                                    System.out.println("=====================");
                                    break;
                                case 2:
                                    System.out.println("=====================");
                                    dienThoaiXachTayIpml.them();
                                    System.out.println("=====================");
                                    break;
                                default:
                                    System.out.println("=====================");
                                    System.err.println("Vui lòng nhập số từ 1 -> 3. Thanks!");
                                    System.out.println("=====================");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        int choie2 = 0;
                        while (choie2!=3){
                            System.out.println("=====================");
                            System.out.println("1.Xóa điện thoại chính hãng");
                            System.out.println("2.Xóa điện thoại xách tay");
                            System.out.println("3.Thoát");
                            System.out.println("=====================");
                            choie2 = Integer.parseInt(scanner2.nextLine());
                            switch (choie2){
                                case 1:
                                    System.out.println("=====================");
                                    Scanner scanner3= new Scanner(System.in);
                                    System.out.println("Nhập vào vị trí index cần tìm");
                                    int index = Integer.parseInt(scanner3.nextLine());
                                    System.out.println("1.Yes" + "\n"+ "2.No");
                                    int nhap = scanner3.nextInt();
                                    if(nhap==1){
                                        dienThoaiChinhHangIpml.xoa(index);
                                        System.err.println("Đã xóa thành công!");
                                        break;
                                    }else if(nhap==2){
                                        continue menu;
                                    }

                                    System.out.println("=====================");
                                    break;
                                case 2:
                                    System.out.println("=====================");
                                    Scanner scanner7= new Scanner(System.in);
                                    System.out.println("Nhập vào vị trí index cần tìm");
                                    int index1 = Integer.parseInt(scanner7.nextLine());
                                    System.out.println("1.Yes" + "\n"+ "2.No");
                                    int nhap1 = scanner7.nextInt();
                                    if(nhap1==1){
                                        dienThoaiXachTayIpml.xoa(index1);
                                        System.err.println("Đã xóa thành công!");
                                        break;
                                    }else if(nhap1==2){
                                        continue menu;
                                    }
                                    System.out.println("=====================");
                                    break;
                                default:
                                    System.out.println("=====================");
                                    System.err.println("Vui lòng nhập số từ 1 -> 3. Thanks!");
                                    System.out.println("=====================");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        Scanner scanner3 = new Scanner(System.in);
                        int choie3 = 0;
                        while (choie3!=3){
                            System.out.println("=====================");
                            System.out.println("1.Hiện thị điện thoại chính hãng");
                            System.out.println("2.Hiện thị điện thoại xách tay");
                            System.out.println("3.Thoát");
                            System.out.println("=====================");
                            choie3 = Integer.parseInt(scanner3.nextLine());
                            switch (choie3){
                                case 1:
                                    System.out.println("=====================");
                                    dienThoaiChinhHangIpml.hienThi();
                                    System.out.println("=====================");
                                    break;
                                case 2:
                                    System.out.println("=====================");
                                    dienThoaiXachTayIpml.hienThi();
                                    System.out.println("=====================");
                                    break;
                                default:
                                    System.out.println("=====================");
                                    System.err.println("Vui lòng nhập số từ 1 -> 3. Thanks!");
                                    System.out.println("=====================");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        Scanner scanner4 = new Scanner(System.in);
                        int choie4 = 0;
                        while (choie4!=3){
                            System.out.println("=====================");
                            System.out.println("1.Tìm kiếm điện thoại chính hãng");
                            System.out.println("2.Tìm kiếm điện thoại xách tay");
                            System.out.println("3.Thoát");
                            System.out.println("=====================");
                            choie4 = Integer.parseInt(scanner4.nextLine());
                            switch (choie4){
                                case 1:
                                    System.out.println("=====================");
                                    Scanner scanner5 = new Scanner(System.in);
                                    System.out.println("Nhập vào tên cần tìm kiếm");
                                    String ten = scanner5.nextLine();
                                    dienThoaiChinhHangIpml.timKiem(ten);
                                    System.out.println("=====================");
                                    break;
                                case 2:
                                    System.out.println("=====================");
                                    Scanner scanner6 = new Scanner(System.in);
                                    System.out.println("Nhập vào tên cần tìm kiếm");
                                    String ten1 = scanner6.nextLine();
                                    dienThoaiXachTayIpml.timKiem(ten1);
                                    System.out.println("=====================");
                                    break;
                                default:
                                    System.out.println("=====================");
                                    System.err.println("Vui lòng nhập số từ 1 -> 3. Thanks!");
                                    System.out.println("=====================");
                                    break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("=====================");
                        System.exit(0);
                        System.out.println("=====================");
                        break;
                    default:
                        System.out.println("=====================");
                        System.out.println("Vui lòng nhập vào số từ 1-5. Thanks!");
                        System.out.println("=====================");
                        break;
                }
            }catch (NumberFormatException numberFormatException){
                System.err.println("Vui lòng nhập số từ 1->5! Thanks!");
            }
        }
    }
}
