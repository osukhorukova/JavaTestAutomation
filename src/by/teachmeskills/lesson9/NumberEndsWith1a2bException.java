package by.teachmeskills.lesson9;

public class NumberEndsWith1a2bException extends RuntimeException{
    public NumberEndsWith1a2bException() {
        super("The document number doesn't end with *1a2b*");
    }

    public static void check1a2b(String documentNumber) {
        if (!documentNumber.endsWith("1a2b")) {
            throw new NumberEndsWith1a2bException();
        }
    }
}
