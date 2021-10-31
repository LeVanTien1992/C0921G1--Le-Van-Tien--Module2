package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.chuong_trinh_chuyen_doi_nhiet_do;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Chuyển đổi celcius sang fahrenheit.");
            System.out.println("2.Chuyển đổi fahrenheit sang celcius.");
            System.out.println("0.Exit.");
            System.out.println("Bạn chọn chuyển đổi gì?");
            choice = input.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("Nhập celcius cần chuyển đỏi: ");
                    celsius = input.nextDouble();
                    System.out.println("Celcius sang fahrenheit =" +celsiusToFahrenheit(celsius));
                    break;
                }
                case 2: {
                    System.out.println("Nhập farenheit cần chuyển đổi: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit sang celcius =" + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
