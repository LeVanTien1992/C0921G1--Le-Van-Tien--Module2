package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23.000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập vào số tiền muốn đổi: ");
        usd = scanner.nextDouble();
        double vnd = usd * rate ;
        System.out.println("Giá trị vnd " +vnd);
    }
}
