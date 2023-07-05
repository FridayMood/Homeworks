package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int i;
        System.out.println("Введите номер месяца: ");
        Scanner mn = new Scanner(System.in);
        i = mn.nextInt();

        if (i == 1 || i == 2 || i == 12) {
            System.out.println("Зима");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("Весна");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("Лето");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("Осень");
        } else
            System.out.println("Invalid number");

    }
}
