package ss2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo biến choie lưu giá trị lựa chọn
        int choie = -1;
        Scanner input = new Scanner(System.in);
        while (choie != 0){
            System.out.println("Menu");
            System.out.println("1.Draw the trangle button left");
            System.out.println("2.Draw the  trangle top left");
            System.out.println("3.Draw the retrangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choie: ");
            choie = input.nextInt();
            switch (choie){
                case 1:
                    System.out.println("Draw the trangle button left");
                    for (int i = 0; i<= 5; i++){
                        for (int j = 0; j< i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the trangle top left");
                    for (int i = 5; i> 0; i--){
                        for (int j = 0; j< i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the retangle");
                    for (int i = 0; i< 3; i++){
                        for (int j = 0; j< 10; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choie!");
            }
        }
    }
}
