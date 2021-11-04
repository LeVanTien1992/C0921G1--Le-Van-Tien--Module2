package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height = 1;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * Math.pow(getRadius(), 2)* height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height of" +getHeight()+ ",  which is a subclass of" +super.toString();

    }
}
