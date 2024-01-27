package by.teachmeskills.lesson9;

public class NumberStartsWith555Exception extends RuntimeException {

    public NumberStartsWith555Exception() {
        super("The document number doesn't start with *555*");
    }

    public static void check555(String documentNumber) {
        if (!documentNumber.startsWith("555")) {
            throw new NumberStartsWith555Exception();
        }
    }

}
