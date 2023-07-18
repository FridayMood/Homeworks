package Lesson5.Computer;

public class Computer {
    private float price;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(float price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void print ()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
