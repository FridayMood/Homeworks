package Lesson7;

public class Director implements Info {
    private String position;

    public Director() {
        this.position = "Director";
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
