package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_bien;

public class FizzBuzz {

    private static boolean isFizz;
    private static boolean isBuzz;

    public static String fizzBuzz(int number){
        isFizz = number % 3 == 0;
        isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
