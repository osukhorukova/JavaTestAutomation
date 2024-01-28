package by.teachmeskills.lesson10;
import by.teachmeskills.lesson10.StringProcessor;

import static by.teachmeskills.lesson10.StringProcessor.*;

public class HomeWork10Task1 {
    public static void main(String[] args) {
        String string = "5551-aBC-3456-Hdh-1a2b";
        System.out.println(printFirstEightNumbers(string));
        System.out.println(printOnlyLettersInLowCase(string));
        System.out.println(printOnlyLettersInUpperCase(string));
        System.out.println(replaceLettersWithAsterisks(string));
        System.out.println(checkAbc(string));
        System.out.println(startsWith555(string));
        System.out.println(endsWith1a2b(string));

    }
}
