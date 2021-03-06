package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return this.side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return this.side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getPerimeter(){
        return  (side1 + side2 + side3);
    }
    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter()-side1)*(getPerimeter()-side2)*(getPerimeter()-side3));
    }
    public String toString(){
        return "Side1= " +side1+ "Side2= " +side2+ "Side2=" +side3+ ", Which is a subclass of" +super.toString();
    }

}
