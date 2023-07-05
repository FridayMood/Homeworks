package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i;
        System.out.println("Введите число: ");
        Scanner mn = new Scanner(System.in);
        i = mn.nextInt();

        if (i % 2 == 0) {
            System.out.println("Число четное");
        } else if (i % 2 != 0) {
            System.out.println("Число нечетное");
        }
    }
}
