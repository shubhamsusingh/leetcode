package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDublicate {

    public static ArrayList<Integer> findDublicate(int num[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : num) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : num) {
            if (hm.get(i) > 1) {
                if (!al.contains(i)) {
                    al.add(i);
                }

            }
        }
        return al;
    }

    // Second method:-

    // public static ArrayList findDuplicates(int nums[]){

    // HashMap<Integer,Integer> hm=new HashMap<>();
    // for (int i:nums ){

    // hm.put(i,hm.getOrDefault(i,0)+1);

    // }
    // ArrayList<Integer> al=new ArrayList<>();
    // for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
    // if (entry.getValue() >1 ){
    // al.add(entry.getKey());
    // }
    // }
    // return al;

    // }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 4, 6, 6, 2, 1 };
        List<Integer> duplicts = findDublicate(nums);
        System.out.println(duplicts);
    }
}
