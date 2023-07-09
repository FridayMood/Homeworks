package Lesson4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 8, 10, 67};
        int arr2[] = {6, 2, 7, -1, 0};
        System.out.println("Array1 values: " + Arrays.toString(arr1));
        System.out.println("Array2 values: " + Arrays.toString(arr2));
        double sum1 = 0;
        double sum2 = 0;
        double avg1;
        for (int b = 0; b < arr1.length; b++) {
            sum1 = sum1 + arr1[b];
        }
        avg1 = sum1 / 5;

        System.out.println("avg value for array1: " + avg1);
        double avg2;
        for (int k = 0; k < arr1.length; k++) {
            sum2 = sum2 + arr2[k];
        }
        avg2 = sum2 / 5;

        System.out.println("avg value for array2: " + avg2);

        if (avg1 < avg2) {
            System.out.println("Среднее арифметическое больше во 2м массиве");
        } else if (avg1 > avg2) {
            System.out.println("Среднее арифметическое больше в 1м массиве");
        } else {
            System.out.println("Среднее арифметические в 2х массивах равны");
        }

    }


}
