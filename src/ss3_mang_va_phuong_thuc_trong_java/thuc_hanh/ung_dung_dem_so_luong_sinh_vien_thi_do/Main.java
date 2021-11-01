package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.ung_dung_dem_so_luong_sinh_vien_thi_do;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("Bạn nhập sai số lượng phần tử; Vui lòng nhập lại!");
                size = scanner.nextInt();
            }
        }while (size > 30);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Điểm sinh viên["+(i+1)+"]= ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("Số lượng sinh viên được thi đỗ là " +count);






















//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 30)
//                System.out.println("Size should not exceed 30");
//        } while (size > 30);
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter a mark for student " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        int count = 0;
//        System.out.print("List of mark: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//            if (array[j] >= 5 && array[j] <= 10)
//                count++;
//        }
//        System.out.print("\n The number of students passing the exam is " + count);
    }
}
