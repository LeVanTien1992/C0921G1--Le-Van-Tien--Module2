package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(10, true, 3, "green");
        Fan fan2 = new Fan(20, false, 15, "red");
//
//        fan1.setSpeed(10);
//        fan1.setOn(true);
//        fan1.setRadius(3);
//        fan1.setColor("green");
//
//        fan2.setSpeed(20);
//        fan2.setOn(false);
//        fan2.setRadius(15);
//        fan2.setColor("red");

        System.out.println("Fan1: ");
        System.out.println(fan1.toString());
        System.out.println();
        System.out.println("Fan2: ");
        System.out.println(fan2.toString());

        System.out.println("So sánh fan1 và fan2: " +fan1.equals(fan2));
        System.out.println("Hashcode fan1: " +fan1.hashCode());
        System.out.println("Hashcode fan2: " +fan2.hashCode());



























//        Fan fan1 = new Fan();
//        Fan fan2 = new Fan();
//
//        fan1.setOn(true);
//        fan1.setSpeed(3);
//        fan1.setColor("yellow");
//        fan1.setRadius(10);
//
//        fan2.setOn(true);
//        fan2.setSpeed(2);
//        fan2.setColor("blue");
//        fan2.setRadius(5);
//
//        System.out.println("Fan 1: ");
//        System.out.println(fan1.toString());
//        System.out.println("");
//        System.out.println("Fan 2: ");
//        System.out.println(fan2.toString());
    }
}
