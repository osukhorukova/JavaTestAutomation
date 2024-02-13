package by.teachmeskills.lesson12.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This program creates a collection of integers and fills it with values entered from the console.
//To end the input, the user enters the word "exit".
//When converting a string to a number, we consider the possibility of exceptions.
//The result of the program is to show even numbers from the collection on the screen.

    public  class HomeWork12Task1 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers (enter the word 'exit' to stop):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer or 'exit'");
                }
            }
            System.out.println("Even numbers in the collection: ");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }

