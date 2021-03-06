package case_study.controller;

import case_study.service.Service;
import case_study.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    Service employeeServiceIpml = new EmployeeServiceIpml();
    Service customerServiceIpml = new CustomerServiceIpml();
    FacilityServiceIpml facilityServiceIpml = new FacilityServiceIpml();
    PromotionServiceIpml promotionServiceIpml = new PromotionServiceIpml();
    BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();
    ContractServiceIpml contactServiceIpml = new ContractServiceIpml();
    public void displayMainMenu(){
        int choose = 0;
        while (choose != 6) {
            try{
                System.out.println("1.Employee Management");

                System.out.println("2.Customer Management");

                System.out.println("3.Facility Management ");

                System.out.println("4.Booking Management");

                System.out.println("5.Promotion Management");

                System.out.println("6.Exit");
                choose =  Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        while (choose !=4){
                            try{
                                System.out.println("=========================");
                                System.out.println("1.Display list employees");
                                System.out.println("2.Add new employee");
                                System.out.println("3.Edit employee");
                                System.out.println("4.Return main menu");
                                System.out.println("=========================");
                                choose = Integer.parseInt(sc.nextLine());

                                switch (choose){
                                    case 1:
                                        System.out.println("=========================");
                                        employeeServiceIpml.display();
                                        System.out.println("=========================");
                                        break;
                                    case 2:
                                        System.out.println("=========================");
                                        employeeServiceIpml.add();
                                        System.out.println("=========================");
                                        break;
                                    case 3:
                                        System.out.println("=========================");
                                        Scanner scanner = new Scanner(System.in);
                                        System.out.println("Enter the position need to edit: ");
                                        int index = scanner.nextInt();
                                        employeeServiceIpml.edit(index);
                                        System.out.println("=========================");
                                        break;
                                    case 4:
                                        System.out.println("=========================");
                                        System.out.println("4.Return main menu");
                                        System.out.println("=========================");
                                        break;
                                    default:
                                        System.err.println("Vui l??ng nh???p s??? 1-4. Thanks!");
                                        break;
                                }
                            }catch (NumberFormatException numberFormatException){
                                System.err.println("Vui l??ng kh??ng nh???p ch??? nha! Nh???p s??? t??? 1- 4. Thanks!");
                            }
                        }
                        break;
                    case 2:
                        while (choose !=4){
                            try {
                                System.out.println("=========================");
                                System.out.println("1.Display list customers");
                                System.out.println("2.Add new customers");
                                System.out.println("3.Edit customers");
                                System.out.println("4.Return main menu");
                                System.out.println("=========================");
                                choose = Integer.parseInt(sc.nextLine());

                                switch (choose){
                                    case 1:
                                        System.out.println("=========================");
                                        customerServiceIpml.display();
                                        System.out.println("=========================");
                                        break;
                                    case 2:
                                        System.out.println("=========================");
                                        customerServiceIpml.add();
                                        System.out.println("=========================");
                                        break;
                                    case 3:
                                        System.out.println("=========================");
                                        Scanner scanner = new Scanner(System.in);
                                        System.out.println("Enter the position need to edit: ");
                                        int index = scanner.nextInt();
                                        customerServiceIpml.edit(index);
                                        System.out.println("=========================");
                                        break;
                                    case 4:
                                        System.out.println("=========================");
                                        System.out.println("4.Return main menu");
                                        System.out.println("=========================");
                                        break;
                                    default:
                                        System.err.println("Vui l??ng nh???p s??? 1-4. Thanks!");
                                        break;
                                }
                            }catch (NumberFormatException numberFormatException){
                                System.err.println("Vui l??ng kh??ng nh???p ch??? nha! Nh???p s??? t??? 1- 4. Thanks!");
                            }
                        }
                        break;
                    case 3:
                        while (choose !=4){
                           try{
                               System.out.println("=========================");
                               System.out.println("1.Display list facility");
                               System.out.println("2.Add new facility");
                               System.out.println("3.Display list facility maintenance");
                               System.out.println("4.Return main menu");
                               System.out.println("=========================");
                               choose = Integer.parseInt(sc.nextLine());

                               switch (choose){
                                   case 1:
                                       System.out.println("=========================");
                                       facilityServiceIpml.display();
                                       System.out.println("=========================");
                                       break;
                                   case 2:
                                       int choose1 = 0;
                                       while (choose1!=4){
                                           try {
                                               System.out.println("1.Add New Villa");
                                               System.out.println("2.Add New House");
                                               System.out.println("3.Add New Room");
                                               System.out.println("4.Exit");
                                               choose1= Integer.parseInt(sc.nextLine());
                                               switch (choose1){
                                                   case 1:
                                                       System.out.println("=========================");
                                                       facilityServiceIpml.addVilla();
                                                       System.out.println("=========================");
                                                       break;
                                                   case 2:
                                                       System.out.println("=========================");
                                                       facilityServiceIpml.addHouse();
                                                       System.out.println("=========================");
                                                       break;
                                                   case 3:
                                                       System.out.println("=========================");
                                                       facilityServiceIpml.addRoom();
                                                       System.out.println("=========================");
                                                       break;
//                                                   case 4:
//                                                       System.exit(0);
//                                                       break;
                                                   default:
                                                       System.out.println("Vui l??ng nh???p s??? 1- 3. Kh??ng nh???p ch??? ha! Thanks");
                                                       break;
                                               }
                                           }catch (NumberFormatException numberFormatException){
                                               System.err.println("Vui l??ng kh??ng nh???p ch??? nha! Nh???p s??? t??? 1-4. Thanks!");
                                           }
                                       }
                                       break;
                                   case 3:
                                       System.out.println("=========================");
                                       facilityServiceIpml.displayFacilityMaintance();
                                       System.out.println("=========================");
                                       break;
                                   case 4:
                                       System.out.println("=========================");
                                       System.out.println("4.Return main menu");
                                       System.out.println("=========================");
                                       break;
                                   default:
                                       System.err.println("Vui l??ng nh???p s??? 1-4. Thanks!");
                                       break;
                               }
                           }catch (NumberFormatException numberFormatException){
                               System.err.println("Vui l??ng kh??ng nh???p ch??? nha! Nh???p s??? t??? 1- 4. Thanks!");
                           }
                        }
                        break;
                    case 4:
                        int choie = 0;
                        while (choie !=6){
                            try {
                                System.out.println("=========================");
                                System.out.println("1.Add new booking");
                                System.out.println("2.Display list booking");
                                System.out.println("3.Create new constracts");
                                System.out.println("4.Display list contracts");
                                System.out.println("5.Edit contracts");
                                System.out.println("6.Return main menu");
                                System.out.println("=========================");
                                choie = Integer.parseInt(sc.nextLine());

                                switch (choie){
                                    case 1:
                                        System.out.println("=========================");
                                        bookingServiceIpml.add();
                                        System.out.println("=========================");
                                        break;
                                    case 2:
                                        System.out.println("=========================");
                                        bookingServiceIpml.display();
                                        System.out.println("=========================");
                                        break;
                                    case 3:
                                        System.out.println("=========================");
                                        contactServiceIpml.add();
                                        System.out.println("=========================");
                                        break;
                                    case 4:
                                        System.out.println("=========================");
                                        contactServiceIpml.display();
                                        System.out.println("=========================");
                                        break;
                                    case 5:
                                        System.out.println("=========================");
                                        System.out.println("Enter the index position need to find ");
                                        int nhap = sc.nextInt();
                                        contactServiceIpml.edit(nhap);
                                        System.out.println("=========================");
                                        break;
                                    case 6:
                                        System.out.println("=========================");
                                        System.out.println("6.Return main menu");
                                        System.out.println("=========================");
                                        break;
                                    default:
                                        System.err.println("Vui l??ng nh???p s??? 1-6. Thanks!");
                                        break;
                                }
                            }catch (NumberFormatException numberFormatException){
                                System.err.println("Vui l??ng nh???p s??? t??? 1- 6. Kh??ng nh???p ch??? nha!  Thanks!");
                            }
                        }
                        break;
                    case 5:
                        while (choose !=3){
                            try {
                                System.out.println("=========================");
                                System.out.println("1.Display list customers use service");
                                System.out.println("2.Display list customers get voucher");
                                System.out.println("3.Return main menu");
                                System.out.println("=========================");
                                choose = Integer.parseInt(sc.nextLine());

                                switch (choose){
                                    case 1:
                                        System.out.println("=========================");
                                        promotionServiceIpml.hienThiDanhSachKhachHang();
                                        System.out.println("=========================");
                                        break;
                                    case 2:
                                        System.out.println("=========================");

                                        System.out.println("=========================");
                                        break;
                                    case 3:
                                        System.out.println("=========================");
                                        System.out.println("3.Return main menu");
                                        System.out.println("=========================");
                                        break;
                                    default:
                                        System.err.println("Vui l??ng nh???p s??? 1-3. Thanks!");
                                        break;
                                }
                            }catch (NumberFormatException numberFormatException){
                                System.err.println("Vui l??ng nh???p s??? t??? 1- 3. Kh??ng nh???p ch??? ha! Thanks!");
                            }
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Vui l??ng nh???p s??? t??? 1- 6! Thanks");
                        break;

                }
            }catch (NumberFormatException numberFormatException){
                System.err.println("Vui l??ng kh??ng nh???p ch??? nha! Nh???p l???i s??? t??? 1 - 6. Thanks!");
            }
        }
    }
}
