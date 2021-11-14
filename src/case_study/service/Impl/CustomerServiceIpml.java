package case_study.service.Impl;

import case_study.models.Customer;
import case_study.service.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceIpml implements CustomerService {
    LinkedList<Customer> customers = new LinkedList<>();
    @Override
    public void add() {
        Customer customer4 = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã khách hàng");
        customer4.setMaSo(scanner.nextLine());
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
        customers.add(customer4);
        for (Customer customer: customers) {
            System.out.println(customer);
        }

    }

    @Override
    public void edit(int index) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < customers.size(); i++) {
            if(i == index){
                System.out.println("Nhập mã khách hàng");
                String maSo = scanner.nextLine();
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
                        customers.get(i).setLoaiKhach(".Diamond");
                        break;
                    case 2:
                        customers.get(i).setLoaiKhach(".Platinium");
                        break;
                    case 3:
                        customers.get(i).setLoaiKhach(".Gold");
                        break;
                    case 4:
                        customers.get(i).setLoaiKhach(".Silver");
                        break;
                    case 5:
                        customers.get(i).setLoaiKhach(".Member");
                        break;
                }
                customers.get(i).setMaSo(maSo);
                customers.get(i).setHoTen(hoTen);
                customers.get(i).setNgaySinh(ngaySinh);
                customers.get(i).setGioiTinh(gioiTinh);
                customers.get(i).setSoCMND(soCMND);
                customers.get(i).setSoDienThoai(soDienThoai);
                customers.get(i).setDiaChi(diaChi);
                customers.get(i).setEmail(email);
                break;
            }
        }
    }

    @Override
    public void display() {
        Customer customer1 = new Customer("222", "TonyBaggio", "1/1/2002", "Nam", 11111111, 999999999,
                "vantienam@yahoo.com", "VIP", "12 Phạm Văn Nghị");
        Customer customer2 = new Customer("222", "TonyBaggio", "1/1/2002", "Nam", 11111111, 999999999,
                "vantienam@yahoo.com", "VIP", "12 Phạm Văn Nghị");
        Customer customer3 = new Customer("222", "TonyBaggio", "1/1/2002", "Nam", 11111111, 999999999,
                "vantienam@yahoo.com", "VIP", "12 Phạm Văn Nghị");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
}
