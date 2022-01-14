package ss22_behavior_design_pattern.bai_tap;

public class Test {
    public static void main(String[] args) {
        int[] x = {5, 6, 7, 8};

        for(int a : x){

            if(a % 2 == 0){

                break;

            }

            System.out.print(a);

        }
    }
}
