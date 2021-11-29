package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIpml implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();

    public static final String path = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\employee.csv";
    {
        employeeList = covertStringToEmployee();
    }
    @Override
    public void add() {
        List<String> stringList = new ArrayList<>();
        Employee employee4 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên");
        employee4.setMaSo(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập họ tên");
        employee4.setHoTen(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        employee4.setNgaySinh(sc.nextLine());
        System.out.println("Nhập vào giới tính");
        employee4.setGioiTinh(sc.nextLine());
        System.out.println("Nhập vào số CMND");
        employee4.setSoCMND(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào số điện thoại");
        employee4.setSoDienThoai(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào email");
        employee4.setEmail(sc.nextLine());
        System.out.println("Nhập vào lương");
        employee4.setLuong(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập vào trình độ");
        System.out.println("1.Trung Cấp, 2.Cao Đẳng, 3.Đại Học, 4.Sau dại học");
        int choose1 = sc.nextInt();
        switch (choose1){
            case 1:
                employee4.setTrinhDo("Trung Cấp");
                break;
            case 2:
                employee4.setTrinhDo("Cao Đẳng");
                break;
            case 3:
                employee4.setTrinhDo("Đại Học");
                break;
            case 4:
                employee4.setTrinhDo("Sau dại học");
                break;

        }
        System.out.println("Nhập vào vị trí");
        System.out.println("1.Lễ Tân, 2.Phục vụ, 3.Chuyên Viên, 4.Giám Sát, 5.Quản lý, 6.Giám Đốc");
        int choose2 = sc.nextInt();
        switch (choose2){
            case 1:
                employee4.setViTri("Lễ Tân");
                break;
            case 2:
                employee4.setViTri("Phục vụ");
                break;
            case 3:
                employee4.setViTri("Chuyên Viên");
                break;
            case 4:
                employee4.setViTri("Giám Sát");
                break;
            case 5:
                employee4.setViTri("Quản lý");
                break;
            case 6:
                employee4.setViTri("Giám Đốc");
                break;

        }
        employeeList.add(employee4);
        stringList.add(employee4.toString());
        FileUtilsCaseStudy.writeFile(path, stringList, true);
    }

    @Override
    public void edit(int index) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employeeList.size(); i++) {
            if( i == index){
                System.out.println("Nhập vào mã nhân viên");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập họ tên");
                String hoTen = sc.nextLine();
                System.out.println("Nhập ngày sinh");
                String ngaySinh = sc.nextLine();
                System.out.println("Nhập vào giới tính");
                String gioiTinh = sc.nextLine();
                System.out.println("Nhập vào số CMND");
                int soCMND = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào số điện thoại");
                int soDienThoai = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào email");
                String email = sc.nextLine();
                System.out.println("Nhập vào lương");
                double luong = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập vào trình độ");
                System.out.println("1.Trung Cấp, 2.Cao Đẳng, 3.Đại Học, 4.Sau dại học");
                int choose1 = sc.nextInt();
                switch (choose1){
                    case 1:
                        employeeList.get(i).setTrinhDo("Trung Cấp");
                        break;
                    case 2:
                        employeeList.get(i).setTrinhDo("Cao Đẳng");
                        break;
                    case 3:
                        employeeList.get(i).setTrinhDo("Đại Học");
                        break;
                    case 4:
                        employeeList.get(i).setTrinhDo("Sau dại học");
                        break;

                }
                System.out.println("Nhập vào vị trí");
                System.out.println("1.Lễ Tân, 2.Phục vụ, 3.Chuyên Viên, 4.Giám Sát, 5.Quản lý, 6.Giám Đốc");
                int choose2 = sc.nextInt();
                switch (choose2){
                    case 1:
                        employeeList.get(i).setViTri("Lễ Tân");
                        break;
                    case 2:
                        employeeList.get(i).setViTri("Phục vụ");
                        break;
                    case 3:
                        employeeList.get(i).setViTri("Chuyên Viên");
                        break;
                    case 4:
                        employeeList.get(i).setViTri("Giám Sát");
                        break;
                    case 5:
                        employeeList.get(i).setViTri("Quản lý");
                        break;
                    case 6:
                        employeeList.get(i).setViTri("Giám Đốc");
                        break;

                }
                employeeList.get(i).setMaSo(id);
                employeeList.get(i).setHoTen(hoTen);
                employeeList.get(i).setNgaySinh(ngaySinh);
                employeeList.get(i).setGioiTinh(gioiTinh);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLuong(luong);
                employeeList.get(i).setSoDienThoai(soDienThoai);
                employeeList.get(i).setSoCMND(soCMND);
                break;
            }
        }
        List<String> stringList = covertEmployeeToString();
        FileUtilsCaseStudy.writeFile(path, stringList, false);
    }

    @Override
    public void display() {
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
    public List<Employee> covertStringToEmployee() {
        List<String> stringList = FileUtils.readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] arrEmployee;
        for (String line : stringList) {
            arrEmployee = line.split(",");
            employeeList.add(new Employee(Integer.parseInt(arrEmployee[0]), arrEmployee[1], arrEmployee[2],
                    arrEmployee[3], Integer.parseInt(arrEmployee[4]), Integer.parseInt(arrEmployee[5]), arrEmployee[6], arrEmployee[7],
                    arrEmployee[8], Double.parseDouble(arrEmployee[9])));
        }
        return employeeList;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new ArrayList<>();
        for (Employee employee : employeeList) {
            listString.add(employee.toString());
        }
        return listString;
    }

}
