package case_study.models;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        String[] array1 = o1.getNgayBatDau().split("/");
        String[] array2 = o2.getNgayBatDau().split("/");
        String[] array3 = o1.getNgayKetThuc().split("/");
        String[] array4 = o2.getNgayKetThuc().split("/");


        for (int i = 0; i < array1.length; i++) {
            if(o1.getNgayBatDau().compareTo(o2.getNgayBatDau()) > 0){
                return 1;
            }else if(o1.getNgayBatDau().compareTo(o2.getNgayBatDau())<0){
                return -1;
            }else {
                if(o1.getNgayKetThuc().compareTo(o2.getNgayKetThuc())>0){
                    return 1;
                }else if(o1.getNgayKetThuc().compareTo(o2.getNgayKetThuc())<0){
                    return 1;
                }else {
                    return 0;
                }
            }
        }
        return 0;
    }
}
