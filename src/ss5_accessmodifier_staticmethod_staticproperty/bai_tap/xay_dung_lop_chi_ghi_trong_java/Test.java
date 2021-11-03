package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.xay_dung_lop_chi_ghi_trong_java;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Tony", "C0921G1");
        // setter là truyền dữ liệu vào
        // getter là lấy dữ liệu ra
        // setter
        student1.setName("TonyBaggio");
        student1.setClasses("C099");

        // getter
        String name = student1.getName();
        String classes = student1.getClasses();
        System.out.println("Name: " +name);
        System.out.println("Classes: " +classes);
    }
}
