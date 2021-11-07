package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Geometric{
    private double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
