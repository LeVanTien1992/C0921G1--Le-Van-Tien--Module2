package Candidate_Management_system.service.ipml;

import Candidate_Management_system.common.FileUtils;
import Candidate_Management_system.models.Candidate;
import Candidate_Management_system.models.Experience;
import Candidate_Management_system.models.Intern;
import Candidate_Management_system.service.CandidateManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternIpml implements CandidateManagementSystem {

    static List<Intern> internList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\Candidate_Management_system\\data\\intern.csv";

    {
        internList = covertStringToIntern();
    }
    @Override
    public void add() {
        List<String> stringList = new ArrayList<>();
        Intern intern4 = new Intern();
        System.out.println("Add new id");
        intern4.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new first name");
        intern4.setFirstName(scanner.nextLine());
        System.out.println("Add new last name");
        intern4.setLastName(scanner.nextLine());
//        System.out.println("Add new birth date");
        intern4.setBirthDate(validate.validateBirthDate());
        System.out.println("Add new address");
        intern4.setAddress(scanner.nextLine());
//        System.out.println("Add new phone");
        intern4.setPhone(validate.validatePhone());
//        System.out.println("Add new email");
        intern4.setEmail(validate.validateEmail());
        System.out.println("Add new type");
        intern4.setType(scanner.nextLine());
        System.out.println("Add new the majors");
        intern4.setMajors(scanner.nextLine());
        System.out.println("Add new semester");
        intern4.setSemester(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new unniversity name");
        intern4.setUniversityName(scanner.nextLine());
        internList.add(intern4);
        stringList.add(intern4.toString());
        FileUtils.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < internList.size(); i++) {
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
                System.out.println("Edit the majors");
                String majors = scanner.nextLine();
                System.out.println("Edit the semester");
                int semester = Integer.parseInt(scanner.nextLine());
                System.out.println("Edit the universirty name");
                String unniversityName = scanner.nextLine();

                internList.get(i).setId(id);
                internList.get(i).setFirstName(firstName);
                internList.get(i).setLastName(lastName);
                internList.get(i).setBirthDate(birthDate);
                internList.get(i).setAddress(address);
                internList.get(i).setPhone(phone);
                internList.get(i).setEmail(email);
                internList.get(i).setType(type);
                internList.get(i).setMajors(majors);
                internList.get(i).setSemester(semester);
                internList.get(i).setUniversityName(unniversityName);
                break;
            }
        }
        List<String> stringList = covertInternToString();
        FileUtils.writeFile(path, stringList, false);
    }

    @Override
    public void delete(String firstName) {
        for (int i = 0; i < internList.size(); i++) {
            if(firstName.equals(internList.get(i).getFirstName())){
                internList.remove(internList.get(i));
            }
        }
        List<String> stringList = covertInternToString();
        FileUtils.writeFile(path, stringList, false);
    }
    public boolean check(String firstName){
        for (Intern intern:internList) {
            if(firstName.equals(intern.getFirstName())){
                return true;
            }
        }
        return false;
    }


    @Override
    public void display() {
        for (Intern intern:internList) {
            System.out.println(intern);
        }
    }
    public List<Intern> covertStringToIntern() {
        List<String> stringList = FileUtils.readFile(path);
        List<Intern> internList = new ArrayList<>();
        String[] arrIntern;
        for (String line : stringList) {
            arrIntern = line.split(",");
            internList.add(new Intern(Integer.parseInt(arrIntern[0]), arrIntern[1], arrIntern[2],
                    arrIntern[3], arrIntern[4], arrIntern[5], arrIntern[6], arrIntern[7],
                    arrIntern[8], Integer.parseInt(arrIntern[9]), arrIntern[10]));
        }
        return internList;
    }

    public List<String> covertInternToString() {
        List<String> listString = new ArrayList<>();
        for (Intern intern : internList) {
            listString.add(intern.toString());
        }
        return listString;
    }

    @Override
    public void search(String firstName){
        for (int i = 0; i < internList.size(); i++) {
            if(internList.get(i).getFirstName().contains(firstName)){
                System.out.println(internList.get(i));
            }
        }
    }
}
