package ss18_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TenLop {
   // Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
   //
   //    Không chứa các ký tự đặc biệt
   //
   //    Theo sau ký tự bắt đầu là 4 ký tự số
   //
   //    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
   //
   //    Ví dụ tên lớp hợp lệ: C0318G
   //
   //    Ví dụ tên lớp không hợp lệ: M0318G, P0323A
    public static final String CLASS_NAME = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the class name: ");
            String phone = sc.nextLine();
            Pattern p = Pattern.compile(CLASS_NAME);
            if(p.matcher(phone).matches()){
                System.out.println("Class name is okay");
                break;
            }else {
                System.err.println("Class is name not okay");
            }
        }
    }
}
