package ss3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        // khái báo biến và nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ của mảng: ");
        int n = sc.nextInt();
        // nhập các phần tử của mảng
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào phần tử thứ " +i+ ": ");
            arr[i] = sc.nextInt();
        }
        // in các phần tử của mảng
        System.out.print("Mảng gồm các phần tử: ");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("Nhập phần từ cần xóa: ");
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTu(arr, soCanXoa);
        if (viTriCanXoa == -1){
            System.out.println("Phần tử không có trong mảng!");
        }else {
            arr = xoaPhanTu(arr, viTriCanXoa);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    static int timViTriPhanTu(int[] arr, int phanTu){
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == phanTu){
                viTri = i;
            }
        }
        return viTri;
    }
    static int[] xoaPhanTu(int[] arr, int viTri){
        int[] daySoMoi = new int[arr.length -1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = arr[i];
        }
        for (int i = viTri + 1; i < arr.length; i++) {
            daySoMoi[i -1] = arr[i];
        }
        return daySoMoi;
    }
}
