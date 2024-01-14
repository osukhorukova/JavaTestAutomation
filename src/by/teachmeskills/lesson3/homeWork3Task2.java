package by.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Scanner;

//This program shows minimum, maximum and average values of the array. Meanwhile, the array has
// the size that you enter and its values are generated randomly.

public class homeWork3Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        double[] array = new double[size];
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double max = array[0];
        double sum = 0;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, array[j]);
            max = Math.max(max, array[j]);
            sum += array[j];
        }
        double average = sum / n;
        System.out.println(Arrays.toString(array));
        System.out.println(min + " is the minimum value");
        System.out.println(max + " is the maximum value");
        System.out.println(average + " is an average value");
    }
}
