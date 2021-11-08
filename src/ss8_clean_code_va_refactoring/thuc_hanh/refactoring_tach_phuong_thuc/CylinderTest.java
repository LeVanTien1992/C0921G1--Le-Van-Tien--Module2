package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_phuong_thuc;

public class CylinderTest {
    public static void main(String[] args) {
        System.out.println("Area of a Circle with radius 5: "+Cylinder.getBaseArea(5));
        System.out.println("Perimeter of a Circle with radius 5: "+Cylinder.getPerimeter(5));
        System.out.println("Volume of a Circle with radius 5 and height 3: "+Cylinder.getVolume(5, 3));
    }
}
