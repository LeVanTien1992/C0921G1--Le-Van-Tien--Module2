package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Geometric[] c = new Geometric[4];
        c[0] = new Circle(4);
        c[1] = new Rectangle(5,10);
        c[2] = new Square(5);
        c[3] = new Square(5);
        for (Geometric geometric : c) {
            if (c[2].equals(c[3])) {
                System.out.println(geometric.getArea());
            }else{
                geometric.howToColor();
            }
        }
    }
}
