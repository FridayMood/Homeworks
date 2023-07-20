package Lesson7;

public class Accountant implements Info {
    private String position;

    public Accountant() {
        this.position = "Accountant";
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
