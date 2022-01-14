package case_study.service.impl;

import case_study.models.Booking;
import case_study.models.Customer;

import java.util.*;

public class PromotionServiceIpml {
    BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();
    CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
    Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    List<Customer> customerSet = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void hienThiDanhSachKhachHang(){
        bookingSet.addAll(bookingServiceIpml.bookings());
        customerSet.addAll(customerServiceIpml.customers());
        System.out.println("Nhập vào năm cần tìm để hiện thị");
        String nam = scanner.nextLine();
        for (Booking booking:bookingSet) {
            for (Customer customer:customerSet) {
                String[] arrNamBatDau = booking.getNgayBatDau().split("/");
                String[] arrNamKetThuc = booking.getNgayKetThuc().split("/");
                if (arrNamBatDau[2].equals(nam) || arrNamKetThuc[2].equals(nam)) {
//                    System.out.println(booking);
                    if(customer.getMaSo() == booking.getMaKhachHang()){
                        System.out.println(customer);
                    }
                }
            }
        }
    }
}
