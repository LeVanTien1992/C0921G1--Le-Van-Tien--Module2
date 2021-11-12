package ss11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stackSoDu = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int x = scanner.nextInt();
        while (x > 0){
            int soDu = x%2;
            System.out.println(soDu);
            stackSoDu.push(soDu+"");
            x = x/2;
        }

        int n = stackSoDu.size();
        System.out.print("Số nhị phân là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
