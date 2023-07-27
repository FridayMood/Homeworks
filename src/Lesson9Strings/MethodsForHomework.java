package Lesson9Strings;

public interface MethodsForHomework {

    public static String FirstBlockOfNumbers(String a) {
        System.out.println("First 2 blocks with 2 numbers in one line: " + a.substring(0, 4) + a.substring(9, 13));
        return a;
    }

    public static String replace3Letters(String a) {
        String replace3Letters = a.replace("Tyu", "***");
        String replace3Letters2 = replace3Letters.replace("tyk", "***");
        System.out.println("* instead of blocks of numbers: " + replace3Letters2);
        return replace3Letters2;
    }

    public static String onlyLetters(String a) {
        String onlyLetters = a.substring(5, 8) + "/" + a.substring(14, 17) + "/" + a.substring(19, 20)
                + "/" + a.substring(21);
        System.out.println("only letters in lower case: " + onlyLetters.toLowerCase());
        return onlyLetters;
    }

    public static String startsWith(String a) {
        System.out.println("Does the document start with 555?: " + a.startsWith("555"));
        return a;
    }

    public static String endsWith(String a) {
        System.out.println("Does the document end with 1a2b?: " + a.endsWith("1a2b"));
        return a;
    }

    public static String containsElement(String a) {
        String b = a.toLowerCase();
        System.out.println("Does the document contain abc or ABC?: " + b.contains("abc"));
        return b;
    }
}

