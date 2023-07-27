package Lesson9Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1LongAndShort {
    public static void main(String[] args) {



        String str[]= new String [3];
        for (int i= 0; i<str.length; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку");
            str[i] = sc.nextLine();
        }
        String min = str[0];
        String max = str[0];
        for (int i = 0; i<str.length-1; i++)
        {
            if (str[i].length() >= str[i+1].length())
            {
                min = str[i+1];
            }
            else if(str[i].length() < str[i+1].length())
            min = str[i];
        }
        System.out.println("Min: " + min + " Max: " + max);

    }


}
