package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1;
        color = "yellow";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius, 2)* Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius of " + getRadius()+ " and Color " + getColor();
    }
}
