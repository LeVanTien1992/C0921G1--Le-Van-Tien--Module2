package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ipml;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models.Iphone;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class IphoneIpml implements QuanLySanPham {
    static ArrayList<Iphone> iphoneArrayList = new ArrayList<>();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone4 = new Iphone();
        System.out.println("Nhập vào tên cần thêm");
        iphone4.setTen(scanner.nextLine());
        System.out.println("Nhập vào giá tiền cần thêm");
        iphone4.setGiaTien(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào hãng cần thêm");
        iphone4.setHangSanXuat(scanner.nextLine());
        System.out.println("Nhập vào tính năng FaceId cần thêm");
        iphone4.setFaceId(scanner.nextLine());
        iphoneArrayList.add(iphone4);
        for (Iphone iphone:iphoneArrayList) {
            System.out.println(iphone);
        }
    }

    @Override
    public void sua(int index) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < iphoneArrayList.size(); i++) {
            if(i == index){
                System.out.println("Nhập vào tên cần sửa");
                String ten = scanner.nextLine();
                System.out.println("Nhập vào giá tiền cần sửa");
                int giaTien = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào hãng cần sửa");
                String hang = scanner.nextLine();
                System.out.println("Nhập vào tính năng FaceId cần sửa");
                String faceId = scanner.nextLine();

                iphoneArrayList.get(i).setTen(ten);
                iphoneArrayList.get(i).setGiaTien(giaTien);
                iphoneArrayList.get(i).setHangSanXuat(hang);
                iphoneArrayList.get(i).setFaceId(faceId);
                break;

            }
        }
        for (Iphone iphone:iphoneArrayList) {
            System.out.println(iphone);
        }
    }

    @Override
    public void xoa(String ten) {
        for (int i = 0; i < iphoneArrayList.size(); i++) {
            if(ten.equals(iphoneArrayList.get(i).getTen())){
                iphoneArrayList.remove(iphoneArrayList.get(i));
            }
        }
    }

    static {
        Iphone iphone1 = new Iphone("Iphone12 Pro Max", 1000, "Apple", "Tốt");
        Iphone iphone2= new Iphone("Iphone11 Pro Max", 800, "Apple", "Tốt");
        Iphone iphone3 = new Iphone("Iphone10 Pro Max", 600, "Apple", "Tốt");
        iphoneArrayList.add(iphone1);
        iphoneArrayList.add(iphone2);
        iphoneArrayList.add(iphone3);
    }
    @Override
    public void hienThi() {

        for (Iphone iphone:iphoneArrayList) {
            System.out.println(iphone);
        }
    }

    @Override
    public void timKiem(String ten) {
        for (Iphone iphone:iphoneArrayList) {
            if(iphone.getTen().indexOf(ten)>= 0){
                System.out.println(iphone);
            }
        }
    }


    @Override
    public void sapXep() {
        System.out.println("Trước khi sắp xếp: ");
        for (Iphone iphone:iphoneArrayList) {
            System.out.println(iphone);
        }
        Collections.sort(iphoneArrayList, new Comparator<Iphone>() {
            @Override
            public int compare(Iphone o1, Iphone o2) {
                return o1.getGiaTien()-o2.getGiaTien();
            }
        });
        System.out.println("Sau khi sắp xếp: ");
        for (Iphone iphone: iphoneArrayList) {
            System.out.println(iphone);
        }
    }
}
