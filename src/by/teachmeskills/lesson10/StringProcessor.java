package by.teachmeskills.lesson10;

public class StringProcessor {

    static StringBuilder stringBuilder = new StringBuilder();

    public static String printFirstEightNumbers(String string) {
        return string.substring(0, 4) + string.substring(9, 13);
    }

    public static String replaceLettersWithAsterisks(String string) {
        return string.substring(0,5) + "***" + string.substring(8,14) + "***" + string.substring(17) ;
    }

    public static String printOnlyLettersInLowCase(String string) {
        return string.substring(5, 8).toLowerCase() + "/" + string.substring(14, 17).toLowerCase() + "/" + string.substring(19,20).toLowerCase() + "/" + string.substring(21).toLowerCase();
    }
    public static String printOnlyLettersInUpperCase(String string) {
        return stringBuilder.append(string.substring(5, 8).toUpperCase()).append("/").append(string.substring(14, 17).toUpperCase()).append("/").append(string.substring(19, 20).toUpperCase()).append("/").append(string.substring(21).toUpperCase()).toString();
    }

    public static String checkAbc(String string) {
        if (string.contains("abc") || string.contains("ABC")) {
            return "The document number contains *abc* or *ABC*";
        } else {
            return "The document number doesn't contain *abc* or *ABC*";
        }
    }

    public static String startsWith555(String string) {
        if (string.startsWith("555")) {
            return "The document number starts with *555*";
        } else {
            return "The document number doesn't start with *555*";
        }
    }

    public static String endsWith1a2b(String string) {
        if (string.endsWith("1a2b")) {
            return "The document number ends with *1a2b*";
        } else {
            return "The document number doesn't end with *1a2b*";
        }
    }


}
