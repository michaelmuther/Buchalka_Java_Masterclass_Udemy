package section_eight_arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the amount of integers:\r");
        int count = scanner.nextInt();
        System.out.println("Enter " + count + " integers:\r");
        int[] input = readIntegers(count);
        int min = findMin(input);
        System.out.println("Min is: " + min);
    }

    public static int[] readIntegers(int count) {
        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }

    public static int findMin(int[] input) {
        int min =  Integer.MAX_VALUE;
        for (int i : input) {
            min = Math.min(i, min);
        }
        return min;
    }
}
