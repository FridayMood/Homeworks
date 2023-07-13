package Lesson4;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[][] = {{-1, 0, -3, 9}, {5, 8, 9, 0}, {4, 2, 3, 4}, {6, 5, 13, 7}};
        for (int i=0;i <arr.length;i++)
        {
            Arrays.sort(arr[i]);
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
