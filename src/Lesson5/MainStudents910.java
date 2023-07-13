package Lesson5;

public class MainStudents910 {
    public static void main(String[] args) {
        Students910[] student = new Students910[14];
        System.out.println("Список всех студентов: ");
        for (int i = 0; i < student.length; i++) {
            student[i] = new Students910();
            System.out.println(student[i].toString());
        }
        System.out.println("Список отличников: ");
        for (int i = 0; i < student.length; i++) {
            if (student[i].mark >= 9) {
                student[i].showinfo();

            } else {
            }
        }
    }
}
