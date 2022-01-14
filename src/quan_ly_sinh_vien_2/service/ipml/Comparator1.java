package quan_ly_sinh_vien_2.service.ipml;

import quan_ly_sinh_vien_2.models.SinhVien;
import quan_ly_sinh_vien_2.models.SinhVienTheThao;

import java.util.Comparator;

public class Comparator1 implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getTenSinhVien().compareTo(o2.getTenSinhVien()) > 0) {
            return 1;
        } else if (o1.getTenSinhVien().compareTo(o2.getTenSinhVien()) < 0) {
            return -1;
        } else {
            if ((o1.getTuoi()) > (o2.getTuoi())) {
                return 1;
            } else if ((o1.getTuoi()) < (o2.getTuoi())) {
                return -1;
            }
            return 0;
        }

    }
}
