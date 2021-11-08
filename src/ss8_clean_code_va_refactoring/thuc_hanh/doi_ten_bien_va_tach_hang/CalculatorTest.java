package ss8_clean_code_va_refactoring.thuc_hanh.doi_ten_bien_va_tach_hang;

public class CalculatorTest {
    private static ss8_clean_code_va_refactoring.thuc_hanh.doi_ten_bien_va_tach_hang.Calculator Calculator;

    public static void main(String[] args) {
        System.out.println("5 + 3 = "+Calculator.calculate(5,3,'+'));
        System.out.println("5 - 3 = "+Calculator.calculate(5,3,'-'));
        System.out.println("5 * 3 = "+Calculator.calculate(5,3,'*'));
        System.out.println("5 / 3 = "+Calculator.calculate(5,3,'/'));
    }
}
