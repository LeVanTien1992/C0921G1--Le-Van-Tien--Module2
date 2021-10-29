package ss2_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        // khai báo biến số nguyên number và nhập cho number giá trị từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        // kiểm tra sô vừa nhập có phải là số nguyên tố hay không
        if(number < 2){
            System.out.println(number+ " is not a prime");
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
