package ss3_mang_va_phuong_thuc_trong_java.bai_tap.dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKytuTrongChuoi {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.print("Nhập vào ký tự muốn kiểm tra: ");
        kyTu = scanner.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " +kyTu+ " trong chuỗi = " +count);


















//        String chuoi;
//        char kyTu = 'a';
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào chuỗi bất kỳ: ");
//        chuoi = scanner.nextLine();
//
//        // duyệt từ đầu đến cuối chuỗi
//        for (int i = 0; i < chuoi.length(); i++) {
//            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
//            if (chuoi.charAt(i) == kyTu) {
//                count++;
//            }
//        }
//
//        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
//                " trong chuỗi " + chuoi + " = " + count);
    }
}
