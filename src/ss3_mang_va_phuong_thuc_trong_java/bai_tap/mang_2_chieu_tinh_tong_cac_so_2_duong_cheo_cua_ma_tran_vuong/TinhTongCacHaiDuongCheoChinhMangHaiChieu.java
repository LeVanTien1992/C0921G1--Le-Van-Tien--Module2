package ss3_mang_va_phuong_thuc_trong_java.bai_tap.mang_2_chieu_tinh_tong_cac_so_2_duong_cheo_cua_ma_tran_vuong;

import java.util.Scanner;

public class TinhTongCacHaiDuongCheoChinhMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cấp bậc của ma trận: ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr["+i+"]["+j+"]= ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int tongCheoChinh = 0;
        int tongCheoPhu = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    tongCheoChinh += arr[i][i];
                }
                if (i + j == arr.length -1){
                    tongCheoPhu += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận là " +tongCheoChinh);
        System.out.println("Tổng đường chéo phụ của ma trận là " +tongCheoPhu);





























//        int n;  // bậc của ma trận vuông
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào bậc của ma trận: ");
//        n = scanner.nextInt();
//
//        int A[][] = new int[n][n];
//
//        System.out.println("Nhập các phần tử cho ma trận: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("A[" + i + "]["+ j + "] = ");
//                A[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("Ma trận A vừa nhập:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(A[i][j] + "\t");
//            }
//            System.out.println("\n");
//        }
//
//        // các phần tử nằm trên đường chéo chính
//        // là các phần tử có chỉ số dòng = chỉ số cột
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // kiểm tra nếu i == j thì mới tính tổng
//                if (i == j) {
//                    sum += A[i][j];
//                }
//            }
//        }
//
//        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
