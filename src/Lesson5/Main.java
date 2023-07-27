package Lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student [] student = new Student [14];
        for (int i=0; i < student.length; i++)
        {
            student[i] = new Student ();
            System.out.println(student[i].toString());

        }


    }
}
