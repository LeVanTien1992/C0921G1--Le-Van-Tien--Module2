package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        TriangleEdgesCheck check = new TriangleEdgesCheck();

        // Nhap du lieu
        try {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ hai: ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: Không đúng định dạng!");
        }

        sc.close();
    }
}
