package ss1_introduction_to_java.thuc_hanh.giai_pt_bac1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double answer = (c - b) / a;
            System.out.println("Equation pass is width x = %f!\n" +answer);
        }else {
            if (b==c){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }

    }
}
