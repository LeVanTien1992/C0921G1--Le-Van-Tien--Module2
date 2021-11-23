package ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.ipml;

import ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Mitsubishi;
import ss17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.QuanLySanPham;
import ss17_binary_file_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MitsubishiIpml implements QuanLySanPham {
    static List<Mitsubishi> mitsubishiList = new ArrayList<>();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        Mitsubishi mitsubishi4 = new Mitsubishi();
        System.out.println("Them moi ma san pham");
        mitsubishi4.setMaSanPham(scanner.nextLine());
        System.out.println("Them moi ten san pham");
        mitsubishi4.setTenSanPham(scanner.nextLine());
        System.out.println("Them moi ten hang san xuat");
        mitsubishi4.setHangSanXuat(scanner.nextLine());
        System.out.println("Them moi gia");
        mitsubishi4.setGia(Double.parseDouble(scanner.nextLine()));
        System.out.println("Them moi mo ta khac");
        mitsubishi4.setCacMoTaKhac(scanner.nextLine());
        mitsubishiList.add(mitsubishi4);
        hienThi();
    }
    static {
        mitsubishiList.add(new Mitsubishi("001", "Xpander", "Mitsubishi", 700, "Tiet kiem xang"));
        mitsubishiList.add(new Mitsubishi("101", "Outlander", "Mitsubishi", 850, "Thiet ke dep"));
        mitsubishiList.add(new Mitsubishi("201", "Pajero Sport", "Mitsubishi", 1000, "Manh me"));
        writeToFile("mitsubishi.csv", mitsubishiList);
        List<Mitsubishi> mitsubishisDataFromFile = readDataFromFile("mitsubishi.csv");
        for (Mitsubishi mitsubishis :mitsubishisDataFromFile) {
            System.out.println(mitsubishis);
        }

    }
    @Override
    public void hienThi() {
        for (Mitsubishi mitsubishi: mitsubishiList) {
            System.out.println(mitsubishi);
        }
    }

    @Override
    public void timKiem(String maSanPham) {
        for (int i = 0; i < mitsubishiList.size(); i++) {
            if(mitsubishiList.get(i).getMaSanPham().contains(maSanPham)){
                System.out.println(mitsubishiList.get(i));
            }
        }
    }
    public static void writeToFile(String path, List<Mitsubishi> mitsubishiList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mitsubishiList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Mitsubishi> readDataFromFile(String path){
        List<Mitsubishi> mitsubishiList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            mitsubishiList = (List<Mitsubishi>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return mitsubishiList;
    }
}
