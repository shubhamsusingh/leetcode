package hashMap;

import java.util.HashMap;

public class FirstNonRepeating {
    public static Character findFirstRepeating(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) > 1) {
                return str.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "bipin";
        System.out.println(findFirstRepeating(str));
    }
}
