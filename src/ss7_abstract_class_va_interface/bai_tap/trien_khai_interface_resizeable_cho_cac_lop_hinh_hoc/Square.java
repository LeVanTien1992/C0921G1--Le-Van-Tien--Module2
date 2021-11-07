package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Geometric {
    private double side;

    Square(){

    }
    public Square(double side) {

        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*Math.sqrt(1+percent/100)); //canh. moi = canh. cu~ * sqrt(1+percent/100);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
