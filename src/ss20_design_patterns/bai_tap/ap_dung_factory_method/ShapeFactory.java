package ss20_design_patterns.bai_tap.ap_dung_factory_method;

import ss20_design_patterns.thuc_hanh.factory_method.Animal;
import ss20_design_patterns.thuc_hanh.factory_method.Cat;
import ss20_design_patterns.thuc_hanh.factory_method.Dog;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("size".equals(type)) {
            return new Circle();
        } else if ("area".equals(type)){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
