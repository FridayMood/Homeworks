package Lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.println("Введите любое целое положительное (>0): ");
        Scanner mn = new Scanner(System.in);
        i = mn.nextInt();
        if (i > 0) {
            for (int k = 1; k < i; k++) {
                sum = sum + k;
            }
            System.out.println("Cумма чисел от 1 до введенного числа: " + sum);
        } else {
            System.out.println("Введите целое положительное число");
        }

    }
}
