import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSumSolution twoSumSol = new TwoSumSolution();
        int[] array = {1, 7, 2, 2, 2, 5};
        System.out.println(Arrays.toString(twoSumSol.twoSum(array, 8)));
    }

    public static class TwoSumSolution {
        public int[] twoSum(int[] nums, int target) {
            int[] ret = {0, 0};

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {

                int comp = target - nums[i];

                if (map.containsKey(comp)) {
                    //return new int[] { map.get(comp), i };
                    ret[0] = map.get(comp);
                    ret[1] = i;
                    System.out.println(Arrays.toString(ret));
                    return ret;
                }
                map.put(nums[i], i);
            }


            throw new IllegalArgumentException("No two sum solution");


//         int hi = nums.length - 1;
//         int lo = 0;
//         int sum = 0;

//         while (hi > lo){

//             sum = nums[hi] + nums[lo];

//             if ( sum == target){
//                 ret[0] = lo;
//                 ret[1] = hi;
//                 return ret;
//             }

//             if ( sum > target)
//                 hi--;
//             else if ( sum < target)
//                 lo++;

//         }
            // return ret;
        }
    }
}