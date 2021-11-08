package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume = getPerimeter(radius) * height + 2 * getBaseArea(radius);
        return volume;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
