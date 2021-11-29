package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.Contract;
import case_study.models.Employee;
import case_study.service.ContactService;

import java.util.*;

public class ContractServiceIpml implements ContactService {
    static List<Contract> contractList = new LinkedList<>();
    static Queue<Contract> contactQueue = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
    BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();
    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\contract.csv";
    {
        contractList = covertStringToContract();   
    }

    @Override
    public void add() {
        List<String> stringList = new LinkedList<>();
        Contract contract4 = new Contract();
        System.out.println("Thêm mới số hợp đồng");
        contract4.setSoHopDong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Thêm mới mã booking");
        bookingServiceIpml.display();
        contract4.setMaBooking(bookingServiceIpml.maBooking());
        System.out.println("Thêm mới số tiền cọc trước");
        contract4.setSoTienCocTruoc(Double.parseDouble(scanner.nextLine()));
        System.out.println("Thêm mới tổng số tiền thanh toán");
        contract4.setTongSoTienThanhToan(Double.parseDouble(scanner.nextLine()));
        System.out.println("Thêm mới mã khách hàng");
        customerServiceIpml.display();
        contract4.setMaKhachHang(customerServiceIpml.maKhachHang());
        contactQueue.add(contract4);
        stringList.add(contract4.toString());
        FileUtilsCaseStudy.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < contactQueue.size(); i++) {
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

                contractList.get(i).setSoHopDong(soHopDong);
                contractList.get(i).setMaBooking(maBooking);
                contractList.get(i).setSoTienCocTruoc(soTienCoc);
                contractList.get(i).setTongSoTienThanhToan(tongSoTienThanhToan);
                contractList.get(i).setMaKhachHang(maKhachHang);
                break;
            }
        }
        List<String> stringList = covertContractToString();
        FileUtilsCaseStudy.writeFile(path, stringList, false);
    }

    @Override
    public void display() {
        for (Contract contact:contactQueue) {
            System.out.println(contact);
        }
    }
    public List<Contract> covertStringToContract() {
        List<String> stringList = FileUtils.readFile(path);
        List<Contract> contactQueue = new LinkedList<>();
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
