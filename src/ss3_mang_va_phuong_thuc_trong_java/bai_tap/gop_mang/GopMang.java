package ss3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lương phần tử: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]= ", i);
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]= ", i);
            arr2[i] = scanner.nextInt();
        }
//        //Cách 1:
//        // khai báo biến length bằng độ dài của 2 mảng arr1 + arr2
//        int length = arr1.length + arr2.length;
//        // khai báo mảng mới rusult để lưu 2 mảng cần nối với độ dài bằng length
//        int[] rusult = new int[length];
//        int pos = 0;
//        // dùng foreach duyệt lưu các phần tử arr1 vào rusult
//        for (int i: arr1) {
//            rusult[pos] = i;
//            pos++;
//        }
//        // dùng foreach duyệt lưu các phần tử arr2 vào rusult
//        for (int i: arr2) {
//            rusult[pos] = i;
//            pos++;
//        }
//        System.out.println(Arrays.toString(rusult));
        // cách 2:
        int aLen = arr1.length;
        int bLen = arr2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(arr1,0,result,0, aLen);
        System.arraycopy(arr2,0,result, aLen,bLen);

        System.out.println(Arrays.toString(result));

    }
}
