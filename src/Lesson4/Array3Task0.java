package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Array3Task0 {
    public static void main(String[] args) {
        int arr[][][] = new int[2][2][2];
        Random random = new Random();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = random.nextInt(100);
                    arr[i][j][k] = arr[i][j][k] + number;
                    System.out.print(" " + arr[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}


