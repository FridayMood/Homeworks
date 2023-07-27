package Lesson7;

public class Worker {
    private String position;

    public Worker() {
    }

    public Worker(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String setPosition(String position) {
        this.position = position;
        return position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "position='" + position + '\'' +
                '}';
    }
}
