package case_study.service.impl;

import Candidate_Management_system.common.FileUtils;
import case_study.common.FileUtilsCaseStudy;
import case_study.models.*;
import case_study.service.FacilityService;
import case_study.validate.ValidateFacility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FacilityServiceIpml implements FacilityService {
     Map<Facility, Integer> map = new LinkedHashMap<>();
     Scanner scanner = new Scanner(System.in);
     List<String> stringList = new ArrayList<>();
    ValidateFacility validateFacility = new ValidateFacility();
    {
         covertStringToHouse(map);
         covertStringToRoom(map);
         covertStringToVilla(map);
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


    public Map<Facility, Integer> covertStringToHouse(Map<Facility, Integer> linkedHashMap) {
        List<String> stringList = FileUtils.readFile(path_house);
//        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrHouse;
        for (String line : stringList) {
            arrHouse = line.split(",");
            linkedHashMap.put((new House(arrHouse[0], arrHouse[1], Double.parseDouble(arrHouse[2]),
                    Double.parseDouble(arrHouse[3]), Integer.parseInt(arrHouse[4]), arrHouse[5], arrHouse[6], Integer.parseInt(arrHouse[7]))), 1);
        }
        return linkedHashMap;
    }
    public Map<Facility, Integer> covertStringToRoom(Map<Facility, Integer> linkedHashMap) {
        List<String> stringList = FileUtils.readFile(path_room);
//        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrRoom;
        for (String line : stringList) {
            arrRoom = line.split(",");
            linkedHashMap.put((new Room(arrRoom[0], arrRoom[1], Double.parseDouble(arrRoom[2]),
                    Double.parseDouble(arrRoom[3]), Integer.parseInt(arrRoom[4]), arrRoom[5], arrRoom[6])), 1);
        }
        return linkedHashMap;
    }
    public Map<Facility, Integer> covertStringToVilla(Map<Facility, Integer> linkedHashMap) {
        List<String> stringList = FileUtils.readFile(path_villa);
//        Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] arrVilla;
        for (String line : stringList) {
            arrVilla = line.split(",");
            linkedHashMap.put((new Villa(arrVilla[0], arrVilla[1], Double.parseDouble(arrVilla[2]),
                    Double.parseDouble(arrVilla[3]), Integer.parseInt(arrVilla[4]), arrVilla[5], arrVilla[6],
                    Double.parseDouble(arrVilla[7]), Integer.parseInt(arrVilla[8]))), 1);
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
        System.out.println("Th??m v??o m?? d???ch v???");
        house1.setMaDichVu(validateFacility.validateMaDichVuHouse());
        System.out.println("Th??m v??o t??n d???ch v???");
        house1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Th??m v??o di???n t??ch s??? d???ng");
        house1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Th??m v??o chi ph?? thu??");
        house1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Th??m v??o s??? l?????ng ng?????i t???i ??a");
        house1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Th??m v??o ki???u thu??");
        house1.setKieuThue(validateFacility.validateKieuThue());
        System.out.println("Th??m v??o ti??u chu???n ph??ng");
        house1.setTieuChuanPhong(validateFacility.validateTieuChuanPhong());
        System.out.println("Th??m v??o s??? t???ng");
        house1.setSoTang(validateFacility.validateSoTang());
        map.put(house1,1);
        stringList = new ArrayList<>();
        stringList.add(house1.toString());
        FileUtilsCaseStudy.writeFile(path_house, stringList, true);
    }
    public void addRoom(){
        Room room1 = new Room();
        System.out.println("Th??m v??o m?? d???ch v???");
        room1.setMaDichVu(validateFacility.validateMaDichVuRoom());
        System.out.println("Th??m v??o t??n d???ch v???");
        room1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Th??m v??o di???n t??ch s??? d???ng");
        room1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Th??m v??o chi ph?? thu??");
        room1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Th??m v??o s??? l?????ng ng?????i t???i ??a");
        room1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Th??m v??o ki???u thu??");
        room1.setKieuThue(validateFacility.validateKieuThue());
        System.out.println("Th??m v??o d???ch v??? mi???n ph?? ??i k??m");
        room1.setDichVuMienPhiDiKem(validateFacility.validateDichVuDiKem());
        for (Map.Entry<Facility, Integer> entry:map.entrySet()) {
            int cong = map.get(entry.getKey());
            if (map.containsKey(entry.getKey())){
                map.put(entry.getKey() ,1);
            }else {
                map.put(entry.getKey(), cong + 1 );
            }
        }
        stringList = new ArrayList<>();
        stringList.add(room1.toString());
        FileUtilsCaseStudy.writeFile(path_room, stringList, true);
    }
    public void addVilla(){
        Villa villa1 = new Villa();
        System.out.println("Th??m v??o m?? d???ch v???");
        villa1.setMaDichVu(validateFacility.validateMaDichVuVilla());
        System.out.println("Th??m v??o t??n d???ch v???");
        villa1.setTenDichVu(validateFacility.validateTenDichVu());
        System.out.println("Th??m v??o di???n t??ch s??? d???ng");
        villa1.setDienTichSuDung(validateFacility.validateDienTichSuDung());
        System.out.println("Th??m v??o chi ph?? thu??");
        villa1.setChiPhiThue(validateFacility.validateChiPhiThue());
        System.out.println("Th??m v??o s??? l?????ng ng?????i t???i ??a");
        villa1.setSoLuongNguoiToiDa(validateFacility.validateSoLuongNguoiToiDa());
        System.out.println("Th??m v??o ki???u thu??");
        villa1.setKieuThue(validateFacility.validateKieuThue());
        System.out.println("Th??m v??o ti??u chu???n ph??ng");
        villa1.setTieuChuanPhong(validateFacility.validateTieuChuanPhong());
        System.out.println("Th??m v??o di???n t??ch h??? b??i");
        villa1.setDienTichHoBoi(validateFacility.validateDienTichHoBoi());
        System.out.println("Th??m v??o s??? t???ng");
        villa1.setSoTang(validateFacility.validateSoTang());
        map.put(villa1,1);
        stringList = new ArrayList<>();
        stringList.add(villa1.toString());
        FileUtilsCaseStudy.writeFile(path_villa, stringList, true);
    }

    public void displayFacilityMaintance(){
        BookingServiceIpml bookingServiceIpml = new BookingServiceIpml();
        Set<Booking> bookingSet = bookingServiceIpml.ngayThang();
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        for (Booking booking: bookingSet) {
            for (Map.Entry<Facility, Integer> entry: map.entrySet()) {
               if(entry.getKey().getTenDichVu().equals(booking.getTenDichVu())){
                   if(!facilityIntegerMap.containsKey(entry.getKey())){
                       facilityIntegerMap.put(entry.getKey(), 1);
                   }else {
                       facilityIntegerMap.put(entry.getKey(), facilityIntegerMap.get(entry.getKey())+1);
                   }
               }
            }
        }
        for (Map.Entry<Facility, Integer> entry1: facilityIntegerMap.entrySet()) {
            System.out.println(entry1.getKey() + "-" + "S??? l???n Booking ???? ???????c s??? d???ng " + entry1.getValue());
        }
    }
}
