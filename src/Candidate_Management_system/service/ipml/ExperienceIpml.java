package Candidate_Management_system.service.ipml;

import Candidate_Management_system.models.Candidate;
import Candidate_Management_system.models.Experience;
import Candidate_Management_system.service.CandidateManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceIpml implements CandidateManagementSystem {
    static List<Experience> experienceList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void add() {
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
        experience4.setPhone(Integer.parseInt(validate.validatePhone()));
//        System.out.println("Add new email");
       ;
        experience4.setEmail(validate.validateEmail());
        System.out.println("Add new type");
        experience4.setType(scanner.nextLine());
//        System.out.println("Add new year of experience");

        experience4.setYearOfExperience(Integer.parseInt(validate.validateYearOfExperience()));
        System.out.println("Add new professional skills");
        experience4.setProfessionalSkill(scanner.nextLine());
        experienceList.add(experience4);
       display();
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
                int phone = Integer.parseInt(validate.validatePhone());
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
        display();
    }

    @Override
    public void delete(String firstName) {
        for (int i = 0; i < experienceList.size(); i++) {
            if(firstName.equals(experienceList.get(i).getFirstName())){
                experienceList.remove(experienceList.get(i));
            }
        }
    }
    public boolean check(String firstName){
        for (Experience experience:experienceList) {
            if(firstName.equals(experience.getFirstName())){
                return true;
            }
        }
        return false;
    }

    static {
        experienceList.add(new Experience(001, "Donal", "Trump","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Excellent", 4, "Developer"));
        experienceList.add(new Experience(001, "Donal", "Trump","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Excellent", 4, "Developer"));
        experienceList.add(new Experience(002, "Tony", "Teo","11/1/2020", "1 Houston", 9898989, "code@gmail.com","Good", 4, "Developer"));
        experienceList.add(new Experience(003, "Elon", "Mark","11/1/2020", "1 California", 9898989, "code@gmail.com","Excellent", 4, "Developer"));
    }
    @Override
    public void display() {
        for (Candidate experience:experienceList) {
            System.out.println(experience);
        }
    }

    @Override
    public void search(String firstName) {
        for (int i = 0; i < experienceList.size(); i++) {
            if(experienceList.get(i).getFirstName().contains(firstName)){
                System.out.println(experienceList.get(i));
            }
        }
    }
}
