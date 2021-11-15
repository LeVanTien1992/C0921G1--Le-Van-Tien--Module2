package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.Ipml;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models.Iphone;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.models.SamSung;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SamSungIpml implements QuanLySanPham {
    static ArrayList<SamSung> samSungArrayList = new ArrayList<>();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        SamSung samSung4 = new SamSung();
        System.out.println("Nhập vào tên cần thêm");
        samSung4.setTen(scanner.nextLine());
        System.out.println("Nhập vào giá tiền cần thêm");
        samSung4.setGiaTien(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào hãng cần thêm");
        samSung4.setHangSanXuat(scanner.nextLine());
        System.out.println("Nhập vào tính năng chống nước cần thêm");
        samSung4.setChongNuoc(scanner.nextLine());
        samSungArrayList.add(samSung4);
        for (SamSung samSung:samSungArrayList) {
            System.out.println(samSung);
        }
    }

    @Override
    public void sua(int index) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < samSungArrayList.size(); i++) {
            if(i == index){
                System.out.println("Nhập vào tên cần sửa");
                String ten = scanner.nextLine();
                System.out.println("Nhập vào giá tiền cần sửa");
                int giaTien = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào hãng cần sửa");
                String hang = scanner.nextLine();
                System.out.println("Nhập vào tính năng chống nước cần sửa");
                String chongNuoc = scanner.nextLine();

                samSungArrayList.get(i).setTen(ten);
                samSungArrayList.get(i).setGiaTien(giaTien);
                samSungArrayList.get(i).setHangSanXuat(hang);
                samSungArrayList.get(i).setChongNuoc(chongNuoc);
                break;

            }
        }
        for (SamSung samSung:samSungArrayList) {
            System.out.println(samSung);
        }
    }


    @Override
    public void xoa(String ten) {
        for (int i = 0; i < samSungArrayList.size(); i++) {
            if(ten.equals(samSungArrayList.get(i).getTen())){
                samSungArrayList.remove(samSungArrayList.get(i));
            }
        }
    }


    static {
        SamSung samSung1 = new SamSung("SamSungGalaxy Note10", 700, "SamSung", "IP67");
        SamSung samSung2= new SamSung("SamSungGalaxy S10", 500, "SamSung", "IP68");
        SamSung samSung3 = new SamSung("SamSungGalaxy Z Fold3", 1000, "SamSung", "IP68");
        samSungArrayList.add(samSung1);
        samSungArrayList.add(samSung2);
        samSungArrayList.add(samSung3);
    }
    @Override
    public void hienThi() {

        for (SamSung samSung: samSungArrayList) {
            System.out.println(samSung);
        }
    }



    @Override
    public void timKiem(String ten) {
        for (SamSung samSung:samSungArrayList) {
            if(samSung.getTen().indexOf(ten)>=0){
                System.out.println(samSung);
            }
        }
    }

    @Override
    public void sapXep() {
        System.out.println("Trước khi sắp xếp: ");
        for (SamSung samSung: samSungArrayList) {
            System.out.println(samSung);
        }
        Collections.sort(samSungArrayList, new Comparator<SamSung>() {
            @Override
            public int compare(SamSung o1, SamSung o2) {
                return o1.getGiaTien()-o2.getGiaTien();
            }
        });
        System.out.println("Sau khi sắp xếp: ");
        for (SamSung samSung:samSungArrayList) {
            System.out.println(samSung);
        }
    }
}
