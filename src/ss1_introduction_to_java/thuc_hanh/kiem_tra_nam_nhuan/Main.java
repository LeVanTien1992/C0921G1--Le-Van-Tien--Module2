package ss1_introduction_to_java.thuc_hanh.kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
//        boolean isLeapYear = false;
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }
//            }else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.println(year+ " is a leap year");
//        }else {
//            System.out.println(year+ " is NOT a leap year");
//        }

        if(year % 4 == 0){
            if(year % 100 == 0) {
                if (year % 100 == 0){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            }else {
                System.out.printf("%d is a leap year", year);
            }
        }else {
            System.out.printf("%d is NOT a year", year);
        }
    }
}
