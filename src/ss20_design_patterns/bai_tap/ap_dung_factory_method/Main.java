package ss20_design_patterns.bai_tap.ap_dung_factory_method;

import ss20_design_patterns.thuc_hanh.factory_method.Animal;
import ss20_design_patterns.thuc_hanh.factory_method.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("feline");
        System.out.println("s1 draw: " + s1.draw());

        Shape s2 = shapeFactory.getShape("size");
        System.out.println("a2 draw: " + s2.draw());

        Shape s3 = shapeFactory.getShape("canine");
        System.out.println("a2 draw: " + s3.draw());
    }
}
