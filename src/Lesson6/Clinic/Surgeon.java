package Lesson6.Clinic;

public class Surgeon extends Doctors {

    @Override
    public void treat()
    {
        System.out.println("Хирург делает операцию");
    }
}
