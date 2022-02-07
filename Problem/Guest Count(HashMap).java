package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int [] a = {1,3,5,7,9};
        int [] b = {2,4,5,6,8};
        System.out.println(findDuplicates(a,b));
    }

    public static List<Integer> findDuplicates(int[] a, int[] b) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if(map.containsKey(b[i])){
                list.add(b[i]);
            }
        }


        return list;
    }
}
