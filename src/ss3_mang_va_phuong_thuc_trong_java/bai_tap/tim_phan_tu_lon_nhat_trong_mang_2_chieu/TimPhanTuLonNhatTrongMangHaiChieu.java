package ss3_mang_va_phuong_thuc_trong_java.bai_tap.tim_phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của ma trận: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int n = scanner.nextInt();

        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là " +max);
    }
}
