package by.teachmeskills.lesson2;

// This program is written to show the following sequence of numbers "7, 14, 21, 28, 35, 42, 49, 56, 63,
//70, 77, 84, 91, 98"

public class homework2task9 {
    public static void main(String[] args) {
        int numb = 1;
        while (numb < 100) {
            if (numb % 7 == 0) {
                System.out.println(numb);
            }
            numb++;
        }
    }
}
