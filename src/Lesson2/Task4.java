package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int t = 0;
        System.out.println("Введите температуру: ");
        Scanner mn = new Scanner(System.in);
        t = mn.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20 && t <= -5) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
    }
}
