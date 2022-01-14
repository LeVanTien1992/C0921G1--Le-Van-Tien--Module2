package quan_ly_sinh_vien_2.controller;

import quan_ly_sinh_vien_2.service.ipml.SinhVienLuatImpl;
import quan_ly_sinh_vien_2.service.ipml.SinhVienTheThaoImpl;

import java.util.Scanner;

public class MeNu {
    public void displayMeNu(){
        SinhVienTheThaoImpl sinhVienTheThao = new SinhVienTheThaoImpl();
        SinhVienLuatImpl sinhVienLuat = new SinhVienLuatImpl();
        Scanner scanner = new Scanner(System.in);
        int choie = 0;
        while (choie !=5){
            System.out.println("===========QUẢN LÝ SINH VIÊN=============");
            System.out.println("1.Thêm");

            System.out.println("2.Xóa");

            System.out.println("3.Tìm Kiếm");

            System.out.println("4.Hiện thị");

            System.out.println("5.Thoát");
            choie = Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    int choie1 = 0;
                    while (choie1!=3){
                        System.out.println("=====================");
                        System.out.println("1.Thêm sinh viên luật");
                        System.out.println("2.Thêm sinh viên thể thao");
                        System.out.println("3.Thoát");
                        System.out.println("=====================");
                        choie1 = Integer.parseInt(scanner1.nextLine());
                        switch (choie1){
                            case 1:
                                System.out.println("=====================");
                                sinhVienLuat.them();
                                System.out.println("=====================");
                                break;
                            case 2:
                                System.out.println("=====================");
                                sinhVienTheThao.them();
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
                        System.out.println("1.Xóa sinh viên luật");
                        System.out.println("2.Xóa sinh viên thể thao");
                        System.out.println("3.Thoát");
                        System.out.println("=====================");
                        choie2 = Integer.parseInt(scanner2.nextLine());
                        switch (choie2){
                            case 1:
                                System.out.println("=====================");
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Nhập vào mã hoặc tên sinh viên cần tìm");
                                String nha1 = scanner4.nextLine();
                                sinhVienLuat.xoa(nha1);
                                System.out.println("=====================");
                                break;
                            case 2:
                                System.out.println("=====================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào mã hoặc tên sinh viên cần tìm");
                                String nhap = scanner3.nextLine();
                                sinhVienTheThao.xoa(nhap);
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
                        System.out.println("1.Tìm kiếm sinh viên luật");
                        System.out.println("2.Tìm kiếm  sinh viên thể thao");
                        System.out.println("3.Thoát");
                        System.out.println("=====================");
                        choie3 = Integer.parseInt(scanner3.nextLine());
                        switch (choie3){
                            case 1:
                                System.out.println("=====================");
                                Scanner scanner5 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cần tìm");
                                String ten1 = scanner5.nextLine();
                                sinhVienLuat.tiemKiem(ten1);
                                System.out.println("=====================");
                                break;
                            case 2:
                                System.out.println("=====================");
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cần tìm");
                                String ten = scanner4.nextLine();
                                sinhVienTheThao.tiemKiem(ten);
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
                        System.out.println("1.Hiện thị sinh viên luật");
                        System.out.println("2.Hiện thị  sinh viên thể thao");
                        System.out.println("3.Thoát");
                        System.out.println("=====================");
                        choie4 = Integer.parseInt(scanner4.nextLine());
                        switch (choie4){
                            case 1:
                                System.out.println("=====================");
                                sinhVienLuat.hienThi();
                                System.out.println("=====================");
                                break;
                            case 2:
                                System.out.println("=====================");
                                sinhVienTheThao.hienThi();
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
                    System.out.println("Vui lòng nhập số từ 1-5. Thanks!");
                    System.out.println("=====================");
                    break;
            }
        }
    }
}
