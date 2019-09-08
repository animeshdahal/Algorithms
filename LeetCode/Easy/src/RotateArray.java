import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */



public class RotateArray {

    public static void main(String[] args) {
        RotateArray arrayRotate = new RotateArray();
        int[] array = {1, 7, 2, 3, 5};
        int k = 2;
        arrayRotate.rotate(array,k);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Reversing the array, first reverse the array, then reverse first k elements and then reverse last n-k elements (simple and effective)
     * Solution Time: O(n), Space: O(1)
     */

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Using Cyclic Replacement, Solution Time: O(n), Space: O(1)
     */

//    public void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        int count = 0;
//        for (int start = 0; count < nums.length; start++) {
//            int current = start;
//            int prev = nums[start];
//            do {
//                int next = (current + k) % nums.length;
//                int temp = nums[next];
//                nums[next] = prev;
//                prev = temp;
//                current = next;
//                count++;
//            } while (start != current);
//        }
//    }

    /**
     * Using Extra Array, Solution Time: O(n), Space: O(n)
     */

//    public void rotate(int[] nums, int k) {
//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            a[(i + k) % nums.length] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = a[i];
//        }
//    }


    /**
     * Brute Force solution Solution Time: O(n*k) since all numbers are shifted 1-step O(n) k times O(k), Space: O(1)
     */

//    public void rotate(int[] nums, int k) {
//        int temp, previous;
//        for (int i = 0; i < k; i++) {
//            previous = nums[nums.length - 1];
//            for (int j = 0; j < nums.length; j++) {
//                temp = nums[j];
//                nums[j] = previous;
//                previous = temp;
//            }
//        }
//    }


}
