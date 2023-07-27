package Lesson7;

public class Director extends Worker implements Info {
    public Director() {
        super.setPosition("Director");
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + super.getPosition());

    }
}
