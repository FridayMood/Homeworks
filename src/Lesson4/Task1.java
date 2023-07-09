package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int arr[] = {-7, 0, 88, 100, 3};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            boolean check = false;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == number) {
                    check = true;
                    break;
                } else {
                    check = false;
                }

            }
            if (check == true) {
                System.out.println("Введенное число есть в массиве");
            } else {
                System.out.println("Введенного числа нет в массиве");
            }
        }
        else
        {
            System.out.println("Введено некорректное число");
        }
    }
}
