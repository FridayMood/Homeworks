package Lesson5;

import java.util.Scanner;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.foodAmount = 5.00;
        boolean notHungry = cat.feed(4.99);
        if (notHungry) {
            System.out.println("Кот не наелся");
        } else {
            System.out.println("Кот наелся");
        }
    }
}
