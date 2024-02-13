package by.teachmeskills.lesson12.task5;

import java.util.HashSet;
import java.util.Set;

public class StudentGroup {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Irina");
        uniqueNames.add("Artiom");
        uniqueNames.add("Artiom");
        uniqueNames.add("Olga");
        uniqueNames.add("Olga");
        uniqueNames.add("Alesya");
        uniqueNames.add("Eugeniy");
        uniqueNames.add("Ilya");
        uniqueNames.add("Svyatoslav");
        uniqueNames.add("Pavel");
        uniqueNames.add("Roland");

        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
