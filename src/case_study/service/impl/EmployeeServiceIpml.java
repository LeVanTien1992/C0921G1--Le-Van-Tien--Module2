package case_study.service.Impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceIpml implements EmployeeService {
    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void add() {
        Employee employee4 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên");
        employee4.setMaSo(sc.nextLine());
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
        employees.add(employee4);
        for (Employee e: employees) {
            System.out.println(e);
        }
    }

    @Override
    public void edit(int index) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employees.size(); i++) {
            if( i == index){
                System.out.println("Nhập vào mã nhân viên");
                String id = sc.nextLine();
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
                        employees.get(i).setTrinhDo("Trung Cấp");
                        break;
                    case 2:
                        employees.get(i).setTrinhDo("Cao Đẳng");
                        break;
                    case 3:
                        employees.get(i).setTrinhDo("Đại Học");
                        break;
                    case 4:
                        employees.get(i).setTrinhDo("Sau dại học");
                        break;

                }
                System.out.println("Nhập vào vị trí");
                System.out.println("1.Lễ Tân, 2.Phục vụ, 3.Chuyên Viên, 4.Giám Sát, 5.Quản lý, 6.Giám Đốc");
                int choose2 = sc.nextInt();
                switch (choose2){
                    case 1:
                        employees.get(i).setViTri("Lễ Tân");
                        break;
                    case 2:
                        employees.get(i).setViTri("Phục vụ");
                        break;
                    case 3:
                        employees.get(i).setViTri("Chuyên Viên");
                        break;
                    case 4:
                        employees.get(i).setViTri("Giám Sát");
                        break;
                    case 5:
                        employees.get(i).setViTri("Quản lý");
                        break;
                    case 6:
                        employees.get(i).setViTri("Giám Đốc");
                        break;

                }
                employees.get(i).setMaSo(id);
                employees.get(i).setHoTen(hoTen);
                employees.get(i).setNgaySinh(ngaySinh);
                employees.get(i).setGioiTinh(gioiTinh);
                employees.get(i).setEmail(email);
                employees.get(i).setLuong(luong);
                employees.get(i).setSoDienThoai(soDienThoai);
                employees.get(i).setSoCMND(soCMND);
                break;
            }
        }


        for (Employee e: employees) {
            System.out.println(e);
        }
    }

    @Override
    public void display() {
        Employee employee1 = new Employee("111", "Elon Mark", "1/1/1111", "Nam", 111111, 999999, "elon@gmail.com", "Đại học", "CEO", 100000);
        Employee employee2 = new Employee("222", "Elon Mark", "1/1/2222", "Nam", 111111, 999999, "elon@gmail.com", "Cao đẳng", "CEO", 100000);
        Employee employee3 = new Employee("333", "Elon Mark", "1/1/3333", "Nam", 111111, 999999, "elon@gmail.com", "Trung cấp", "CEO", 100000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee e: employees) {
            System.out.println(e);
        }

    }
}
