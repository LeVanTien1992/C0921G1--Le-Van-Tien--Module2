package Candidate_Management_system.service.ipml;

import Candidate_Management_system.common.FileUtils;
import Candidate_Management_system.models.Candidate;
import Candidate_Management_system.models.Experience;
import Candidate_Management_system.service.CandidateManagementSystem;
import ss16_io_text_file.bai_tap.doc_ghi_file_csv.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceIpml implements CandidateManagementSystem {
    static List<Experience> experienceList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\Candidate_Management_system\\data\\experience.csv";

    {
        experienceList = covertStringToExperience();
    }
    @Override
    public void add() {
        List<String> stringList = new ArrayList<>();
        Experience experience4 = new  Experience();
        System.out.println("Add new id");
        experience4.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new first name");
        experience4.setFirstName(scanner.nextLine());
        System.out.println("Add new last name");
        experience4.setLastName(scanner.nextLine());
        System.out.println("Add new birth date");
        experience4.setBirthDate(validate.validateBirthDate());
        System.out.println("Add new address");
        experience4.setAddress(scanner.nextLine());
//        System.out.println("Add new phone");
        experience4.setPhone(validate.validatePhone());
//        System.out.println("Add new email");
        experience4.setEmail(validate.validateEmail());
        System.out.println("Add new type");
        experience4.setType(scanner.nextLine());
//        System.out.println("Add new year of experience");
        experience4.setYearOfExperience(Integer.parseInt(validate.validateYearOfExperience()));
        System.out.println("Add new professional skills");
        experience4.setProfessionalSkill(scanner.nextLine());
        experienceList.add(experience4);
        stringList.add(experience4.toString());
        FileUtils.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < experienceList.size(); i++) {
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
                String phone = validate.validatePhone();
//                System.out.println("Edit the email");
                String email = validate.validateEmail();
                System.out.println("Edit the type");
                String type = scanner.nextLine();
//                System.out.println("Edit the year of experience");
                int yearOfExperince = Integer.parseInt(validate.validateYearOfExperience());
                System.out.println("Edit the professional skills");
                String skills = scanner.nextLine();

                experienceList.get(i).setId(id);
                experienceList.get(i).setFirstName(firstName);
                experienceList.get(i).setLastName(lastName);
                experienceList.get(i).setBirthDate(birthDate);
                experienceList.get(i).setAddress(address);
                experienceList.get(i).setPhone(phone);
                experienceList.get(i).setEmail(email);
                experienceList.get(i).setType(type);
                experienceList.get(i).setYearOfExperience(yearOfExperince);
                experienceList.get(i).setProfessionalSkill(skills);
                break;
            }
        }
        List<String> stringList = covertExperienceToString();
        FileUtils.writeFile(path, stringList, false);
    }

    @Override
    public void delete(String firstName) {
        for (int i = 0; i < experienceList.size(); i++) {
            if(firstName.equals(experienceList.get(i).getFirstName())){
                experienceList.remove(experienceList.get(i));
            }
        }
        List<String> stringList = covertExperienceToString();
        FileUtils.writeFile(path, stringList, false);
    }
    public boolean check(String firstName){
        for (Experience experience:experienceList) {
            if(firstName.equals(experience.getFirstName())){
                return true;
            }
        }
        return false;
    }


    @Override
    public void display() {
        for (Experience experience:experienceList) {
            System.out.println(experience);
        }
    }
    public List<Experience> covertStringToExperience() {
        List<String> stringList = FileUtils.readFile(path);
        List<Experience> experienceList = new ArrayList<>();
        String[] arrExperience;
        for (String line : stringList) {
            arrExperience = line.split(",");
            experienceList.add(new Experience(Integer.parseInt(arrExperience[0]), arrExperience[1], arrExperience[2],
                    arrExperience[3], arrExperience[4], arrExperience[5], arrExperience[6], arrExperience[7],
                    Integer.parseInt(arrExperience[8]), arrExperience[9]));
        }
        return experienceList;
    }

    public List<String> covertExperienceToString() {
        List<String> listString = new ArrayList<>();
        for (Experience experience : experienceList) {
            listString.add(experience.toString());
        }
        return listString;
    }



    @Override
    public void search(String firstName) {
        for (int i = 0; i < experienceList.size(); i++) {
            if (experienceList.get(i).getFirstName().contains(firstName)) {
                System.out.println(experienceList.get(i));
            }

        }
//        Experience studentResult = null;
//        for (Experience student : experienceList) {
//            if(firstName.contains(student.getFirstName())){
//                studentResult = student;
//                break;
//            }
//        }
//        if (studentResult == null) {
//            throw new InputException();
//        }
//        return studentResult;
//    }
    }
}
