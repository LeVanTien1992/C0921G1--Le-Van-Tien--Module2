package Candidate_Management_system.controller;

import Candidate_Management_system.models.Experience;
import Candidate_Management_system.models.Intern;
import Candidate_Management_system.service.ipml.*;

import java.util.Scanner;

public class MeNu {
    public void meNu(){
        ExperienceIpml experienceIpml = new ExperienceIpml();
        FresherIpml fresherIpml = new FresherIpml();
        InternIpml internipml = new InternIpml();
        Validate validate = new Validate();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        menu:
        while (choose!=5){
            System.out.println("====CANDIDATE MANAGEMENT SYSTEM====");

            System.out.println("1.Experience");

            System.out.println("2.Fresher");

            System.out.println("3.Internship");

            System.out.println("4.Searching");

            System.out.println("5.Exit");
            choose = scanner.nextInt();
            if(choose == 1 || choose == 2 || choose == 3){
                System.out.println("1.Yes "+"\n" +"2.No");
                int nhap = scanner.nextInt();
                if(nhap == 1){
                    checkYN(experienceIpml, fresherIpml,internipml, scanner, choose);
                }else if(nhap == 2){
                    continue menu;
                }
            }else if(choose == 4){
//                Scanner scanner1 = new Scanner(System.in);
                String firstName = null;
               while (true){
                   try {
                       System.out.println("Enter the first name need to find");
                       firstName = validate.validateSearchFirstName();
                       experienceIpml.search(firstName);
                       fresherIpml.search(firstName);
                       internipml.search(firstName);
                       break ;
                   } catch (InputException e) {
                       e.printStackTrace();
                   }
               }
            }
        }
    }
    private void checkYN(ExperienceIpml experienceIpml, FresherIpml fresherIpml,
                         InternIpml internipml, Scanner scanner, int choose){
        switch (choose){
            case 1:
                int choose1 = 0;
                while (choose1!=5){
                    System.out.println("1.Add new Experience");

                    System.out.println("2.Delete Experience");

                    System.out.println("3.Edit Experience");

                    System.out.println("4.Display Experience");

                    System.out.println("5.Exit");
                    choose1 = scanner.nextInt();
                    switch (choose1){
                        case 1:
                            System.out.println("==============");
                            experienceIpml.add();
                            System.out.println("==============");
                            break;
                        case 2:
                            System.out.println("==============");
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("Enter the fist name need to find");
                            String firstName = scanner1.nextLine();
                            if(experienceIpml.check(firstName)){
                                experienceIpml.delete(firstName);
                                break;
                            }
                            System.out.println("==============");
                            break;
                        case 3:
                            System.out.println("==============");
                            System.out.println("Enter the index position need to find");
                            int index = scanner.nextInt();
                            experienceIpml.edit(index);
                            System.out.println("==============");
                            break;
                        case 4:
                            System.out.println("==============");
                            experienceIpml.display();
                            System.out.println("==============");
                            break;
                    }

                }
                break;
            case 2:
                int choose2 = 0;
                while (choose2!=5){
                    System.out.println("1.Add new Fresher");

                    System.out.println("2.Delete Fresher");

                    System.out.println("3.Edit Fresher");

                    System.out.println("4.Display Fresher");

                    System.out.println("5.Exit");
                    choose2 = scanner.nextInt();
                    switch (choose2){
                        case 1:
                            System.out.println("==============");
                            fresherIpml.add();
                            System.out.println("==============");
                            break;
                        case 2:
                            System.out.println("==============");
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("Enter the fist name need to find");
                            String firstName = scanner1.nextLine();
                            if(fresherIpml.check(firstName)){
                                fresherIpml.delete(firstName);
                                break;
                            }
                            System.out.println("==============");
                            break;
                        case 3:
                            System.out.println("==============");
                            System.out.println("Enter the index position need to find");
                            int index = scanner.nextInt();
                            fresherIpml.edit(index);
                            System.out.println("==============");
                            break;
                        case 4:
                            System.out.println("==============");
                            fresherIpml.display();
                            System.out.println("==============");
                            break;
                    }

                }
                break;
            case 3:
                int choose3 = 0;
                while (choose3!=5){
                    System.out.println("1.Add new Internship");

                    System.out.println("2.Delete Internship");

                    System.out.println("3.Edit Internship");

                    System.out.println("4.Display Internship");

                    System.out.println("5.Exit");
                    choose3 = scanner.nextInt();
                    switch (choose3){
                        case 1:
                            System.out.println("==============");
                            internipml.add();
                            System.out.println("==============");
                            break;
                        case 2:
                            System.out.println("==============");
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("Enter the fist name need to find");
                            String firstName = scanner1.nextLine();
                            if(internipml.check(firstName)){
                                internipml.delete(firstName);
                                break;
                            }
                            System.out.println("==============");
                            break;
                        case 3:
                            System.out.println("==============");
                            System.out.println("Enter the index position need to find");
                            int index = scanner.nextInt();
                            internipml.edit(index);
                            System.out.println("==============");
                            break;
                        case 4:
                            System.out.println("==============");
                            internipml.display();
                            System.out.println("==============");
                            break;
                    }
                }
                break;
        }
    }
}
