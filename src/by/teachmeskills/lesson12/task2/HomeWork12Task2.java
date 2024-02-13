package by.teachmeskills.lesson12.task2;

//This program creates a collection of integers. It fills the collection with random numbers.
//The collection size is set from the console.
//The program calculates and displays the arithmetic mean of all elements in the collection.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12Task2 {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();

        int collectionSize = getCollectionSizeFromConsole();
        fillCollectionWithRandomNumbers(collection, collectionSize);

        double average = calculateAverage(collection);
        System.out.println("The arithmetic mean of the collection is: " + average);
    }

    private static int getCollectionSizeFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int collectionSize = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the size of the collection: ");
                collectionSize = Integer.parseInt(scanner.nextLine());
                if (collectionSize >= 0) {
                    validInput = true;
                } else {
                    System.out.println("The size of the collection cannot be negative. Please, Try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }

        return collectionSize;
    }

    private static void fillCollectionWithRandomNumbers(List<Integer> collection, int collectionSize) {
        Random random = new Random();

        for (int i = 0; i < collectionSize; i++) {
            int randomNumber = random.nextInt();
            collection.add(randomNumber);
        }
    }

    private static double calculateAverage(List<Integer> collection) {
        int sum = 0;
        for (int number : collection) {
            sum += number;
        }
        return (double) sum / collection.size();
    }
}
