package by.teachmeskills.lesson2;

// This program is written to show the following sequence of numbers "7, 14, 21, 28, 35, 42, 49, 56, 63,
//70, 77, 84, 91, 98"

public class homeWork2Task9 {
    public static void main(String[] args) {
        int numb = 7;
        while (numb < 99) {
            if (numb % 7 == 0) {
                System.out.println(numb);
            }
            numb++;
        }
    }
}
