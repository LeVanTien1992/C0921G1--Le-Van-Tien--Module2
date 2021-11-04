package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp vào side1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp vào side1: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp vào side1: ");
        double side3 =Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp vào màu sắc: ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color, true);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}
