package Lesson6;

public class Phone {
    private int number;
    private String model;
    private float weight;

    public Phone(int number, String model, float weight) {
        //this.number = number;
        //this.model = model;
        //this.weight = weight;
        System.out.println("Конструктор с 3мя переменными вызывает конструктор с 2мя переменными: ");
        Phone phone = new Phone(5678976, "iPhone");
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall (String Name)
    {
        System.out.println("Звонит " + Name);
    }
    public void receiveCall (String Name, int number)
    {
        System.out.println("Звонит " + Name + " Номер " + number);
    }
    public void sendMessage (int ... numberArray)
    {
        System.out.println("Телефоны на которые придет смс:");
        for (int i = 0;i<numberArray.length; i++) {
            System.out.println( numberArray[i]);
        }
    }
}
