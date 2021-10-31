package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.dao_nguoc_cac_phan_tu_cua_mang;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        // khai báo biến size và kiểm tra kích thước
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào độ dài của mảng: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Bạn đã nhập sai độ dài của mảng; Vui lòng nhập lại!");
            }
        }while (size > 20);
        // Nhập giá tri cho các phần tử của mảng
        arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.print("Nhập vào phẩn tử thứ " +(i+1)+ ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        // in ra các phần tử của mảng đã nhập
        System.out.printf("%-20s%s", "Mảng gồm các phần tử: ","");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] +"\t");
        }
        // tiến hành đảo ngược mảng (sử dụng biến trung gian hoán đổi) và in ra kết quả
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size -1 - j];
            arr[size -1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng đổi ngược gồm: ","");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] +"\t");
        }














//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size does not exceed 20");
//        } while (size > 20);
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }
//        System.out.printf("\n%-20s%s", "Reverse array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
    }
}
