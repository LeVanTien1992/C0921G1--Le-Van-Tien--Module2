package ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible;

public class AbstratAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
