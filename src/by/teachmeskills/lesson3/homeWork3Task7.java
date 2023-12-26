package by.teachmeskills.lesson3;

import java.util.Arrays;

public class homeWork3Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
