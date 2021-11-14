package quan_ly_phuong_tien_giao_thong.controller;

import quan_ly_phuong_tien_giao_thong.service.Ipml.OToIpml;
import quan_ly_phuong_tien_giao_thong.service.Ipml.XeMayIpml;
import quan_ly_phuong_tien_giao_thong.service.Ipml.XeTaiIpml;

import java.util.Scanner;

public class MeNu {
    OToIpml oToIpml = new OToIpml();
    XeMayIpml xeMayIpml = new XeMayIpml();
    XeTaiIpml xeTaiIpml = new XeTaiIpml();
    Scanner scanner = new Scanner(System.in);
    public void MeNu(){
        int choose = 0;
        while (choose != 4){
            System.out.println("1.Thêm mới chức năng");

            System.out.println("2.Hiện thị phương tiện");

            System.out.println("3.Xóa phương tiện");

            System.out.println("4.Thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                   int choose1 = 0;
                    while (choose1 != 4){
                        System.out.println("===================");
                        System.out.println("1.Thêm xe tải");
                        System.out.println("2.Thêm ôtô");
                        System.out.println("3.Thêm xe máy");
                        System.out.println("4.Thoát");
                        System.out.println("===================");
                         choose1 = scanner.nextInt();
                        switch (choose1){
                            case 1:
                                System.out.println("=================");
                                xeTaiIpml.them();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                oToIpml.them();
                                System.out.println("=================");
                                break;
                            case 3:
                                System.out.println("=================");
                                xeMayIpml.them();
                                System.out.println("=================");
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 2:
                    int choose2 = 0;
                    while (choose2 != 4){
                        System.out.println("===================");
                        System.out.println("1.Hiện thị xe tải");
                        System.out.println("2.Hiện thị ôtô");
                        System.out.println("3.Hiện thị xe máy");
                        System.out.println("4.Thoát");
                        System.out.println("===================");
                        choose2 = scanner.nextInt();
                        switch (choose2){
                            case 1:
                                System.out.println("=================");
                                xeTaiIpml.hienThi();
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                oToIpml.hienThi();
                                System.out.println("=================");
                                break;
                            case 3:
                                System.out.println("=================");
                                xeMayIpml.hienThi();
                                System.out.println("=================");
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 3:
                    int choose3 = 0;
                    while (choose3 != 4){
                        System.out.println("===================");
                        System.out.println("1.Xóa xe tải");
                        System.out.println("2.Xóa ôtô");
                        System.out.println("3.Xóa xe máy");
                        System.out.println("4.Thoát");
                        System.out.println("===================");
                        choose3 = scanner.nextInt();
                        switch (choose3){
                            case 1:
                                System.out.println("=================");
                                Scanner scanner = new Scanner(System.in);
                                System.out.println("Nhập vào biển kiểm soát cần tìm: ");
                                String bienKiemSoat = scanner.nextLine();
                                System.out.println("1.Yes"+"\n"+ "2.No");
                                int nhap = scanner.nextInt();
                                if(xeTaiIpml.check(bienKiemSoat)){
                                    if(nhap == 1){
                                        xeTaiIpml.xoa(bienKiemSoat);
                                        System.out.println("Đã xóa thành công");
                                        String nhap1= scanner.nextLine();
                                        if(nhap1.equals("")){
                                            break;
                                        }
                                    }else if(nhap == 2){
                                        break;
                                    }

                                }
                                System.out.println("=================");
                                break;
                            case 2:
                                System.out.println("=================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập vào biển kiểm soát cần tìm: ");
                                String bienKiemSoat2 = scanner2.nextLine();
                                System.out.println("1.Yes"+"\n"+"2.No");
                                int nhap1 = scanner2.nextInt();
                                if(oToIpml.check(bienKiemSoat2)){
                                    if(nhap1 == 1){
                                        oToIpml.xoa(bienKiemSoat2);
                                        System.out.println("Đã xóa thành công");
                                        String nhap2 = scanner2.nextLine();
                                        if(nhap2.equals("")){
                                            break;
                                        }
                                    }else if(nhap1 == 2){
                                        break;
                                    }

                                }

                                System.out.println("=================");
                                break;
                            case 3:
                                System.out.println("=================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập biển kiểm soát cần tìm: ");
                                String bienKiemSoat1 =scanner1.nextLine();
                                System.out.println("1.Yes"+"\n"+"2.No");
                                int nhap2 = scanner1.nextInt();
                                if(xeMayIpml.check(bienKiemSoat1)){
                                    if(nhap2==1){
                                        xeMayIpml.xoa(bienKiemSoat1);
                                        System.out.println("Đã xóa thành công");
                                        String nhap3 = scanner1.nextLine();
                                        if(nhap3.equals("")){
                                            break;
                                        }
                                    }else if(nhap2 == 2){
                                        break;
                                    }

                                }
                                System.out.println("=================");
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
