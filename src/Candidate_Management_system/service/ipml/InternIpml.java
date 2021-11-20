package Candidate_Management_system.service.ipml;

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
    @Override
    public void add() {
        Intern intern4 = new Intern();
        System.out.println("Add new id");
        intern4.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new first name");
        intern4.setFirstName(scanner.nextLine());
        System.out.println("Add new last name");
        intern4.setLastName(scanner.nextLine());
        System.out.println("Add new birth date");
        intern4.setBirthDate(scanner.nextLine());
        System.out.println("Add new address");
        intern4.setAddress(scanner.nextLine());
        System.out.println("Add new phone");
        intern4.setPhone(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new email");
        intern4.setEmail(scanner.nextLine());
        System.out.println("Add new type");
        intern4.setType(scanner.nextLine());
        System.out.println("Add new the majors");
        intern4.setMajors(scanner.nextLine());
        System.out.println("Add new semester");
        intern4.setSemester(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add new unniversity name");
        intern4.setUniversityName(scanner.nextLine());
        internList.add(intern4);
        for (Intern intern:internList) {
            System.out.println(intern);
        }
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
                System.out.println("Edit the birth date");
                String birthDate = scanner.nextLine();
                System.out.println("Edit the address");
                String address = scanner.nextLine();
                System.out.println("Edit the phone");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Edit the email");
                String email = scanner.nextLine();
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
        for (Intern intern:internList) {
            System.out.println(intern);
        }
    }

    @Override
    public void delete(String firstName) {
        for (int i = 0; i < internList.size(); i++) {
            if(firstName.equals(internList.get(i).getFirstName())){
                internList.remove(internList.get(i));
            }
        }
    }
    public boolean check(String firstName){
        for (Intern intern:internList) {
            if(firstName.equals(intern.getFirstName())){
                return true;
            }
        }
        return false;
    }

    static {
        internList.add(new Intern(001, "Waynee", "Rooney","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Exelent", "Accouting", 2, "Stanford"));
        internList.add(new Intern(001, "Waynee", "Rooney","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Exelent", "Accouting", 2, "Stanford"));
        internList.add(new Intern(001, "Cristiano", "Ronaldo","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Exelent", "Accouting", 2, "Stanford"));
        internList.add(new Intern(001, "Leo", "Messi","11/1/2020", "1 NewYork", 9898989, "code@gmail.com","Exelent", "Accouting", 2, "Stanford"));
    }
    @Override
    public void display() {
        for (Intern intern:internList) {
            System.out.println(intern);
        }
    }

    @Override
    public void search(String firstName) {
        for (int i = 0; i < internList.size(); i++) {
            if(internList.get(i).getFirstName().contains(firstName)){
                System.out.println(internList.get(i));
            }
        }
    }
}
