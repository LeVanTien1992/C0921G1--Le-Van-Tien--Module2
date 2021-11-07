package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Geometric {
    private double radius;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); //area = pi * r^2 => r = sqrt(area/pi);
    }

    @Override
    public void resize(double percent) {
        double newArea = getArea()*(1+percent/100); //dt moi
        double newRadius = Math.sqrt(newArea/Math.PI);// bán kính mới
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
