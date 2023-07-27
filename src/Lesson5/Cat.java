package Lesson5;

public class Cat {
    String name;
    int age;
    double foodAmount;

    boolean feed(double feed) {
        if (foodAmount <= feed) {
            return false;
        } else {
            return true;
        }

    }
}

