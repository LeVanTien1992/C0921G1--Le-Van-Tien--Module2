package ss2_vong_lap_trong_java.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class HIenThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Các số nguyên tố nhỏ hơn 100: \n" +n);
        for (int i= 0; i< n; i++){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if (n < 2){
            return false;
        }else {
            for (int i = 2; i<= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
