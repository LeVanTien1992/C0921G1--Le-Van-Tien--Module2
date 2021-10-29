package ss1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số: ");
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
//        if (number == 0){
//            System.out.println("Zero");
//        }else if (number == 1){
//            System.out.println("One");
//        }else if (number == 2){
//            System.out.println("Three");
//        }else if (number == 3){
//            System.out.println("Three");
//        }else if (number == 4){
//            System.out.println("Four");
//        }else if (number == 5){
//            System.out.println("Five");
//        }
        if (number >= 0 && number < 10){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("You enter wrong number!");
            }
        }
        if(number < 20 && number >= 10){
            switch (number){
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fiveteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eightteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                default:
                    System.out.println("Out of ability!");
            }
        }
        if(number >= 20 && number < 100){
            String str1 = "";
            String str2 = "";
            }
        }
    }
