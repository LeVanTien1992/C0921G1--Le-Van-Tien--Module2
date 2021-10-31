package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        // khai báo biến kích thước và kiểm tra biến kích thước đó
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Bạn đã nhập sai độ dài; Vui lòng nhập lại!");
            }
        }while (size > 20);
        // Nhập các phần tự của mảng
        arr = new  int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Nhập vào phần tử thứ " +(i+1)+ ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        // in ra các phần tử của mảng
        System.out.println("Mảng gồm các phần tử: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        // tìm giá trị lớn nhất
        int max = arr[0];
        int viTri = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max){
                max = arr[j];
                viTri = j + 1;
            }
        }
        System.out.println("\nGiá trị lớn nhất trong mảng là " +max+ " tại vị trí thứ " +viTri);


























//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a size: ");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size should not exceed 20");
//        } while (size > 20);
//
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element" + (i + 1) + " : ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//
//        System.out.print("Property list: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//
//        int max = array[0];
//        int index = 1;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] > max) {
//                max = array[j];
//                index = j + 1;
//            }
//        }
//        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);
    }
}
