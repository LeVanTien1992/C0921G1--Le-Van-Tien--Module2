package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Employee;
import case_study.service.ContactService;

import java.util.*;

public class ContractServiceIpml implements ContactService {
    BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();
    Queue<Contract> contactQueue = new LinkedList<>();
    Queue<Booking> bookingQueue = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();

    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\contract.csv";
    {
        contactQueue = covertStringToContract();
    }
    @Override
    public void add() {
        bookingQueue.addAll(bookingServiceIpml.bookings());
        Booking booking = bookingQueue.poll();
        Contract contract1 = new Contract();
        System.out.println(booking);
        contract1.setMaBooking(booking.getMaBooking());
        contract1.setMaKhachHang(booking.getMaKhachHang());
        System.out.println("Nhập mã hợp đồng");
        contract1.setSoHopDong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số tiền cọc trước");
        contract1.setSoTienCocTruoc(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số tiền thanh toán");
        contract1.setTongSoTienThanhToan(Integer.parseInt(scanner.nextLine()));

        bookingQueue.add(booking);
        List<String> stringList = new LinkedList<>();
        stringList.add(contract1.toString());
        FileUtilsCaseStudy.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
    for (Contract contract : contactQueue){
            if(contract.getMaKhachHang() == index){
                System.out.println("Nhập số mã hợp đồng");
                contract.setSoHopDong(scanner.nextInt());
                System.out.println("Nhập số tiền cọc trước");
                contract.setSoTienCocTruoc(scanner.nextDouble());
                System.out.println("Nhập số tiền thanh toán");
                contract.setTongSoTienThanhToan(scanner.nextDouble());
                contactQueue.add(contract);
                List<String> stringList = covertContractToString();
                FileUtilsCaseStudy.writeFile(path, stringList, false);
            }
        }

    }

    @Override
    public void display() {
        for (Contract contact:contactQueue) {
            System.out.println(contact);
        }
    }
    public Queue<Contract> covertStringToContract() {
        List<String> stringList = FileUtils.readFile(path);
        Queue<Contract> contactQueue = new LinkedList<>();
        String[] arrContract;
        for (String line : stringList) {
            arrContract = line.split(",");
            contactQueue.add(new Contract(Integer.parseInt(arrContract[0]), arrContract[1], Double.parseDouble(arrContract[2]),
                    Double.parseDouble(arrContract[3]), Integer.parseInt(arrContract[4])));
        }
        return contactQueue;
    }

    public List<String> covertContractToString() {
        List<String> listString = new LinkedList<>();
        for (Contract contract : contactQueue) {
            listString.add(contract.toString());
        }
        return listString;
    }


}
