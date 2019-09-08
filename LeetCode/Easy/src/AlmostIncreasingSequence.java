import java.util.Arrays;

public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        CheckSequence seqCheck = new CheckSequence();
        int[] array = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(seqCheck.almostIncreasingSequence(array));
    }
}

class CheckSequence {
    boolean almostIncreasingSequence(int[] sequence) {

        int count = 0;
        int flip = 0;


        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length; j++) {

                if (sequence[i] >= sequence[j]){
                    count = 1;
                    System.out.println("Count " + j + " = " + count);
                }
            }

            System.out.println("Count " + i + " = " + count);

            if (count > 2)
                return false;
        }
        return true;
    }
}