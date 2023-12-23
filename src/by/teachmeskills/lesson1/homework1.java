package by.teachmeskills.lesson1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = MyInput.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}