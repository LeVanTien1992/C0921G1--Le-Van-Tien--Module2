package Candidate_Management_system.service.ipml;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner sc = new Scanner(System.in);

    public String validateBirthDate(){
        while (true){
            System.out.println("Enter the Birth of Date");
            String birthOfDate = sc.nextLine();
            Pattern p = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
            if(p.matcher(birthOfDate).matches()){
                return birthOfDate;
            }else {
                System.err.println("Birth of Date is not okay");
            }
        }
    }
    public String validatePhone(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the phone");
            String phone = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10,}$");//^\d{10,}(?:,\d{10,})*$
            if(p.matcher(phone).matches()){
                return phone;
            }else {
                System.err.println("Phone is not okay");
            }
        }

    }
    public String validateEmail(){
        while (true){
            System.out.println("Enter the email");
            String email = sc.nextLine();
            Pattern p = Pattern.compile("^\\w+@\\w+(\\.\\w+){1,2}$");
            if(p.matcher(email).matches()){
                return email;
            }else {
                System.err.println("Emmail is not okay");
            }
        }

    }
    public String validateYearOfExperience(){
        while (true){
            System.out.println("Enter the year of experience");
            String yearOfExperience = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]$|^[1-9][0-9]$|^(100)$");
            if(p.matcher(yearOfExperience).matches()){
                return yearOfExperience;
            }else {
                System.err.println("Year of experience is not okay");
            }
        }
    }
    public String validateRankOfGraduation(){
        while (true){
            System.out.println("Enter the rank of graduation");
            String rankOfGraduation = sc.nextLine();
            Pattern p1 = Pattern.compile("^[a-zA-Z]+$");
//            Pattern p2 = Pattern.compile("^[a-zA-Z]+$");
//            Pattern p3 = Pattern.compile("^[a-zA-Z]+$");
//            Pattern p4 = Pattern.compile("^[a-zA-Z]+$");
            if(p1.matcher(rankOfGraduation).matches()){
                return rankOfGraduation;
            }else {
                System.err.println("Rank of graduation is not okay");
            }
        }
    }
    public String validateSearchFirstName() throws InputException{
        Scanner scanner = new Scanner(System.in);
        String nhap = scanner.nextLine();
        Pattern p1 = Pattern.compile("^[a-zA-Z]+$");
        if(p1.matcher(nhap).matches()){
            return nhap;
        }else {
            throw new InputException("Wrong first name");
        }

    }

}
