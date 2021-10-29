package ss2_vong_lap_trong_java.thuc_hanh.thiet_ke_menu_cho_ung_dung;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        // khai báo biến choie lưu giá trị lựa chọn
        int choie = -1;
        Scanner input = new Scanner(System.in);
        while (choie != 0){
            System.out.println("Menu");
            System.out.println("1.Draw the triangle");
            System.out.println("2.Draw the square");
            System.out.println("3.Draw the retrangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choie: ");
            choie = input.nextInt();
            switch (choie){
                case 1:
                    System.out.println("Draw the trangle");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Draw the retangle");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choie!");
            }
        }
    }
}
