package ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Tiger tiger =new Tiger();
        Orange orange = new Orange();
        Apple apple = new Apple();
        System.out.println(chicken.makeSound()+"\n"+chicken.howToEat());
        System.out.println(tiger.makeSound()+"\n"+chicken.howToEat());
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());

    }
}
