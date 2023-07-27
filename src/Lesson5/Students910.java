package Lesson5;

import java.util.Random;

public class Students910 {
    String name;
    int group;
    int mark;

    Students910 ()
    {
        Random random = new Random();
        this.name = "should be defined";
        this.group = random.nextInt(900212,900219);
        this.mark = random.nextInt(1,11);
    }

    @Override
    public String toString() {
        return "Students910{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", mark=" + mark +
                '}';
    }
    void showinfo (){
       System.out.println("Name: " + name);
       System.out.println("Group: " + group);
       System.out.println("Mark: " + mark);
       System.out.println();
    }

}
