package Lesson9Strings;

public class HWMain implements Methods{
    public static void main(String[] args) {
        String str = "8764-Tyu-6785-tyk-6u8i";
        String docNumber = Methods.FirstBlockOfNumbers(str);
        docNumber = Methods.replace3Letters(str);
        docNumber = Methods.onlyLetters(str);
        docNumber = Methods.startsWith(str);
        docNumber = Methods.endsWith(str);
        docNumber = Methods.containsElement(str);
        docNumber = Methods.onlyLettersUppercase(str);
    }
}
