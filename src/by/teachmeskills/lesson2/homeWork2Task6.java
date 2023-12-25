package by.teachmeskills.lesson2;

// This program shows all odd numbers from 1 to 99

public class homeWork2Task6 {
    public static void main(String[] args) {
        for (int numb = 1; numb <= 99; numb++) {
            if (numb % 2 != 0) {
                System.out.println(numb);
            }
        }
    }
}
