package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program will define if the temperature you entered is considered to be warm, cold or alright

public class homeWork2Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature?");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("It's warm");
        } else if (temp > -20 && temp < -5) {
            System.out.println("It's alright");
        } else if (temp < -20) {
            System.out.println("It's cold");
        }
    }
}
