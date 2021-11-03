package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, "red");
        Circle circle2 = new Circle(5.0, "blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
