package Lesson8Exc;

public class WrongLoginExc extends Exception {

    public WrongLoginExc() {
        System.out.println("Неверный логин");
    }

    public WrongLoginExc(String message) {
        super(message);
    }

}
