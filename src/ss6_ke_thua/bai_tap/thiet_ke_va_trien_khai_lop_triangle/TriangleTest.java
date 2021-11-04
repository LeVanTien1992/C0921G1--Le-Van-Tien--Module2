package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(5.0, 6.0, 10.0, "green", true);
        System.out.println(triangle);
    }
}
