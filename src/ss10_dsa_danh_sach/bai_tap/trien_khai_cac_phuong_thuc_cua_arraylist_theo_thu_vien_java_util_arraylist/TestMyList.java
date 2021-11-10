package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java_util_arraylist;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("List: ");
        listInteger.output();

        listInteger.add(3, 7);
        System.out.println("After add index: ");
        listInteger.output();

        listInteger.remove(1);
        System.out.println("After remove: ");
        listInteger.output();

        System.out.println("Have 5: " + listInteger.contain(5));
        System.out.println("Have 7: " + listInteger.contain(7));

        System.out.println("Index of 7: " + listInteger.indexOf(7));
        System.out.println("Index of 5: " + listInteger.indexOf(5));

        listInteger.clear();
        System.out.println("After Clear: ");
        listInteger.output();
    }

}
