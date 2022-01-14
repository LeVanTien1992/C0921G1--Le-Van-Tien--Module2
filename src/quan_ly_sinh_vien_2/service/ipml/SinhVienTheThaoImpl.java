package quan_ly_sinh_vien_2.service.ipml;

import Candidate_Management_system.common.FileUtils;
import quan_ly_sinh_vien_2.common.FileUtilsSinhVien2;
import quan_ly_sinh_vien_2.models.SinhVien;
import quan_ly_sinh_vien_2.models.SinhVienTheThao;
import quan_ly_sinh_vien_2.service.QuanLySinhVien;
import quan_ly_sinh_vien_2.service.ipml.Comparator1;
import quan_ly_sinh_vien_2.validate.Validate;

import java.util.*;

public class SinhVienTheThaoImpl implements QuanLySinhVien {
    List<SinhVien> sinhVienTheThaoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_THETHAO= "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\quan_ly_sinh_vien_2\\data\\sinhVienTheThao.csv";
//    String maSinhVien, String tenSinhVien, int tuoi, String sucKhoe, String body
{
    sinhVienTheThaoList = covertStringToSinhVienTheThao();
}

    @Override
    public void them() {
        List<String> stringList = new ArrayList<>();
        SinhVienTheThao sinhVienTheThao1 = new SinhVienTheThao();
        System.out.println("Nhập mã sinh viên");
        sinhVienTheThao1.setMaSinhVien(Validate.validateMaSinhVienTheThao());
        System.out.println("Nhập tên sinh viên");
        sinhVienTheThao1.setTenSinhVien(Validate.validateTenSinhVien());
        System.out.println("Nhập tuổi sinh viên");
        sinhVienTheThao1.setTuoi(Integer.parseInt(Validate.validateTuoi()));
        System.out.println("Nhập sức khỏe sinh viên");
        sinhVienTheThao1.setSucKhoe(Validate.validateTenSinhVien());
        System.out.println("Nhập body sinh viên");
        sinhVienTheThao1.setBody(Validate.validateTenSinhVien());
        sinhVienTheThaoList.add(sinhVienTheThao1);
        stringList.add(sinhVienTheThao1.toString());
        FileUtilsSinhVien2.writeFile(FILE_THETHAO, stringList, true);

    }

    @Override
    public void xoa(String timKiem) {
        for (int i = 0; i < sinhVienTheThaoList.size(); i++) {
            if(checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                if(sinhVienTheThaoList.get(i).getMaSinhVien().contains(timKiem)||
                        sinhVienTheThaoList.get(i).getTenSinhVien().contains(timKiem)){
                    sinhVienTheThaoList.remove(sinhVienTheThaoList.get(i));
                }
            }
        }
        List<String> stringList = covertSinhVienTheThaoToString();
        FileUtilsSinhVien2.writeFile(FILE_THETHAO, stringList, false);
    }
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVien sinhVienTheThao: sinhVienTheThaoList) {
            if(maSinhVien.equals(sinhVienTheThao.getMaSinhVien())){
                return true;
            }
        }
        return false;
    }
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVien sinhVienTheThao: sinhVienTheThaoList) {
            if(tenSinhVien.equals(sinhVienTheThao.getTenSinhVien())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void tiemKiem(String tenSinhVien) {
        for (int i = 0; i < sinhVienTheThaoList.size(); i++) {
            if(sinhVienTheThaoList.get(i).getTenSinhVien().contains(tenSinhVien)){
                System.out.println(sinhVienTheThaoList.get(i));
            }
        }
    }

    @Override
    public void hienThi() {
        int id = 1;
        for (SinhVien sinhVienTheThao: sinhVienTheThaoList){
            System.out.print(id++ + ",");

            System.out.println(sinhVienTheThao);
        }
    }
    public List<SinhVien> covertStringToSinhVienTheThao() {
        List<String> stringList = FileUtils.readFile(FILE_THETHAO);
        List<SinhVien> sinhVienTheThaoList = new ArrayList<>();
        String[] arrTaiKhoanTietKiem;
        for (String line : stringList) {
            arrTaiKhoanTietKiem = line.split(",");
            sinhVienTheThaoList.add(new SinhVienTheThao(arrTaiKhoanTietKiem[0], arrTaiKhoanTietKiem[1], Integer.parseInt(arrTaiKhoanTietKiem[2]),
                    arrTaiKhoanTietKiem[3], arrTaiKhoanTietKiem[4]));
            Collections.sort(sinhVienTheThaoList,new Comparator1());
        }
        return sinhVienTheThaoList;
    }

    public List<String> covertSinhVienTheThaoToString() {
        List<String> listString = new ArrayList<>();
        for (SinhVien sinhVienTheThao : sinhVienTheThaoList) {
            listString.add(sinhVienTheThao.toString());
        }
        return listString;
    }

}
