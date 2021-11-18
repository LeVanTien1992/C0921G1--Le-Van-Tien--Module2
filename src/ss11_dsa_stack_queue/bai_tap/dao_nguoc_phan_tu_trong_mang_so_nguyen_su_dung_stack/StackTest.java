package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import ss11_dsa_stack_queue.thuc_hanh.trien_khai_stack_su_dung_mang.MyStack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào dãy số nguyên : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println("Dãy số của mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Đảo ngược các phần tử : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}
