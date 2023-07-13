package Lesson4;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 5, 10, -8, 99};
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean check = false;

        for (int k = 0; k < a.length; k++) {
            if (a[k] == i) {
                check = true;
                break;
            }
        }
        if (check == true)
            System.out.println("Массив содержит данное число");
        else {
            System.out.println("Массив не содержит данное число");
        }
    }
}
