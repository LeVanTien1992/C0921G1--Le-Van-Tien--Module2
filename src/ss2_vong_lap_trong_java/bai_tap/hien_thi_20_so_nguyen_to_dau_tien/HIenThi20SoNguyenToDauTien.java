package ss2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class HIenThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while (count < n){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
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
