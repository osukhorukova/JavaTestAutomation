package by.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;

//This program creates an array of 7 elements and shows it to the user. After, it replaces every odd
// element of the array with 0 and shows the result to the user again. As a result, we will see
// 2 arrays.

public class homeWork3Task5 {
    public static void main (String[] args){
        Random random = new Random();
        int[] array1 = new int[7];
        for (int i=0; i < array1.length; i++){
            array1[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        for (int i=1; i<array1.length; i += 2){
            array1[i] = 0;
        }
        System.out.println(Arrays.toString(array1));
    }
}
