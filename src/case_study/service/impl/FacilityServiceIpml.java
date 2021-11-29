package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.*;
import case_study.service.FacilityService;
import case_study.service.Service;

import java.util.*;

public class FacilityServiceIpml implements FacilityService {
    static Map<Facility, Integer> map = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static List<String> stringList = new ArrayList<>();
    ValidateFacility validateFacility = new ValidateFacility();
    {
        map = covertStringToHouse();
        map = covertStringToRoom();
        map = covertStringToVilla();
    }
//    {
//        map = covertStringToRoom();
//    }
//    {
//        map = covertStringToVilla();
//    }
    public static final String path_house = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\house.csv";
    public static final String path_room = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\room.csv";
    public static final String path_villa = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\case_study\\data\\villa.csv";
    @Override
    public void add(){

    }

    @Override
    public void edit(int index) {

    }


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry:map.entrySet()) {
            System.out.println(entry);
        }
    }


    public Map<Facility, Integer> covertStringToHouse() {
        List<String> stringList = FileUtils.readFile(path_house);
        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrHouse;
        for (String line : stringList) {
            arrHouse = line.split(",");
            linkedHashMap.put((new House(arrHouse[0], arrHouse[1], Double.parseDouble(arrHouse[2]),
                    Double.parseDouble(arrHouse[3]), Integer.parseInt(arrHouse[4]), arrHouse[5], arrHouse[6], Integer.parseInt(arrHouse[7]))), 3);
        }
        return linkedHashMap;
    }
    public Map<Facility, Integer> covertStringToRoom() {
        List<String> stringList = FileUtils.readFile(path_room);
        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrRoom;
        for (String line : stringList) {
            arrRoom = line.split(",");
            linkedHashMap.put((new Room(arrRoom[0], arrRoom[1], Double.parseDouble(arrRoom[2]),
                    Double.parseDouble(arrRoom[3]), Integer.parseInt(arrRoom[4]), arrRoom[5], arrRoom[6])), 3);
        }
        return linkedHashMap;
    }
    public Map<Facility, Integer> covertStringToVilla() {
        List<String> stringList = FileUtils.readFile(path_villa);
        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrVilla;
        for (String line : stringList) {
            arrVilla = line.split(",");
            linkedHashMap.put((new Villa(arrVilla[0], arrVilla[1], Double.parseDouble(arrVilla[2]),
                    Double.parseDouble(arrVilla[3]), Integer.parseInt(arrVilla[4]), arrVilla[5], arrVilla[6],
                    Double.parseDouble(arrVilla[7]), Integer.parseInt(arrVilla[8]))), 3);
        }
        return linkedHashMap;
    }
    public List<String> covertFacilityToString() {
//        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry:map.entrySet()) {
            stringList.add(entry.toString());
        }
        return stringList;
    }

    public void addHouse(){

        House house1 = new House();
        System.out.println("Thêm vào mã dịch vụ");
        house1.setMaDichVu(validateFacility.validateMaDichVuHouse());
        System.out.println("Thêm vào tên dịch vụ");
        house1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Thêm vào diện tích sử dụng");
        house1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Thêm vào chi phí thuê");
        house1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Thêm vào số lượng người tối đa");
        house1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Thêm vào kiểu thuê");
        house1.setKieuThue(validateFacility.validateKieuThue());
        System.out.println("Thêm vào tiêu chuẩn phòng");
        house1.setTieuChuanPhong(validateFacility.validateTieuChuanPhong());
        System.out.println("Thêm vào số tầng");
        house1.setSoTang(validateFacility.validateSoTang());
        map.put(house1,1);
        stringList.add(house1.toString());
        FileUtilsCaseStudy.writeFile(path_house, stringList, true);
    }
    public void addRoom(){
        Room room1 = new Room();
        System.out.println("Thêm vào mã dịch vụ");
        room1.setMaDichVu(validateFacility.validateMaDichVuRoom());
        System.out.println("Thêm vào tên dịch vụ");
        room1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Thêm vào diện tích sử dụng");
        room1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Thêm vào chi phí thuê");
        room1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Thêm vào số lượng người tối đa");
        room1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Thêm vào kiểu thuê");
        room1.setKieuThue(scanner.nextLine());
        System.out.println("Thêm vào dịch vụ miễn phí đi kèm");
        room1.setDichVuMienPhiDiKem(scanner.nextLine());
        map.put(room1,2);
        stringList.add(room1.toString());
        FileUtilsCaseStudy.writeFile(path_room, stringList, true);
    }
    public void addVilla(){
        Villa villa1 = new Villa();
        System.out.println("Thêm vào mã dịch vụ");
        villa1.setMaDichVu(validateFacility.validateMaDichVuVilla());
        System.out.println("Thêm vào tên dịch vụ");
        villa1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Thêm vào diện tích sử dụng");
        villa1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Thêm vào chi phí thuê");
        villa1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Thêm vào số lượng người tối đa");
        villa1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Thêm vào kiểu thuê");
        villa1.setKieuThue(scanner.nextLine());
        System.out.println("Thêm vào tiêu chuẩn phòng");
        villa1.setTieuChuanPhong(scanner.nextLine());
        System.out.println("Thêm vào diện tích hồ bơi");
        villa1.setDienTichHoBoi(validateFacility.validateDienTichHoBoi());
        System.out.println("Thêm vào số tầng");
        villa1.setSoTang(validateFacility.validateSoTang());
        map.put(villa1,3);
        stringList.add(villa1.toString());
        FileUtilsCaseStudy.writeFile(path_villa, stringList, true);
    }
}
