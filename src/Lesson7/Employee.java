package Lesson7;

public class Employee extends Worker implements Info {

    public Employee() {
        super.setPosition("Employee");
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + super.getPosition());
    }
}

