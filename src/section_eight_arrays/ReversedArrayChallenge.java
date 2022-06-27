package section_eight_arrays;

import java.util.Arrays;

public class ReversedArrayChallenge {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,44,2,3,0,2345};
        System.out.println(Arrays.toString(input));
        reverse(input);
        System.out.println(Arrays.toString(input));
    }

    public static void reverse(int[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }
    }
}
