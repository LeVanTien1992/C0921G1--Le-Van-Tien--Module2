package Candidate_Management_system.service.ipml;

import Candidate_Management_system.common.FileUtils;
import Candidate_Management_system.models.Fresher;
import Candidate_Management_system.service.CandidateManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherIpml implements CandidateManagementSystem {
    static List<Fresher> fresherList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\Candidate_Management_system\\data\\fresher.csv";

    {
        fresherList = covertStringToFresher();
    }
    @Override
    public void add() {
        List<String> stringList = new ArrayList<>();
        Fresher fresher4 = new  Fresher();
        System.out.println("Add new id");
        fresher4.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new first name");
        fresher4.setFirstName(scanner.nextLine());
        System.out.println("Add new last name");
        fresher4.setLastName(scanner.nextLine());
//        System.out.println("Add new birth date");
        fresher4.setBirthDate(validate.validateBirthDate());
        System.out.println("Add new address");
        fresher4.setAddress(scanner.nextLine());
//        System.out.println("Add new phone");
        fresher4.setPhone(validate.validatePhone());
//        System.out.println("Add new email");
        fresher4.setEmail(validate.validateEmail());
        System.out.println("Add new type");
        fresher4.setType(scanner.nextLine());
        System.out.println("Add new the graduated time");
        fresher4.setGraduatedTime(Integer.parseInt(scanner.nextLine()));
//        System.out.println("Add new rank of education");
        fresher4.setRankOfEducation(validate.validateRankOfGraduation());
        System.out.println("Add new graduated university");
        fresher4.setGraduatedUniversity(scanner.nextLine());
        fresherList.add(fresher4);
        stringList.add(fresher4.toString());
        FileUtils.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < fresherList.size(); i++) {
            if(i == index){
                System.out.println("Edit the id");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Edit the first name");
                String firstName = scanner.nextLine();
                System.out.println("Edit the last name");
                String lastName = scanner.nextLine();
//                System.out.println("Edit the birth date");
                String birthDate = validate.validateBirthDate();
                System.out.println("Edit the address");
                String address = scanner.nextLine();
//                System.out.println("Edit the phone");
                String phone = (validate.validatePhone());
//                System.out.println("Edit the email");
                String email = validate.validateEmail();
                System.out.println("Edit the type");
                String type = scanner.nextLine();
                System.out.println("Edit the graduated time");
                int graduateTime = Integer.parseInt(scanner.nextLine());
//                System.out.println("Edit the rank of education");
                String rankOfEducation = validate.validateRankOfGraduation();
                System.out.println("Edit the graduated university");
                String graduatedUniversity = scanner.nextLine();

                fresherList.get(i).setId(id);
                fresherList.get(i).setFirstName(firstName);
                fresherList.get(i).setLastName(lastName);
                fresherList.get(i).setBirthDate(birthDate);
                fresherList.get(i).setAddress(address);
                fresherList.get(i).setPhone(phone);
                fresherList.get(i).setEmail(email);
                fresherList.get(i).setType(type);
                fresherList.get(i).setGraduatedTime(graduateTime);
                fresherList.get(i).setRankOfEducation(rankOfEducation);
                fresherList.get(i).setGraduatedUniversity(graduatedUniversity);
                break;
            }
        }
        List<String> stringList = covertFresherToString();
        FileUtils.writeFile(path, stringList, false);
    }

    @Override
    public void delete(String firstName) {
        for (int i = 0; i < fresherList.size(); i++) {
            if(firstName.equals(fresherList.get(i).getFirstName())){
                fresherList.remove(fresherList.get(i));
            }
        }
        List<String> stringList = covertFresherToString();
        FileUtils.writeFile(path, stringList, false);
    }

    public boolean check(String firstName){
        for (Fresher fresher:fresherList) {
            if(firstName.equals(fresher.getFirstName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        for (Fresher fresher:fresherList) {
            System.out.println(fresher);
        }
    }
    public List<Fresher> covertStringToFresher() {
        List<String> stringList = FileUtils.readFile(path);
        List<Fresher> fresherList = new ArrayList<>();
        String[] arrFresher;
        for (String line : stringList) {
            arrFresher = line.split(",");
            fresherList.add(new Fresher(Integer.parseInt(arrFresher[0]), arrFresher[1], arrFresher[2],
                    arrFresher[3], arrFresher[4], arrFresher[5], arrFresher[6], arrFresher[7],
                    Integer.parseInt(arrFresher[8]), arrFresher[9], arrFresher[10]));
        }
        return fresherList;
    }

    public List<String> covertFresherToString() {
        List<String> listString = new ArrayList<>();
        for (Fresher fresher : fresherList) {
            listString.add(fresher.toString());
        }
        return listString;
    }

    @Override
    public void search(String firstName)  {
        for (int i = 0; i < fresherList.size(); i++) {
            if(fresherList.get(i).getFirstName().equals(firstName)){
                System.out.println(fresherList.get(i));
            }
        }
    }
}
