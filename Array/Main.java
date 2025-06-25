package Array;

public class Main {
    public static void main(String[] args) {
        ArrayQuestion Ar = new ArrayQuestion();
        int[] nums = { 1, 2, 3, 3, 4, 5 };
        int k = Ar.removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
        int[] nums1 = { 1, 2, 2, 2, 3, 4 };
        int k1 = Ar.removeElement(nums1, 2);
        for (int i = 0; i < k1; i++) {
            System.out.println(nums1[i]);
        }
        int[] zeronums = { 1, 0, 3, 4, 0, 5 };
        Ar.moveZeroes(zeronums);
        for (int i = 0; i < zeronums.length; i++) {
            System.out.println(zeronums[i]);
        }
        int[] result = Ar.intersection(nums1, zeronums);
        System.out.println("From here InterSection");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
