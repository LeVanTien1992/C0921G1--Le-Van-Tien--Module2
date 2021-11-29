package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.BookingService;

import java.util.*;

public class BookingServiceIpml implements BookingService {
    static Set<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    static List<Booking> bookingList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\booking.csv";

    @Override
    public void add() {
        Booking booking4 = new Booking();
        System.out.println("Thêm mới mã booking");
        booking4.setMaBooking(scanner.nextLine());
        System.out.println("Thêm mới ngày bắt đầu");
        booking4.setNgayBatDau(scanner.nextLine());
        System.out.println("Thêm mới ngày kết thúc");
        booking4.setNgayKetThuc(scanner.nextLine());
        System.out.println("Thêm mới mã khách hàng");
        customerServiceIpml.display();
        booking4.setMaKhachHang(customerServiceIpml.maKhachHang());
        System.out.println("Thêm mới tên dịch vụ");
        booking4.setTenDichVu(scanner.nextLine());
        System.out.println("Thêm mới loại dịch vụ");
        booking4.setLoaiDichVu(scanner.nextLine());
        bookingTreeSet.add(booking4);
        display();
    }

    @Override
    public void edit(int index) {

    }


    @Override
    public void display() {
        for (Booking booking:bookingTreeSet) {
            System.out.println(booking);
        }
    }
    public String maBooking() {
        int choose = scanner.nextInt();
        return bookingList.get(choose -1 ).getMaBooking();
    }
//    public List<Booking> covertStringToBooking() {
//        List<String> stringList = FileUtils.readFile(path);
//        Set<Booking> bookingTreeSet = new TreeSet();
//        String[] arrBooking;
//        for (String line : stringList) {
//            arrBooking = line.split(",");
//            String maBooking, String ngayBatDau, String ngayKetThuc, int maKhachHang,
//            String tenDichVu, String loaiDichVu
//            arrBooking.add(new Booking(arrBooking[0], arrBooking[1], arrBooking[2],
//                    Integer.parseInt(arrBooking[3]), arrBooking[4],arrBooking[5]));
//        }
//        return bookingTreeSet;
//    }

    public List<String> covertBookingToString() {
        List<String> listString = new ArrayList<>();
        for (Booking booking : bookingList) {
            listString.add(booking.toString());
        }
        return listString;
    }
}
