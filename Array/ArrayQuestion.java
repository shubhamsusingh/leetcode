package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayQuestion {
    // Q1. Remove duplicates Element From Array
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Q2. Remove Specific Element From Array
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Move All Zeroes [1,2,3,0,0]
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];

            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    // Intersection of two Array:- Input: nums1 = [1,2,2,1], nums2 = [2,2] Output:
    // [2]
    public int[] intersection(int[] num1, int[] num2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hset = new HashSet<>();
        for (int num : num1) {
            al.add(num);
        }
        for (int num : num2) {
            if (al.contains(num)) {
                hset.add(num);
            }
        }
        int[] result = new int[hset.size()];
        int i = 0;
        for (int num : hset) {
            result[i++] = num;
        }
        return result;
    }

    // One Plus:-
    public int[] onePlus(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] = nums[i] + 1;
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }

    // Two Sum:-Input: nums = [3,2,4], target = 6 Output: [1,2]
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    // Input: nums1 = [1,3], nums2 = [2]
    // Output: 2.00000
    // Explanation: merged array = [1,2,3] and median is 2.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                k++;
                i++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }
        int mid = result.length;
        if (mid % 2 == 0) {
            int index = mid / 2;
            return (result[index] + result[index - 1]) / 2.0;
        } else {
            return result[mid / 2];
        }
    }
}
