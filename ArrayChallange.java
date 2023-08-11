package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomArray(10)));
    }

    public static int[] getRandomArray(int len) {
        int[] newArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < len / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[len - 1 - i];
            newArray[len - 1 - i] = temp;
        }
        return newArray;
    }
}