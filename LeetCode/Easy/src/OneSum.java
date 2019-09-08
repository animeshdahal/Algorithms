import java.util.Arrays;

public class OneSum {

    public static void main(String[] args) {
       Solution oneSumSol = new Solution();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(oneSumSol.plusOne(array)));
    }
}





class Solution {
    public int[] plusOne(int[] digits) {

        int length = digits.length - 1;
        int sum = 0;
        long place = 1;
        while (length >= 0){

            sum = sum + digits[length] * (int)place;

            place *= 10;

            length--;

        }

        sum = sum + 1;

        if (sum / place > 0 ) {
            int[] retArr = new int[digits.length + 1];
            for (int i = 0; i < retArr.length; i++){
                retArr[i] = sum / (int) place;
                sum = sum % (int) place;
                place /= 10;
            }
            return retArr;
        }

        else{
            place /= 10;
            int[] retArr = new int[digits.length];
            for (int i = 0; i < retArr.length; i++){
                retArr[i] = sum / (int) place;
                sum = sum % (int) place;
                place /= 10;
            }
            return retArr;
        }
    }
}
