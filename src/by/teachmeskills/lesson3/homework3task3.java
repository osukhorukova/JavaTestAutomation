package by.teachmeskills.lesson3;

//This program creates 2 arrays with 5 random elements. After, it compares their average values.

import java.util.Arrays;
import java.util.Random;

public class homework3task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt();
        }
            System.out.println("Array 2: " + Arrays.toString(array2));
            int n = array1.length;
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += array1[j];
            }
            int avg1 = sum1 / n;
            for (int j = 0; j < n; j++) {
                sum2 += array2[j];
            }
            int avg2 = sum2 / n;
            if (avg1 > avg2) {
                System.out.println("Average value of array 1 is greater than average value of array 2");
            } else if (avg2 > avg1) {
                System.out.println("Average value of array 2 is greater than average value of array 1");
            } else if (avg1 == avg2) {
                System.out.println("Average value of array 1 is equal to average value of array 2");
            }
        }
    }
