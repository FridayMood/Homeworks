package Lesson7;

public class Employee implements Info {
private String position;

    public Employee() {
        this.position = "Employee";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + position);
    }
}

