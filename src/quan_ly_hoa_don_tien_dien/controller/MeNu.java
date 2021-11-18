package quan_ly_hoa_don_tien_dien.controller;

import quan_ly_hoa_don_tien_dien.models.KhachHangVietNam;
import quan_ly_hoa_don_tien_dien.service.ipml.KhachHangNuocNgoaiIpml;
import quan_ly_hoa_don_tien_dien.service.ipml.KhachHangVietNamIpml;

import java.util.Scanner;

public class MeNu {
    public void MeNu(){
        KhachHangVietNamIpml khachHangVietNamIpml = new KhachHangVietNamIpml();
        KhachHangNuocNgoaiIpml khachHangNuocNgoaiIpml = new KhachHangNuocNgoaiIpml();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose !=7 ){
            System.out.println("1.Thêm mới khách hàng.");

            System.out.println("2.Hiện thị thông tin khách hàng");

            System.out.println("3.Tìm kiếm khách hàng");

            System.out.println("4.Thêm mới hóa đơn");

            System.out.println("5.Chỉnh sửa hóa đơn");

            System.out.println("6. Hiện thị thông tin chi tiết hóa đơn");

            System.out.println("7.Thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    int choose1 = 0;
                    while (choose1 != 3){
                        System.out.println("===================");
                        System.out.println("1.Thêm khách hàng VN.");
                        System.out.println("2.Thêm khách hàng nước ngoài.");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose1 = scanner.nextInt();
                        switch (choose1){
                            case 1:
                                System.out.println("=================");
                                khachHangVietNamIpml.themKhachHang();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                khachHangNuocNgoaiIpml.themKhachHang();
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 2:
                    int choose2 = 0;
                    while (choose2 != 3){
                        System.out.println("===================");
                        System.out.println("1.Hiện thị khách hàng VN.");
                        System.out.println("2.Hiện thị khách hàng nước ngoài");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose2 = scanner.nextInt();
                        switch (choose2){
                            case 1:
                                System.out.println("=================");
                                khachHangVietNamIpml.hienThiKhachHang();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                khachHangNuocNgoaiIpml.hienThiKhachHang();
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 3:
                    int choose3 = 0;
                    while (choose3 != 3){
                        System.out.println("===================");
                        System.out.println("1.Tìm kiếm khách hàng VN");
                        System.out.println("2.Tìm kiếm khách hàng nước ngoài");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose3 = scanner.nextInt();
                        switch (choose3){
                            case 1:
                                System.out.println("=================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập vào tên khách hàng việt cần tìm");
                                String ten1 = scanner1.nextLine();
                                khachHangVietNamIpml.timKiemKhachHang(ten1);
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào tên khách hàng Nước Ngoài cần tìm");
                                String ten2 = scanner2.nextLine();
                                khachHangNuocNgoaiIpml.timKiemKhachHang(ten2);
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 4:
                    int choose4 = 0;
                    while (choose4 != 3){
                        System.out.println("===================");
                        System.out.println("1.Thêm mới hóa đơn khách hàng VN");
                        System.out.println("2.Thêm mới hóa đơn khách hàng nước ngoài");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose4 = scanner.nextInt();
                        switch (choose4){
                            case 1:
                                System.out.println("=================");
                                System.out.println("Thêm mới hóa đơn khách hàng VN");
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                System.out.println("Thêm mới hóa đơn khách hàng nước ngoài");
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 5:
                    int choose5 = 0;
                    while (choose5 != 3){
                        System.out.println("===================");
                        System.out.println("1.Chỉnh sửa hóa đơn khách hàng VN");
                        System.out.println("2.Chỉnh sửa hóa đơn khách hàng nước ngoài");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose5 = scanner.nextInt();
                        switch (choose5){
                            case 1:
                                System.out.println("=================");
                                System.out.println("Chỉnh sửa hóa đơn khách hàng VN");
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                System.out.println("Chỉnh sửa hóa đơn khách hàng nước ngoài");
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
                case 6:
                    int choose6 = 0;
                    while (choose6 != 3){
                        System.out.println("===================");
                        System.out.println("1.Hiện thị thông tin chi tiết hóa đơn khách hàng VN");
                        System.out.println("2.Hiện thị thông tin chi tiết hóa đơn khách hàng nước ngoài");
                        System.out.println("3.Thoát");
                        System.out.println("===================");
                        choose6 = scanner.nextInt();
                        switch (choose6){
                            case 1:
                                System.out.println("=================");
                                System.out.println("Hiện thị thông tin chi tiết hóa đơn khách hàng VN");
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                System.out.println("Hiện thị thông tin chi tiết hóa đơn khách hàng nước ngoài");
                                System.out.println("=================");
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
