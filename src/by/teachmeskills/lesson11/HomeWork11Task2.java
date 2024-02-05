package by.teachmeskills.lesson11;

import java.util.Arrays;

public class HomeWork11Task2 {
    public static void main(String[] args) {
        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(13);

        System.out.println("Element with index 1: " + numbers.get(1));
        System.out.println("Does 1 exist in the collection? " + numbers.contains(1));
        numbers.delete(1);
        System.out.println("Does 1 exist in the collection? " + numbers.contains(1));
        numbers.clear();
    }
}
