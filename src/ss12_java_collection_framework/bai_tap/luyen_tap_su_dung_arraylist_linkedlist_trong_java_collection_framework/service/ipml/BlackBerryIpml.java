package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ipml;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models.BlackBerry;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BlackBerryIpml implements QuanLySanPham {
    static ArrayList<BlackBerry> blackBerryArrayList = new ArrayList<>();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        BlackBerry blackBerry4 = new BlackBerry();
        System.out.println("Nhập vào tên cần thêm");
        blackBerry4.setTen(scanner.nextLine());
        System.out.println("Nhập vào giá tiền cần thêm");
        blackBerry4.setGiaTien(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào hãng cần thêm");
        blackBerry4.setHangSanXuat(scanner.nextLine());
        System.out.println("Nhập vào tính năng bảo mật cần thêm");
        blackBerry4.setBaoMat(scanner.nextLine());
        blackBerryArrayList.add(blackBerry4);
        for (BlackBerry blackBerry:blackBerryArrayList) {
            System.out.println(blackBerry);
        }
    }

    @Override
    public void sua(int index) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < blackBerryArrayList.size(); i++) {
            if(i == index){
                System.out.println("Nhập vào tên cần sửa");
                String ten = scanner.nextLine();
                System.out.println("Nhập vào giá tiền cần sửa");
                int giaTien = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào hãng cần sửa");
                String hang = scanner.nextLine();
                System.out.println("Nhập vào tính năng bảo mật cần sửa");
                String baoMat = scanner.nextLine();

                blackBerryArrayList.get(i).setTen(ten);
                blackBerryArrayList.get(i).setGiaTien(giaTien);
                blackBerryArrayList.get(i).setHangSanXuat(hang);
                blackBerryArrayList.get(i).setBaoMat(baoMat);
                break;

            }
        }
        for (BlackBerry blackBerry:blackBerryArrayList) {
            System.out.println(blackBerry);
        }
    }

    @Override
    public void xoa(String ten) {
        for (int i = 0; i < blackBerryArrayList.size(); i++) {
            if(ten.equals(blackBerryArrayList.get(i).getTen())){
                blackBerryArrayList.remove(blackBerryArrayList.get(i));
            }
        }
    }

    static {
        BlackBerry blackBerry1 = new BlackBerry("B9900", 300, "BlackBerry", "Tốt");
        BlackBerry blackBerry2 = new BlackBerry("KeyOne", 500, "BlackBerry", "Tốt");
        BlackBerry blackBerry3 = new BlackBerry("B9000", 200, "BlackBerry", "Tốt");
        blackBerryArrayList.add(blackBerry1);
        blackBerryArrayList.add(blackBerry2);
        blackBerryArrayList.add(blackBerry3);
    }
    @Override
    public void hienThi() {


        for (BlackBerry blackBerry: blackBerryArrayList) {
            System.out.println(blackBerry);
        }
    }

    @Override
    public void timKiem(String ten) {
        for (BlackBerry blackBerry:blackBerryArrayList) {
            if(blackBerry.getTen().indexOf(ten)>=0){
                System.out.println(blackBerry);
            }
        }
    }

    @Override
    public void sapXep() {
        System.out.println("Trước khi sắp xếp: ");
        for (BlackBerry blackBerry:blackBerryArrayList) {
            System.out.println(blackBerry);
        }
        Collections.sort(blackBerryArrayList, new Comparator<BlackBerry>() {
            @Override
            public int compare(BlackBerry o1, BlackBerry o2) {
                return o1.getGiaTien()-o2.getGiaTien();
            }
        });
        System.out.println("Sau khi sắp xếp: ");
        for (BlackBerry blackBerry:blackBerryArrayList) {
            System.out.println(blackBerry);
        }
    }
}
