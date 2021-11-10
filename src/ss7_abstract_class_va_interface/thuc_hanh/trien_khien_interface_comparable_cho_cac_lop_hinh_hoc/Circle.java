package ss7_abstract_class_va_interface.thuc_hanh.trien_khien_interface_comparable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape{
    private double radius = 1;
    private String color = "blue";
    private boolean filled = true;

    public Circle(){

    }

    public Circle(String color, boolean filled, double radius, String color1, boolean filled1) {
        super(color, filled);
        this.radius = radius;
        this.color = color1;
        this.filled = filled1;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
