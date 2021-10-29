package ss2_vong_lap_trong_java.thuc_hanh.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo 3 biến để lưu thông tin về tiền gửi, tháng gửi, tỉ lệ lãi suất
        double money = 1.0d;
        int months = 1;
        double interestRate = 1.0d;
        // khai báo đối tượng input thuộc lớp Scanner để thực hiện nhập dữ liệu cho 3 biến trên
        Scanner input = new Scanner(System.in);
        // Nhập số tiền gửi
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        // Nhập số tháng gửi
        System.out.println("Enter number of month: ");
        months = input.nextInt();
        // Nhập lãi suất
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        // Tính lãi suất
        double totalInterest = 0;
        for (int i= 0; i< months; i++){
            totalInterest = money *(interestRate/100)/12 *months;
        }
        System.out.println("Total of interest " +totalInterest);
    }
}
