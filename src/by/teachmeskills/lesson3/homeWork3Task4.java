package by.teachmeskills.lesson3;

//This program creates an array of n random elements. N can be more than 5 and less or equal to 10. Otherwise,
// the program will notify us that n doesn't meet the requirements and will ask us to enter
// another number.
// After, the program creates another array consisting of even elements of the 1st array.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeWork3Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 6 to 10");
        int n = scanner.nextInt();
        if (n > 5 && n <= 10) {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt();
            }
            System.out.println(Arrays.toString(array));
            if (n % 2 == 0) {
                int[] evenarray = new int[n / 2];
                for (int i = 0; i < array.length; i += 2) {
                    evenarray[i / 2] = array[i];
                }
                System.out.println(Arrays.toString(evenarray));
            } else {
                int[] evenarray = new int[(n / 2 + 1)];
                for (int i = 0; i < array.length; i += 2) {
                    evenarray[i / 2] = array[i];
                }
                System.out.println(Arrays.toString(evenarray));
            }
        } else {
            System.out.println("The number you entered lays outside the mentioned range");
        }
    }
}

