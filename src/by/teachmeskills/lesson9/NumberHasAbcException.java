package by.teachmeskills.lesson9;

public class NumberHasAbcException extends RuntimeException {

    public NumberHasAbcException() {
        super("The document number doesn't contain *abc* in it");
    }

    public static void checkAbc(String documentNumber) {
        if (!documentNumber.contains("abc")) {
            throw new NumberHasAbcException();
        }
    }
}
