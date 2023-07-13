package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = random.nextInt(100);
        }
        System.out.println("Array values: " + Arrays.toString(arr));
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        double avg;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }

        }
        System.out.println("max value: " + max);

        for (int m = 0; m < arr.length; m++) {
            if (arr[m] < min) {
                min = arr[m];
            }
        }
        System.out.println("min value: " + min);

        for (int b = 0; b < arr.length; b++) {
            sum = sum + arr[b];
        }
        avg = sum / i;

        System.out.println("avg value: " + avg);


    }
}
