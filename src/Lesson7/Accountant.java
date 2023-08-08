package Lesson7;

public class Accountant extends Worker implements Info {
    public Accountant() {
        super.setPosition("Accountant");
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + super.getPosition());
    }
}
