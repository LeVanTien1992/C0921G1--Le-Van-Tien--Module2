package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder   cylinder = new Cylinder(3,6, "ok");
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());

        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.toString());

    }
}
