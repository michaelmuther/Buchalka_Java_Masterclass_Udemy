package section_eight_arrays;
import java.util.Scanner;

public class ArraysBuchalka {

    public static boolean toString;

    public static void main(String[] args) {
        int[] input = getIntegers();
        printIntegers(input);
        int[] output = sortIntegers(input);
        printIntegers(output);
    }

    public static int[] getIntegers() {
        int number = 5;
        System.out.println("Enter " + number + " integer values:\r");
        int[] input = new int[number];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < number; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void printIntegers(int[] input){
        for(int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < result.length; i++) {
            int currentMax = -1;
            int currentMaxIndex = -1;
            for (int j = 0; j < input.length; j++) {
                if (input[j] >= currentMax) {
                    currentMax = input[j];
                    currentMaxIndex = j;
                }
            }
            result[i] = currentMax;
            input[currentMaxIndex] = -1;
        }
        return result;
    }
}
