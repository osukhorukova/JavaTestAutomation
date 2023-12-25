package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program shows a sum of numbers from 1 to X where X is a number you enter

public class homeWork2Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int numb = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
