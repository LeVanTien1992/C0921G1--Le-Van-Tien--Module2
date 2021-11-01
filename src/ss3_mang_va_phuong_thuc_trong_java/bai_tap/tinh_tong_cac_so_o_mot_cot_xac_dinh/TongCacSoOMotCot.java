package ss3_mang_va_phuong_thuc_trong_java.bai_tap.tinh_tong_cac_so_o_mot_cot_xac_dinh;

import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng ma trận: ");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột ma trận: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("arr[%d][%d]= ", i, j);
                arr[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        System.out.print("Nhập cột cần tính tổng: ");
        int cotJ = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][cotJ];
        }
        System.out.println(sum);
    }
}
