package Lesson10Collections1;


import java.util.ArrayList;
import java.util.List;

public class CollectionStudent {
    static List<StudentColl> list = List.of(
            new StudentColl("Ivan", "990201", 8),
            new StudentColl("Maria", "990202", 5),
            new StudentColl("Yahor", "990203", 10));

    public static void main(String[] args) {

        System.out.println(list);
        getGoodStudents();

    }

    public static List<StudentColl> getGoodStudents() {
        List<StudentColl> goodStudents = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            StudentColl current = list.get(i);
            if (current.getMark() > 8 && current.getMark() != 0) {
                goodStudents.add(current);
            }
            else
            {
                System.out.println("Student " + current.getName() + " has no correspandant mark");
            }
        }
        System.out.println("The list of students with marh higher than 8: " + goodStudents);
        return goodStudents;

    }
}
