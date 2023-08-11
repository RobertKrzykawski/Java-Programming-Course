package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
    public static int[] getIntegers(int len) {
        int[] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element" + i + " contents " + array[i]);
        }
    }
}