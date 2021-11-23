package ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.controller;

import ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.ipml.MitsubishiIpml;

import java.util.Scanner;

public class MeNu {
    public void meNu(){
        MitsubishiIpml mitsubishiIpml = new MitsubishiIpml();
        Scanner sc = new Scanner(System.in);
        int choie = 0;
        while (choie!=4){
            System.out.println("1.Them");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim kiem");
            System.out.println("4.Thoat");
            choie= sc.nextInt();
            switch (choie){
                case 1:
                    System.out.println("==============");
                    mitsubishiIpml.them();
                    System.out.println("==============");
                    break;
                case 2:
                    System.out.println("==============");
                    mitsubishiIpml.hienThi();
                    System.out.println("==============");
                    break;
                case 3:
                    System.out.println("==============");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap vao ma san pham can tim");
                    String nhap = scanner.nextLine();
                    mitsubishiIpml.timKiem(nhap);
                    System.out.println("==============");
                    break;
            }
        }

    }
}
