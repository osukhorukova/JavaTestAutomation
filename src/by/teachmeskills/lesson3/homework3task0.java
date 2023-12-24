package by.teachmeskills.lesson3;

import java.util.Scanner;

//This program checks if the number you enter is included in the array

public class homework3task0 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 5, 24, 67, 9, 12, 2, 4, 56, 34};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int numb = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (numb == array[i]) {
                System.out.println("There is " + numb + " in the array!");
            }
            }
        }
    }

