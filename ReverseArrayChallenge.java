package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();

        reverse(returnedArray);
        System.out.println("Final: " + Arrays.toString(returnedArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");

        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--> " + Arrays.toString(array));
        }
    }
}
