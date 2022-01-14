package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.controller;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ipml.BlackBerryIpml;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ipml.IphoneIpml;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ipml.SamSungIpml;

import java.util.Scanner;

public class MeNu {
    public void meNu(){
        SamSungIpml samSungIpml = new SamSungIpml();
        IphoneIpml iphoneIpml = new IphoneIpml();
        BlackBerryIpml blackBerryIpml = new BlackBerryIpml();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != 7){
            System.out.println("1.Thêm sản phảm");

            System.out.println("2.Xóa sản phẩm");

            System.out.println("3.Sửa sản phẩm");

            System.out.println("4.Hiện thị danh sách sản phẩm");

            System.out.println("5.Tìm kiếm sản phẩm");

            System.out.println("6.Sắp xếp sản phẩm");

            System.out.println("7.Thoát khỏi chương trình");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    int choose1 = 0;
                    while (choose1 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Thêm sản phẩm Iphone");
                        System.out.println("2.Thêm sản phẩm SamSung");
                        System.out.println("3.Thêm sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose1 = scanner.nextInt();
                        switch (choose1){
                            case 1:
                                System.out.println("=============================");
                                iphoneIpml.them();
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                samSungIpml.them();
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                blackBerryIpml.them();
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
                case 2:
                    int choose2 = 0;
                    while (choose2 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Xóa sản phẩm Iphone");
                        System.out.println("2.Xóa sản phẩm SamSung");
                        System.out.println("3.Xóa sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose2 = scanner.nextInt();
                        switch (choose2){
                            case 1:
                                System.out.println("=============================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cần xóa");
                                String ten2 = scanner2.nextLine();
                                iphoneIpml.xoa(ten2);
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cần xóa");
                                String ten1 = scanner1.nextLine();
                                samSungIpml.xoa(ten1);
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cần xóa");
                                String ten3 = scanner3.nextLine();
                                blackBerryIpml.xoa(ten3);
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
                case 3:
                    int choose3 = 0;
                    while (choose3 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Sửa sản phẩm Iphone");
                        System.out.println("2.Sửa sản phẩm SamSung");
                        System.out.println("3.Sửa sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose3 = scanner.nextInt();
                        switch (choose3){
                            case 1:
                                System.out.println("=============================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào vị trí index cần sửa");
                                int index2 = scanner2.nextInt();
                                iphoneIpml.sua(index2);
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào vị trí index cần sửa");
                                int index3 = scanner3.nextInt();
                                blackBerryIpml.sua(index3);
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào vị trí index cần sửa");
                                int index1 = scanner1.nextInt();
                                blackBerryIpml.sua(index1);
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
                case 4:
                    int choose4 = 0;
                    while (choose4 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Hiện thị sản phẩm Iphone");
                        System.out.println("2.Hiện thị sản phẩm SamSung");
                        System.out.println("3.Hiện thị sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose4 = scanner.nextInt();
                        switch (choose4){
                            case 1:
                                System.out.println("=============================");
                                iphoneIpml.hienThi();
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                samSungIpml.hienThi();
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                blackBerryIpml.hienThi();
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
                case 5:
                    int choose5 = 0;
                    while (choose5 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Tìm kiếm sản phẩm Iphone");
                        System.out.println("2.Tìm kiếm sản phẩm SamSung");
                        System.out.println("3.Tìm kiếm sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose5 = scanner.nextInt();
                        switch (choose5){
                            case 1:
                                System.out.println("=============================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cân tìm kiếm");
                                String ten2 = scanner2.nextLine();
                                iphoneIpml.timKiem(ten2);
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cân tìm kiếm");
                                String ten1 = scanner1.nextLine();
                                samSungIpml.timKiem(ten1);
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Nhập vào tên cân tìm kiếm");
                                String ten3 = scanner3.nextLine();
                                blackBerryIpml.timKiem(ten3);
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
                case 6:
                    int choose6 = 0;
                    while (choose6 != 4){
                        System.out.println("=============================");
                        System.out.println("1.Sắp xếp sản phẩm Iphone");
                        System.out.println("2.Sắp xếp sản phẩm SamSung");
                        System.out.println("3.Sắp xếp sản phẩm BlackBerry");
                        System.out.println("4.Thoát khỏi chương trình");
                        System.out.println("=============================");
                        choose6 = scanner.nextInt();
                        switch (choose6){
                            case 1:
                                System.out.println("=============================");
                                iphoneIpml.sapXep();
                                System.out.println("=============================");
                                break;
                            case 2:
                                System.out.println("=============================");
                                samSungIpml.sapXep();
                                System.out.println("=============================");
                                break;
                            case 3:
                                System.out.println("=============================");
                                blackBerryIpml.sapXep();
                                System.out.println("=============================");
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
