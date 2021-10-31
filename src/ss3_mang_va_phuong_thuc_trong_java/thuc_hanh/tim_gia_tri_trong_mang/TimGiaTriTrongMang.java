package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        // khai báo mảng chứa danh sách tên các sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        // khai báo biến lưu tên tìm kiesm và gán với giá trị nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm trong danh sách: ");
        String input_name = sc.nextLine();
        // duyệt mảng sinh viên đã khai báo và tìm phần tử đã nhâp vào
        boolean tonTai = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("Vị trí tên " +input_name+ " trong danh sách là " +i);
                tonTai = true;
                break;
            }
        }
        if(!tonTai){
            System.out.println("Không tìm được " +input_name+ " trong danh sách mảng!");
        }




















//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a name’s student:");
//        String input_name = scanner.nextLine();
//
//        boolean isExist = false;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(input_name)) {
//                System.out.println("Position of the students in the list " + input_name + " is: " + i);
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Not found" + input_name + " in the list.");
//        }
    }
}
