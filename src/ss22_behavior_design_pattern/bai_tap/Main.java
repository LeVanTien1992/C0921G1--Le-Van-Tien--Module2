package ss22_behavior_design_pattern.bai_tap;

public class Main {
    public static void main(String[] args) {
        String x = "vantienam@gmail.com";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }
    }
}
