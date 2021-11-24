package ss18_string_regex.bai_tap.validate_so_dien_thoai;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateSoDienThoai {
    //Không chứa các ký tự đặc biệt
    //
    //Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
    //
    //Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
    public static final String PHONE_NUMBER = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the phone: ");
            String phone = sc.nextLine();
            Pattern p = Pattern.compile(PHONE_NUMBER);//^\\d{10,}(?:,\\d{10,})*$
            if(p.matcher(phone).matches()){
                System.out.println("Phone is okay");
                break;
            }else {
                System.err.println("Phone is not okay");
            }
        }
    }
}
