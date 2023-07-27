package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Student {
    String name;
    int group;
    int mark;


    Student ()
    {
        Random random = new Random();
        this.name = "should be defined";
        this.group = random.nextInt(900212,900219);
        this.mark = random.nextInt(1,11);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }
}
