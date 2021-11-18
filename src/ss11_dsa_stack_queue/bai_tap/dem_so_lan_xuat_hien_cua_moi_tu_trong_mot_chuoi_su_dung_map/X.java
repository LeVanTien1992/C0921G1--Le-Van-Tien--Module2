package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class X {
    public static Map findWordFrequency(String string) {
        String[] array = string.toLowerCase().split(" ");
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            String key = array[i];
            if (treeMap.containsKey(key)) {
                int value = treeMap.get(key);
                treeMap.replace(key, ++value);
            } else {
                treeMap.put(key, 1);
            }
        }
        return treeMap;
    }

    public static void main(String[] args) {
        String str = "   Hello 2021   C1120G1    hello 2020    hello    ";
        String newString = str.toLowerCase().trim().replaceAll("\\s+", " ");
        System.out.println(newString);
        Map treeMap = findWordFrequency(newString);
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + treeMap.get(key));
        }
    }

}
