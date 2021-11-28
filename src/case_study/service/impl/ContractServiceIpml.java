package case_study.service.impl;

import case_study.models.Contact;
import case_study.service.ContactService;

import java.util.*;

public class ContactServiceIpml implements ContactService {
    static List<Contact> contactList = new LinkedList<>();
    static Queue<Contact> contactQueue = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
    BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();


    @Override
    public void add() {
        Contact contact4 = new Contact();
        System.out.println("Thêm mới số hợp đồng");
        contact4.setSoHopDong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Thêm mới mã booking");
        bookingServiceIpml.display();
        contact4.setMaBooking(bookingServiceIpml.maBooking());
        System.out.println("Thêm mới số tiền cọc trước");
        contact4.setSoTienCocTruoc(Double.parseDouble(scanner.nextLine()));
        System.out.println("Thêm mới tổng số tiền thanh toán");
        contact4.setTongSoTienThanhToan(Double.parseDouble(scanner.nextLine()));
        System.out.println("Thêm mới mã khách hàng");
        customerServiceIpml.display();
        contact4.setMaKhachHang(customerServiceIpml.maKhachHang());
        contactQueue.add(contact4);
        display();
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < contactList.size(); i++) {
            if(i == index){
                System.out.println("Sửa số hợp đồng");
                int soHopDong = Integer.parseInt(scanner.nextLine());
                System.out.println("Sủa mã booking");
                bookingServiceIpml.display();
                String maBooking = bookingServiceIpml.maBooking();
                System.out.println("Sửa số tiền cọc trước");
                double soTienCoc = Double.parseDouble(scanner.nextLine());
                System.out.println("Sửa tổng số tiền thanh toán");
                double tongSoTienThanhToan = Double.parseDouble(scanner.nextLine());
                System.out.println("Sửa mã khách hàng");
                customerServiceIpml.display();
                int maKhachHang = customerServiceIpml.maKhachHang();

                contactList.get(i).setSoHopDong(soHopDong);
                contactList.get(i).setMaBooking(maBooking);
                contactList.get(i).setSoTienCocTruoc(soTienCoc);
                contactList.get(i).setTongSoTienThanhToan(tongSoTienThanhToan);
                contactList.get(i).setMaKhachHang(maKhachHang);
                break;
            }
        }
        display();
    }
    static {
        contactQueue.add(new Contact(2311, "C0921G1", 500, 3000, 333));
        contactQueue.add(new Contact(5611, "C0821G1", 500, 3000, 333));
        contactQueue.add(new Contact(8711, "C0721G1", 500, 3000, 333));
        contactList.addAll(contactQueue);
    }
    @Override
    public void display() {
        for (Contact contact:contactQueue) {
            System.out.println(contact);
        }
    }


}
