import java.util.*;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one
 */


public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber findSingle = new SingleNumber();
        int[] array = {1, 1, 7, 7, 2, 3, 3, 2, 5, 5,9};
        System.out.println(findSingle.singleNumber(array));
    }


    /**
     * Using Bit-Manipulation: If we take XOR of zero and some bit, it will return that bit, a⊕0=a
     * If we take XOR of two same bits, it will return 0, a⊕a=0
     * a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
     * Time: O(n)
     * Space: O(1)
     */

    public int singleNumber(int[] nums) {

        int a = 0;

        for (int x : nums) {
            a ^= x;
        }
        return a;

    }


    /**
     * Using Math Approach: 2*(a+b+c) - (a+a+b+b+c) = c
     * Time: O(n)
     * Space: O(n) as new Set is created
     */

//    public int singleNumber(int[] nums) {
//
//        int sum = 0;
//        int doubleSum = 0;
//        Set<Integer> noDuplicates = new HashSet<>(nums.length);
//
//        for (int x : nums) {
//            sum = sum + x;
//
//            noDuplicates.add(x);
//        }
//
//        Iterator<Integer> iter = noDuplicates.iterator();
//
//        while (iter.hasNext()) {
//            doubleSum = doubleSum + iter.next();
//        }
//
//        doubleSum = 2 * doubleSum;
//
//        return (doubleSum - sum);
//    }


    /**
     * Using HashMap Time: O(n)
     * Space: O(n) as new Map is created
     */


//    public Map<Integer, Integer> singleNumber(int[] nums) {
//        Map<Integer, Integer> noDuplicates = new HashMap<>(nums.length);
//        int container = 0;
//
//        for (int x : nums) {
//
//            if (!noDuplicates.containsKey(x))
//                noDuplicates.put(x, 1);
//            else
//                noDuplicates.remove(x);
//        }
//        return noDuplicates;
//    }
}

/**
 * Using Set Solution Time: O(n*n) because the for loop iterates once, and then .contains operation iterates again
 * Space: O(n) as new set is created
 */

//    public int singleNumber(int[] nums) {
//        Set<Integer> noDuplicates = new HashSet<>(nums.length);
//        int container = 0;
//
//        for (int x : nums){
//
//            if(!noDuplicates.contains(x))
//                noDuplicates.add(x);
//            else
//                noDuplicates.remove(x);
//        }
//
//        return noDuplicates.iterator().next();
//    }
//}
