package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_QuadraticEquation_pt_bac_hai;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(b, 2) - 4*a*c;
    }
    public double getRoot0(){
        return -c/b;
    }
    public double getRoot3(){
        return -b/2*a;
    }

    public double getRoot1(){
      return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public void giaiPT(){
        if (a==0){
            if(b==0){
                if(c==0){
                    System.out.println("The equation has no solution");
                }else {
                    System.out.println("infinitely many solutions");
                }
            }else {
                System.out.println("The equation has one roots =" + getRoot0());
            }
        }else {
            if (getDiscriminant() < 0) {
                System.out.println("The equation has no roots!");
            } else if (getDiscriminant() == 0) {
                System.out.println("The equation has one roots =" + getRoot3());
            } else {
                System.out.println("Delta =" + getDiscriminant());
                System.out.println("Root1 =" + getRoot1());
                System.out.println("Root2 =" + getRoot2());
            }
        }
    }
}
