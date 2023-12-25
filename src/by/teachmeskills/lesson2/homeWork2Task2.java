package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program will return a name of the season depending on the month number you enter (if-else use)

public class homeWork2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int monthnumber = scanner.nextInt();
        if (monthnumber == 1 || monthnumber == 2 || monthnumber == 12) {
            System.out.println("Winter");
        } else if (monthnumber == 3 || monthnumber == 4 || monthnumber == 5) {
            System.out.println("Spring");
        } else if (monthnumber == 6 || monthnumber == 7 || monthnumber == 8) {
            System.out.println("Summer");
        } else if (monthnumber == 9 || monthnumber == 10 || monthnumber == 11) {
            System.out.println("Fall");
        } else {
            System.out.println("There are only 12 months in a year");
        }
    }
}
