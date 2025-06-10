package hashMap;

import java.util.HashMap;

public class ItemInCommon {
    public static boolean itemInCommon(int arr1[], int arr2[]) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i : arr1) {
            hm.put(i, true);
        }
        for (int i : arr2) {
            if (hm.get(i) != null) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 7, 3 };
        System.out.println(itemInCommon(arr1, arr2));

    }
}
