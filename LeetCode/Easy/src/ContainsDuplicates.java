import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct..
 */

public class ContainsDuplicates {

    public static void main(String[] args) {
        ContainsDuplicates arrayRotate = new ContainsDuplicates();
        int[] array = {1, 7, 2, 3, 2, 5};
        System.out.println(arrayRotate.containsDuplicate(array));
    }

    /**
     * Using HashSet Solution Time: O(n), Space: O(n)
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }




    /**
     * Sorting Solution Time: O(nlogn), Space: O(n)
     */

//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; ++i) {
//            if (nums[i] == nums[i + 1]) return true;
//        }
//        return false;
//    }


    /**
     * Brute Force solution Solution Time: O(n*n), Space: O(1)
     */

//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; ++i) {
//            for (int j = 0; j < i; ++j) {
//                if (nums[j] == nums[i]) return true;
//            }
//        }
//        return false;
//    }


}
