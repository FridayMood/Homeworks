package Lesson5;

import java.util.Scanner;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.foodAmount = 5.00;
        Scanner sc = new Scanner (System.in);
        double i;
        System.out.println("Введите количество корма: ");
        boolean notHungry = cat.feed(i = sc.nextDouble());
        if (notHungry) {
            System.out.println("Кот не наелся");
        } else {
            System.out.println("Кот наелся");
        }
    }
}
