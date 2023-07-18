package Lesson5.Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer comp = new Computer(5.55f, "New");
        comp.print();
        Ram ram = new Ram ("Name", 33f);
        Hdd hdd = new Hdd("Hdd Name", 44f,"Internal");
        Computer comp2 = new Computer(7.77f, "Any",ram, hdd);
        comp2.print();
    }
}
