package Lesson4;

public class Array2Task3sum {
    public static void main(String[] args) {
        int arr[][] = {{6, 0, -1}, {10, 100, 0}, {-2, 77, 29}};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }

        }
        System.out.print("Sum of all array elements: " + sum);
    }
}
