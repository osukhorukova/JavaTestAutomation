package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program will define if the number you entered is odd or even

public class homework2task3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = scanner.nextInt();
        if (value % 2 == 0){
            System.out.println(value + " is an even number");
        } else {
            System.out.println(value + " is an odd number");
        }
    }
}
