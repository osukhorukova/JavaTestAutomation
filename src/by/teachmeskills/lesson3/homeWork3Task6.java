package by.teachmeskills.lesson3;

//This program sorts an array of names

import java.util.Arrays;

public class homeWork3Task6 {
    public static void main(String[] args) {
        String[] names = {"James", "Astrid", "Ira", "Eric", "Vladimir", "Maria"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
