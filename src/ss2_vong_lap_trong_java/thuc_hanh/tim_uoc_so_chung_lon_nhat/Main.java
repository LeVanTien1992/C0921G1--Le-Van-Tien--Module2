package ss2_vong_lap_trong_java.thuc_hanh.tim_uoc_so_chung_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai a, b và nhập giá trị cho a, b từ bàn phím
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        // sử dụng hàm abs() để trả về giá trị tuyệt đối(phần dương)của a, b.
        a= Math.abs(a);
        b= Math.abs(b);
        // kiểm tra a, b có bằng 0 hay không
        if(a == 0 || b == 0){
            System.out.println("No greatest common fator");
        }
        // tìm ước chung lớn nhất của a,b
        while (a != b){
            if (a < b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
