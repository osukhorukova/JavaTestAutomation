package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program will return a name of the season depending on the month number you enter (switch-case use)

public class homeWork2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int monthnumber = scanner.nextInt();
        switch (monthnumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("There are only 12 months in a year");
                break;
        }
    }
}
