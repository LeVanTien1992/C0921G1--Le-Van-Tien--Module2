package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Geometric[] c = new Geometric[4];
        c[0] = new Circle(5);
        c[1] = new Rectangle(3,4);
        c[2] = new Square(6);
        c[3] = new Square(6);
        for (Geometric geometric : c) {

            System.out.println(geometric);
            System.out.println("Before=" +geometric.getArea());
            geometric.resize(10);
            System.out.println("After="+geometric.getArea());
        }

    }
}
