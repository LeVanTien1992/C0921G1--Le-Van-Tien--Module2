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
        tony.giaiPT();
    }
}
