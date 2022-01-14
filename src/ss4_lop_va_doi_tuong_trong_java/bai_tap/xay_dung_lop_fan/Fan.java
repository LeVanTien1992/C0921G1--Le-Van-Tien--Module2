package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

import java.util.Objects;

public class Fan {
    public static final int slow = 1, medium = 1, fast = 1;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static int getSlow() {
        return slow;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fan fan = (Fan) o;
        return speed == fan.speed &&
                on == fan.on &&
                Double.compare(fan.radius, radius) == 0 &&
                Objects.equals(color, fan.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, on, radius, color);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    //    public Fan(int speed, boolean on, double radius, String color){
//        this.speed = speed;
//        this.on = on;
//        this.radius = radius;
//        this.color = color;
//    }
//    public int getSpeed(){
//        return speed;
//    }
//    public boolean getOn(){
//        return on;
//    }
//    public double getRadius(){
//        return radius;
//    }
//    public String getColor(){
//        return color;
//    }
//    public void setSpeed(int speed){
//        this.speed = speed;
//    }
//    public void setOn(boolean on){
//        this.on = on;
//    }
//    public void setRadius(double radius){
//        this.radius = radius;
//    }
//    public void setColor(String color){
//        this.color = color;
//    }
//    public Fan(){
//
//    }
//    public String toString(){
//        if(!this.on){
//            return "Fan is off";
//        }
//        return "Speed: " +this.speed+ "\nRadius: " +this.radius+ "\nColor: " +this.color;
//    }

































//    public static final String slow = "SLOW", medium = "MEDIUM", fast = "FAST";
//    private int speed = 1;
//    private boolean on = false;
//    private double radius = 5.0;
//    private String color = "blue";
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public Fan() {
//    }
//
//    public String toString(){
//        if(!on) {
//            return "fan is off";
//        }
//        return "Speed: "+speed+"\nColor: "+color+"\nRadius: "+radius;
//    }
}
