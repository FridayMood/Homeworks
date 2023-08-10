package Lesson10Collections1;

import java.util.ArrayList;
import java.util.List;

public class StudentColl {
    private String name;
    private String group;
    private float mark;

    public StudentColl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentColl{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }

    public StudentColl(String name, String group, float mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;




    }
}
