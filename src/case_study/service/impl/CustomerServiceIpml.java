package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.CustomerService;

import java.util.*;

public class CustomerServiceIpml implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\custumer.csv";
    {
        customerList = covertStringToCustomer();
    }
    @Override
    public void add() {
        List<String> stringList = new LinkedList<>();
        Customer customer4 = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã khách hàng");
        customer4.setMaSo(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào họ tên");
        customer4.setHoTen(scanner.nextLine());
        System.out.println("Nhập vào ngày sinh");
        customer4.setNgaySinh(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        customer4.setGioiTinh(scanner.nextLine());
        System.out.println("Nhập vào số CMND");
        customer4.setSoCMND(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào sô điện thoại");
        customer4.setSoDienThoai(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào email");
        customer4.setEmail(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ");
        customer4.setDiaChi(scanner.nextLine());
        System.out.println("Nhập vào loại khách hàng: ");
        System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                customer4.setLoaiKhach(".Diamond");
                break;
            case 2:
                customer4.setLoaiKhach("Platinium");
                break;
            case 3:
                customer4.setLoaiKhach("Gold");
                break;
            case 4:
                customer4.setLoaiKhach("Silver");
                break;
            case 5:
                customer4.setLoaiKhach("Member");
                break;
        }
        customerList.add(customer4);
        stringList.add(customer4.toString());
        FileUtilsCaseStudy.writeFile(path, stringList, true);

    }

    @Override
    public void edit(int index) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < customerList.size(); i++) {
            if(i == index){
                System.out.println("Nhập mã khách hàng");
                int maSo = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập Họ tên");
                String hoTen = scanner.nextLine();
                System.out.println("NHập ngày sinh");
                String ngaySinh = scanner.nextLine();
                System.out.println("Nhập vào giới tính");
                String gioiTinh = scanner.nextLine();
                System.out.println("Nhập số CMND");
                int soCMND = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại");
                int soDienThoai = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String diaChi = scanner.nextLine();
                System.out.println("Nhập loại khách hàng: ");
                System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member");
                int choose = scanner.nextInt();
                switch (choose){
                    case 1:
                        customerList.get(i).setLoaiKhach(".Diamond");
                        break;
                    case 2:
                        customerList.get(i).setLoaiKhach(".Platinium");
                        break;
                    case 3:
                        customerList.get(i).setLoaiKhach(".Gold");
                        break;
                    case 4:
                        customerList.get(i).setLoaiKhach(".Silver");
                        break;
                    case 5:
                        customerList.get(i).setLoaiKhach(".Member");
                        break;
                }
                customerList.get(i).setMaSo(maSo);
                customerList.get(i).setHoTen(hoTen);
                customerList.get(i).setNgaySinh(ngaySinh);
                customerList.get(i).setGioiTinh(gioiTinh);
                customerList.get(i).setSoCMND(soCMND);
                customerList.get(i).setSoDienThoai(soDienThoai);
                customerList.get(i).setDiaChi(diaChi);
                customerList.get(i).setEmail(email);
                break;
            }
        }
        List<String> stringList = covertEmployeeToString();
        FileUtilsCaseStudy.writeFile(path, stringList, false);
    }

    @Override
    public void display() {
        for (Customer customer: customerList) {
            System.out.println(customer);
        }
    }
    public List<Customer> covertStringToCustomer() {
        List<String> stringList = FileUtils.readFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            customerList.add(new Customer(Integer.parseInt(arrCustomer[0]), arrCustomer[1], arrCustomer[2],
                    arrCustomer[3], Integer.parseInt(arrCustomer[4]), Integer.parseInt(arrCustomer[5]), arrCustomer[6], arrCustomer[7],
                    arrCustomer[8]));
        }
        return customerList;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new ArrayList<>();
        for (Customer customer : customerList) {
            listString.add(customer.toString());
        }
        return listString;
    }

    Scanner scanner = new Scanner(System.in);
    public int maKhachHang(){
        int choose = scanner.nextInt();
        return customerList.get(choose -1).getMaSo();
    }
    public List<Customer> customers(){
        return customerList;
    }
}
