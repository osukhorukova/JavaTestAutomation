package by.teachmeskills.lesson2;

import java.util.Scanner;

// This program will define a color by the number you enter (numbers will be chosen according to the rainbow)

public class homeWork2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int numb = scanner.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light-blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
            default:
                System.out.println("There are only 7 colors in the rainbow");
                break;
        }
    }
}