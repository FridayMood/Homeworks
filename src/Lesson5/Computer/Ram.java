package Lesson5.Computer;

public class Ram {
    private String name;
    private float volume;
    public Ram() {
    }

    public Ram(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void print ()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
