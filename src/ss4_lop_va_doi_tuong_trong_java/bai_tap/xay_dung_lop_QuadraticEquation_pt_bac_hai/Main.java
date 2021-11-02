package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_QuadraticEquation_pt_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        QuadraticEquation tony = new QuadraticEquation(a, b, c);
        if (tony.getDiscriminant() < 0) {
            System.out.println("The equation has no roots!");
        } else if (tony.getDiscriminant() == 0) {
            System.out.println("The equation has one roots =" + tony.getRoot0());
        } else {
            System.out.println("Delta =" + tony.getDiscriminant());
            System.out.println("Root1 =" + tony.getRoot1());
            System.out.println("Root2 =" + tony.getRoot2());
        }
    }
}
